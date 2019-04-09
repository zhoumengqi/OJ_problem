public class 并查集母版 {
    //给出10W条人和人之间的朋友关系，求出这些朋友关系中有多少个朋友圈
    // （如A-B、B-C、D-E、E-F，这4对关系中存在两个朋友圈），并给出算法的时间复杂度。


    //朋友圈-并查集
    int set[]=new int[10001];
    int find(int x)
    {
        int i, j, r;
        r = x;
        while (set[r] != r) //寻找此集合的代表
            r = set[r];
        i = x;
        while (i != r) //使得r代表的集合中，所有结点直接指向r，即路径压缩
        {
            j = set[i];
            set[i] = r;
            i = j;
        }
        return r;
    }
    void merge(int x, int y)
    {
        int t = find(x);
        int h = find(y);
        if (t < h)
            set[h] = t;
        else
            set[t] = h;
    }
    int friends(int n, int m, int r[][])  //n个人，m对好友关系，存放在二维数组r[m][2]中
    {
        int i, count;
        for (i = 1; i <= n; i++)
            set[i] = i;
        for (i = 0; i < m; i++)
            merge(r[i][0], r[i][1]);
        count = 0;
        for (i = 1; i <= n; i++)
        {
            if (set[i] == i)
                count++;
        }
        return count;
    }
}
