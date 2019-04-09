public class isNumeric {

    public boolean isNumeric(char[] str) {
        //不适合排除法，因为合法字符很少，非法字符过多，
        int count_dian=0;
        int count_e=0;
        int i=0;
        while(i<str.length){
            if(str[i]=='-'||str[i]=='+'){
                if(i==0){
                    //合法
                }else if(str[i-1]=='e'||str[i-1]=='E'){

                    if(count_e==0){
                        count_e++;
                    }else{
                        return false;//出现了多个e
                    }
                    //e后面不能出现小数点
                    int j=i;
                    while(j<str.length){
                        if(str[i]=='.'){
                            return false;
                        }
                        j++;
                    }
                }else{
                    return false;
                }

            }else if(str[i]>='0'&&str[i]<='9'){
                //合法

            }else if(str[i]=='.'){

                if(count_dian==0){
                    count_dian++;
                }else{
                    return false;//出现了多个dian
                }
            }
            i++;
        }
        return true;

    }

    public static void main(String[] args) {
//        char chs[]={'5','e','2'};
        char chs[]={'1','2','e','4','3'};

        System.out.println(new isNumeric().isNumeric(chs));
    }
}
