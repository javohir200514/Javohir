package procedures;

import java.util.Scanner;

public class FunSimple23 {
    public static void   Quarter(int x,int y){
       if(x>0&&y>0){
           System.out.println(1);
       }else if(x<0&&y>0) System.out.println(2);
       else if(x<0&&y<0) System.out.println(3);
       else System.out.println(4);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter coordinata x:");
            int a = sc.nextInt();
            System.out.println("Enter coordinata y:");
            int b= sc.nextInt();
            Quarter(a,b);

    }
}
