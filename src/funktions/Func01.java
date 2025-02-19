package funktions;

import java.util.Scanner;

public class Func01 {
    public static int Sign(int x,int y){
        int a,b;
        if(x<0){
            a=(-1);
        }else if(x==0) a=(0);
        else a=(1);
        if(y<0){
            b=(-1);
        }else if(y==0) b=(0);
        else b=(1);
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of X: ");
        int x=sc.nextInt();
        System.out.println("Enter value of Y: ");
        int y=sc.nextInt();
        System.out.println(Sign(x,y));
    }
}
