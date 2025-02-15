package begins;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Begin05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a entery=");
        int a=sc.nextInt();
        int V,S;
        V=(int)pow(a,3);
        S=(int)(6*pow(a,2));
        System.out.println("V="+V+" "+"S="+S);
    }
}
