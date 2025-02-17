package whiles;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt(),k=1,i=1,pow=1;
        while(i*i<=n){
           pow=i;
           i++;
        }
        System.out.println(pow);

    }
}
