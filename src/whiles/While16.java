package whiles;

import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p%:");
        double p=sc.nextDouble(),result=10;
        int k=0;
        while(200>result){
            result+=result*p/100.0;
            k++;
        }
        System.out.println(result);
        System.out.println(++k);
    }
}
