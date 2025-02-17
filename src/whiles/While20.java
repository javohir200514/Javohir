package whiles;

import java.util.Scanner;

public class While20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        boolean a=false;
        int sum=0,k=0;
        while(n%10==2){
           a=true;
           break;
        }
        System.out.println(a);

    }
}
