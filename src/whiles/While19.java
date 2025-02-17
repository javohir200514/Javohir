package whiles;

import java.util.Scanner;

public class While19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int sum=0,k=0;
        while(n!=0){
           sum=sum*10+n%10;
           n/=10;
        }
        System.out.println("sum of digits: "+sum);

    }
}
