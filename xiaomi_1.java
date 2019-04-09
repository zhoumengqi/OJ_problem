import java.util.Scanner;

public class xiaomi_1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String line;
        while (scan.hasNextLine()) {
//            line = scan.nextLine().trim();
            // please write your code here
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            int d=scan.nextInt();
            int e=scan.nextInt();
            int count=0;
            int map[]=new int[101];
            int t=0;
            for(int i=0;i<101;i++){
                t=i-50;
                map[i]=t*t*t;
            }
//            for(int i=0;i<101;i++){
//                System.out.print(map[i]+" ");
//            }

//            System.out.println(a);
            for(int x1=-50;x1<=50;x1++){
                for(int x2=-50;x2<=50;x2++){
                    for(int x3=-50;x3<=50;x3++){
                        for(int x4=-50;x4<=50;x4++){
                            for(int x5=-50;x5<=50;x5++){
                                if(a*map[x1+50]+b*map[x2+50]+c*map[x3+50]==d*map[x4+50]+e*map[x5+50]){
                                    System.out.println(x1+" "+x2+" "+x3+" "+x4+" "+x5);
                                    if(a!=0&&b!=0&&c!=0&&d!=0&&e!=0&&x1!=0&&x2!=0&&x3!=0&&x4!=0&&x5!=0){
                                        count++;

                                    }
                                }


                            }
                        }
                    }
                }
            }
            System.out.println(count);





            // System.out.println("answer");
        }

    }
}
