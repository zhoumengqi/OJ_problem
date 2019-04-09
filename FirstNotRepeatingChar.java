import sun.util.resources.hr.CalendarData_hr;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) return -1;
        ArrayList<Character> list = new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                int time=map.get(str.charAt(i));
                map.put(str.charAt(i),++time);
            }else{
                map.put(str.charAt(i),1);

            }
        }
        int res=-1;
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                res=i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new FirstNotRepeatingChar().FirstNotRepeatingChar("googgle"));
    }
}
