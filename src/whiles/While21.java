package whiles;

import java.util.Scanner;

public class While21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        boolean a=false;
        while(n%2!=0){
           a=true;
           break;
        }
        System.out.println(a);

    }
}
