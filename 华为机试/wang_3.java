package 华为机试;

import java.util.HashMap;
import java.util.Scanner;

public class wang_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] s_splited=s.split(" ");
        //处理每一个事件
        String res="";
        int i=0;
        HashMap<String,Integer> map=new HashMap<>();
        while(i<s_splited.length){
            String tmp[]=s_splited[i].split("|");
            if(map.containsKey(tmp[0])){
                if(tmp[2]=="kill"){
                    res=res+tmp[1]+"killed;";
                    map.remove(s_splited[1]);
                }else if(tmp[2]=="app_accepted"&&map.get(tmp[1])==0){
                    res=res+tmp[1]+"killed;";
                    map.put(tmp[1],1);

                }else if(tmp[2]=="app_accepted"&&map.get(tmp[1])==0){
                    res=res+tmp[1]+"killed;";
                    map.put(tmp[1],1);

                }
                else if(tmp[2]=="app_accepted"&&map.get(tmp[1])==0){
                    res=res+tmp[1]+"killed;";
                    map.put(tmp[1],1);

                }





            }else if(tmp[2]=="start"){
                //不包含但是启动，合法   把他启动
                res=res+tmp[1]+"submitted;";
                map.put(tmp[1],0);
            }else {
                //不包含也不启动，不合法
                continue;
            }


        }




    }

}
