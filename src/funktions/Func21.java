package funktions;

import java.util.Scanner;

public class Func21 {
    public static int  Fib(int n) {
        if(n<=2){
            return 1;
        }
        int f1=1,f2=1,f=0;
        for(int i=3;i<=n;i++){
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(n+"-fibonaccci number "+Fib(n));
    }
}
