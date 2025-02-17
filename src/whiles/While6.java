package whiles;

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt(),k=1;
        while(n>0&&n!=1){
           k*=n;
           n-=2;
        }
        System.out.println(k);

    }
}
