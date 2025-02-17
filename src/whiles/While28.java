package whiles;

import java.util.Scanner;

import static java.lang.Math.abs;

public class While28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter e:");
        double e=sc.nextDouble(),a1=2,ak=0;
        int k=2;
        while(true){
            ak=2+1.0/a1;
            if(abs(ak-a1)<e){
                System.out.println(ak+" and "+a1);
                break;
            }
            a1=ak;
            k++;
        }
        System.out.print(k);
    }
}




