package 华为机试;

import java.util.*;

public class last_word_length {

    int[] location = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};

    public static int fun(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        } else {
            return c - 'A';
        }


    }

    public String[] findWords(String[] words) {
        String res = "";
        for (String s : words) {
            char chs[] = s.toCharArray();
            boolean flag = true;
            for (int i = 0; i < chs.length - 1; i++) {

                if (location[fun(chs[i])] != location[fun(chs[i + 1])]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res += (s + " ");

            }

        }
        return res.split(" ");
    }

    public int NumberOf1(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n = n & (n - 1);

        }
        return c;
    }

    public static void main(String[] args) {
//        String s[]={"Hello", "Alaska", "Dad", "Peace"};
//        System.out.println(new last_word_length().mySqrt(2147395600));

//        System.out.println(7/3*3);
//        TreeNode node = new TreeNode(1);
////        TreeNode node2 = new TreeNode(2);
////        TreeNode node3 = new TreeNode(3);
////        TreeNode node4 = new TreeNode(4);
////        TreeNode node5 = new TreeNode(5);
////        node.left = node2;
////        node.right = node3;
//////        node2.left = node4;
//////        node3.right = node5;
////        for (int s : new last_word_length().postorderTraversal(node))
////            System.out.println(s);

//        int a[] = {2,6};
//        ArrayList<ArrayList<Integer>> res = new last_word_length().combinationSum(a, 19);
//
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size(); j++) {
//                System.out.print(res.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
//        int a[]={1,2,3,3,3,3,4,5,9};
////        int res[]=new last_word_length().searchRange(a,3);
////        for (int i:res
////             ) {
////            System.out.print(i+" ");
////        }
//        System.out.println(new last_word_length().pow(19,-21000000));
//        int a[][] = {{1, 2}};
//        System.out.println(new last_word_length().searchMatrix(a,2));
//        System.out.println(new last_word_length().grayCode(4));
//        ListNode l1 = new ListNode(3);
//        ListNode l2 = new ListNode(2);
//        ListNode res=new last_word_length().mergeTwoLists(l1,l2);
//        while(res!=null){
//            System.out.println(res.val);
//            res=res.next;
//        }

//        System.out.println(new last_word_length().match("(()))))", 0, 0));
        int a[] = {10, 20, 150, 200, 23, 9, 67};
//        System.out.println(new last_word_length().findmax(a));
//        System.out.println(new last_word_length().findPeak(a, a.length));
//        int max=10000000;
//        a=new int[max] ;
//        for (int i=0;i<max;i++)
//            a[i]=(int)(Math.random()*1000);
//        long s = System.currentTimeMillis();
//        new last_word_length().quicksort(a,0,a.length-1);
//        long e = System.currentTimeMillis();
//        System.out.println("快排花费时间为："+(e-s)/1000.0+"秒");//快排花费时间为：19.964秒
//        //调包花费的时间
//        long s2 = System.currentTimeMillis();
//        Arrays.sort(a);
//
//        long e2 = System.currentTimeMillis();
//        System.out.println("调包花费时间为："+(e2-s2)/1000.0+"秒");
//        for(int i=0;i<10;i++){
//            System.out.print(a[i]+" ");
//        }
//        ArrayList<String []> res=new last_word_length().solveNQueens(4);
//        for(int i=0;i<res.size();i++){
//            String s[]=res.get(i);
//            for(int j=0;j<s.length;j++){
//                System.out.println(s[j]);
//            }
//            System.out.println();
//        }
//        System.out.println(new last_word_length().lengthOfLongestSubstring("qopubjguxhxdipfzwswybgfylqvjzhar"
//        ));
//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(1);
//        ListNode l3 = new ListNode(2);
//        l1.next=l2;
//        l2.next=l3;
//        ListNode res=(new last_word_length().deleteDuplicates(l1));
//
//                while(res!=null){
//            System.out.println(res.val);
//            res=res.next;
//        }
        int aa[]={1,2,2,2,3};
        new last_word_length().permuteUnique(aa);
    }
    public ArrayList<String> anagrams(String[] strs) {
        ArrayList<String> res=new ArrayList<String>();
        Map<String,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] a=s.toCharArray();
            Arrays.sort(a);
            s=new String(a);
            if(map.containsKey(s)){
                int index=map.get(s);
                set.add(index);
                set.add(i);
            }else{
                map.put(s,i);
            }
        }
        Iterator iter =set.iterator();
        while(iter.hasNext()){
            Integer x=(Integer)iter.next();
            res.add(strs[x]);
        }
        return res;
    }
    public int sumNumbers(TreeNode root) {
        return search(root,0);
    }
    public int search(TreeNode root,int sum){
        if (root==null) return 0;
        if(root.left==null&&root.left==null){
            return sum*10+root.val;
        }
        return search(root.left,sum*10+root.val)+search(root.right,sum*10+root.val);
    }



    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        //本题使用到了归并排序
        if(lists.size()==0) return null;
        ListNode head=lists.get(0);
        for(int i=1;i<lists.size();i++){
            head=mergeTwoList(head,lists.get(i));
        }
        return head;

    }
    public  ListNode  mergeTwoList(ListNode head1,ListNode head2){
        ListNode res=new ListNode(-1);
        while(head1!=null&&head2!=null){
            if(head1.val<head2.val){
                res.next=head1;
                head1=head1.next;
            }else{
                res.next=head2;
                head2=head2.next;
            }

        }
        res.next=head1==null?head2:head1;
        return res;
    }



    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        boolean isused[]=new boolean[num.length];
        Arrays.fill(isused,false);
        Arrays.sort(num);
        dfs(num,temp,res,isused,0);
        return res;
    }
    public void dfs(int[] num ,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> res,boolean isused[],int start){
        if(start==num.length){
            res.add(new ArrayList(temp));
            return ;
        }
        for(int i=0;i<num.length;i++){
            if(!isused[i]){
                temp.add(num[i]);
                isused[i]=true;
                dfs(num,temp,res,isused,start+1);
                temp.remove(temp.size()-1);
                isused[i]=false;
                while(i<num.length-1&&num[i]==num[i+1])i++;
            }
        }



    }
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmplist=new ArrayList<Integer>();
        search(res,tmplist,root,0,sum);
        return res;
    }
    public void search(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> tmplist,TreeNode root,int cursum,int sum){
        if(root==null){
            return ;
        }
        ArrayList tmp=new ArrayList(tmplist);
        tmp.add(root.val);
        cursum+=root.val;
        if(root.left==null&&root.right==null){
            if(cursum==sum){
                res.add(tmplist);
            }
            return;
        }
        search(res,tmp,root.left,cursum,sum);
        search(res,tmp,root.right,cursum,sum);
    }



    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode h=new ListNode(-1);
        ListNode h_result=h;
        h.next=head;
        ListNode pre=h;
        h=h.next;
        while(h!=null&&h.next!=null){
            if(h.val!=h.next.val){
                h=h.next;
                pre=pre.next;
            }else{
                ListNode tmp=h;
                while(h!=null&&tmp.next!=null&&h.val==tmp.next.val){
                    tmp=tmp.next;
                }
                pre.next=tmp.next;
                h=pre.next;

            }
        }
        return h_result.next;

    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int maxLength=1;
        char chs[]=s.toCharArray();
        int strLength=s.length();
        int index=1,left=0;
        while(index<strLength){
            int tmpindex=left;
            for(int i=left;i<index;i++){
                if(chs[i]==chs[index]) {
                    tmpindex=i+1;
                    break;
                }
            }

            maxLength=Math.max(maxLength,index-tmpindex+1);
            left=tmpindex;

            index++;
        }
        return maxLength;
    }



    public String convert(String s, int nRows) {
        if(nRows<=1||s.length()<=1) return s;
        int len=s.length();
        int col=((len/(2*nRows-2))+1)*(nRows-1);
        char chs[][]=new char[nRows][col];
        int i=0,j=0;
        int index=0;
        boolean flag=false;//用来标记填充的方向
        while(index<s.length()){
            chs[i][j]=s.charAt(index++);
            if(i==0){
                i++;
                flag=false;
            }else if(i==nRows-1){
                i--;
                j++;
                flag=true;
            }else{
                if(flag){
                    i--;
                    j++;
                }else{
                    i++;
                }
            }
        }
        String res="";
        for(int ii=0;ii<nRows;ii++){
            for(int jj=0;jj<col;jj++){
                if(chs[ii][jj]!=' ') res+=chs[ii][jj];
            }
        }
        return res;
    }



    public int numDistinct(String S, String T) {
        if(S==null || T==null || S.length()==0 || T.length()==0 || S.length()<T.length()) return 0;
        int m=S.length();
        int n=T.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=m;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(S.charAt(j-1)!=T.charAt(i-1)){
                    dp[i][j]=dp[i][j-1];
                }else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j-1];
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }



        return dp[n][m];
    }










    public double pow(double x, int n) {
        if(n==0) return 1.0;
        double half=pow(x,n/2);
        if(n%2==0){
            return half*half;
        }else if(n>0){//奇数只需区分正负
            return half*half*x;
        }else{
            return half*half/x;
        }


    }






    int map[];
    ArrayList<String []> res;
    public ArrayList<String[]> solveNQueens(int n) {
        res=new ArrayList();
        map =new int[n];
        Arrays.fill(map,-1);
        backtrack(n,0);
        return res;
    }
    public void backtrack(int n ,int k){
        if(k>=n){
            //找到了一个，生成结果
            String tmp[]=new String[n];
            for(int i=0;i<n;i++){
                String s="";
                for(int j=0;j<n;j++){
                    if(map[i]==j){
                        s+='Q';
                    }else{
                        s+='.';
                    }
                }
                tmp[i]=s;
            }
            res.add(tmp);
            return ;
        }
        for(int i=0;i<n;i++){
            map[k]=i;
            if(isplace(k)){

                backtrack(n,k+1);
            }
        }
    }
    public boolean isplace(int k){
        //判断各列和对角线是否满足
        for(int i=0;i<k;i++){
            if(map[k]==map[i]||(k-i==Math.abs(map[k]-map[i]))){
                return false;
            }
        }
        return true;
    }






    //快速排序实现
    public void quicksort(int a[],int left,int right){
        int i,j,t,temp;
        if (left>right) return;
        temp=a[left];
        i=left;
        j=right;
        while(i!=j){
            while(a[j]>=temp&&i<j) j--;
            while(a[i]<=temp&&i<j)i++;
            if(i<j){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        //将基准数字归位
        a[left]=a[i];
        a[i]=temp;
        quicksort(a,left,i-1);
        quicksort(a,i+1,right);

    }













    //在一个先增长后减小的数组中找到最大值{100, 20, 15, 2, 23, 90, 670}找到里面的峰值
    //使用二分法
    public int findmax(int a[]) {
        int low = 0, high = a.length - 1;
        int max = 0;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (mid == 0) return a[0];
            if (mid == a.length - 1) return a[a.length - 1];
            if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) return a[mid];
            if (a[mid - 1] > a[mid]) high = mid - 1;

            else if (a[mid + 1] > a[mid]) low = mid + 1;

        }
        return a[high];

    }

    // 来自http://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
    int findPeakUtil(int arr[], int low, int high, int n) {
        int mid = low + (high - low) / 2;  /* (low + high)/2 */

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;

        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);

        else return findPeakUtil(arr, (mid + 1), high, n);
    }

    // A wrapper over recursive function findPeakUtil()
    int findPeak(int arr[], int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }


    //不用栈实现括号匹配
    public boolean match(String s, int state, int index) {
        if (index == s.length()) {
            if (state == 0) {
                return true;
            } else {
                return false;
            }

        }
        if (state < 0) return false;
        if (s.charAt(index) == '(') return match(s, state + 1, index + 1);
        if (s.charAt(index) == ')') return match(s, state - 1, index + 1);
        return true;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2;
        ListNode head = new ListNode(-1);
        ListNode r = head;
        while (p != null && q != null) {
            if (q.val > p.val) {
                r.next = p;
                p = p.next;
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;

        }
        while (p != null) {
            r.next = p;
            p = p.next;
            r = r.next;
        }
        while (q != null) {
            r.next = q;
            q = q.next;
            r = r.next;
        }
        return head.next;
    }


    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) return list;
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode tmpNode = q.poll();
            list.add(tmpNode.val);
            if (tmpNode.left != null) {
                q.add(tmpNode.left);
            }
            if (tmpNode.right != null) {
                q.add(tmpNode.right);
            }


        }
        return list;
    }

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList();
        if (n <= 0) return list;
        generate(n, 0, 0, "", list);
        return list;
    }

    public void generate(int n, int x, int y, String s, ArrayList list) {
        if (y == n) {//右括号用完了，添加一个值
            list.add(s);
        }
        if (x < n) {//左括号还没有用完，优先用左括号

            generate(n, x + 1, y, s + '(', list);
        }
        if (x > y) {
            //添加右括号
            generate(n, x, y + 1, s + ')', list);
        }
    }


    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num = 1 << n;
        for (int i = 0; i < num; ++i) {
            arr.add(i >> 1 ^ i);
//            System.out.print(arr.get(i)+" ");
        }
        return arr;
    }


    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = matrix.length - 1, j = 0; i >= 0 && j < matrix[0].length; ) {
            if (matrix[i][j] < target) {
                j++;
            } else if (matrix[i][j] == target) {
                return true;
            } else {
                i--;
            }
        }
        return false;


    }



    public int[] searchRange(int[] A, int target) {
        int f = -1;
        int e = -1;
        int res[] = new int[2];
        int low = 0;
        int high = A.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) >> 1;
            if (A[mid] == target) {
                f = e = mid;
                int tmp_mid = mid;
                int tmp_high = tmp_mid;

                while (low < tmp_high) {
                    tmp_mid = (low + tmp_high) >> 1;
                    if (A[tmp_mid] == target) {
                        f = tmp_mid;
                        tmp_high = tmp_mid;
                    } else {
                        low = tmp_mid + 1;
                    }
                }
                low = mid;
                while (low <= high) {
                    tmp_mid = (low + high) >> 1;
                    if (A[tmp_mid] == target) {
                        e = tmp_mid;
                        low = tmp_mid + 1;
                    } else {
                        high = tmp_mid - 1;
                    }


                }


                break;

            } else if (A[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        res[0] = f;
        res[1] = e;
        return res;


    }


//    public ArrayList<ArrayList<Integer>> res = new ArrayList();
//
//    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        res.clear();
//        int cur_res[] = new int[candidates.length * 3];
//        sum(candidates, target, 0, cur_res, target, 0);
//        return res;
//    }

//    //   k表示当前在使用candidates的哪个数，cre_res结果集，cur_sum,当前还剩下的值，index：cur_res的索引
////    public void sum(int[] candidates, int target, int k, int[] cur_res, int cur_sum, int index) {
////        if (cur_sum < 0) {
////            return;
////        }
////        if (cur_sum == 0) {
////            ArrayList<Integer> r = new ArrayList<Integer>();
////            for (int i = 0; i < index; i++) {
////                if (cur_res[i] != 0) {
////                    r.add(cur_res[i]);
////                }
////            }
//////            if (r.size() == 0) return;
////            res.add(r);
////            return;
////
////        }
////        if (k >= candidates.length) return;
////        if (index >= cur_res.length) return;
////        cur_res[index] = candidates[k];
////        sum(candidates, target, k, cur_res, cur_sum - candidates[k], index + 1);
////        cur_res[index] = 0;
////        if (k + 1 >= candidates.length) return;
////        sum(candidates, target, k + 1, cur_res, cur_sum, index);
////    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        TreeNode p = null;
        TreeNode cur = root;
        ArrayList<Integer> result = new ArrayList();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.add(cur);
                cur = cur.left;
            } else {
                cur = stack.peek();
                cur = cur.right;

                if (cur != null && p != cur) {
                    stack.add(cur);
                    cur = cur.left;
                } else {
                    cur = stack.pop();
                    result.add(cur.val);
                    p = cur;
                    cur = null;
                }

            }
        }
        return result;
    }

    public int mySqrt(int x) {
        double x_1 = (float) x;
        double xn = x_1 / 2;
        for (int i = 0; i < 10000; i++) {
            xn = xn + (x_1 / xn - xn) * 0.5;

        }
        return (int) Math.floor(xn);


    }

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int row = triangle.size();
        Integer min = 99999999;
        for (int i = 1; i < row; i++) {
            ArrayList tmp = triangle.get(i);
            for (int j = 0; j < tmp.size(); j++) {
                if (j == 0) {
                    triangle.get(i).set(j, triangle.get(i - 1).get(j));
                } else if (j == tmp.size() - 1) {
                    triangle.get(i).set(j, triangle.get(i - 1).get(j - 1));

                } else {
                    triangle.get(i).set(j, Math.min(triangle.get(i - 1).get(j), triangle.get(i - 1).get(j - 1)));

                }

            }

        }
        ArrayList<Integer> lastrow = triangle.get(row - 1);
        for (int i = 0; i < lastrow.size(); i++) {
            if (lastrow.get(i) < min) {
                min = lastrow.get(i);
            }
        }
        return min;


    }

    ArrayList<String> result = new ArrayList();

    public ArrayList<String> letterCombinations(String digits) {
        result.clear();
        char map[][] = {{'a', 'b', 'c'}
                , {'d', 'e', 'f'}
                , {'g', 'h', 'i'}
                , {'j', 'k', 'l'}
                , {'m', 'n', 'o'}
                , {'p', 'q', 'r', 's'}
                , {'t', 'u', 'v'}
                , {'w', 'x', 'y', 'z'}};
        char s[] = digits.toCharArray();
        ArrayList<char[]> l = new ArrayList();
        for (int i = 0; i < s.length; i++) {
            l.add(map[s[i] - '2']);
        }
        String cur_res = "";
        combine(s, l, cur_res, 0);
        return result;
    }

    public void combine(char s[], ArrayList<char[]> l, String cur_res, int index) {
        if (index == s.length) {
            result.add(cur_res);
            return;
        }
        for (int i = 0; i < l.get(index).length; i++) {
            combine(s, l, cur_res + l.get(index)[i], index + 1);
        }


    }
}

