package funktions;

import java.util.Scanner;

public class Func08 {
    public static int Quarter(int x,int  y){
        if(x>0&&y>0){
            return (1);
        }else if(x<0&&y>0) return(2);
        else if(x<0&&y<0) return(3);
        else return(4);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x:");
        int a = sc.nextInt();
        System.out.println("Enter y:");
        int b= sc.nextInt();
        System.out.println("quarter="+Quarter(a,b));
    }
}
