package begins;

import java.util.Scanner;

public class Begin6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Parallelepiped tomonlarini kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int V,S;
        V=a*b*c;
        S=(a*b+b*c+a*c);
        System.out.print("V="+V+"  "+"S="+S);
    }
}
