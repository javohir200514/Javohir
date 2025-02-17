package whiles;

import java.util.Scanner;

import static java.lang.Math.abs;

public class While29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter e:");
        double e=sc.nextDouble(),a1=2,a2=2,ak=0;
        int k=3;
        while(true){
            ak=(a1+2*a2)/3.0;
            if(abs(ak-a2)<e){
                System.out.println(ak+" and "+a2);
                break;
            }
            a1=a2;
            a2=ak;
            k++;
        }
        System.out.print(k);
    }
}




