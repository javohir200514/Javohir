package begins;

import java.util.Scanner;

public class Begin08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a and b entery=");
        int a=sc.nextInt(),b=sc.nextInt();
        double orta_arifmetik;
        orta_arifmetik=(double)(a+b)/2;
        System.out.println("O'rta arifmetigi="+orta_arifmetik);
    }
}
