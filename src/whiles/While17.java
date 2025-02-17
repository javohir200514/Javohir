package whiles;

import java.util.Scanner;

public class While17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        double n=sc.nextDouble();
        System.out.println("Enter m:");
        double m=sc.nextDouble(),result=10;
        while(m<=n){
            n-=m;
        }
        System.out.println(n);
    }
}
