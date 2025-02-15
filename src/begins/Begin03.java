package begins;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("To'g'ri to'rtburchak tomonlarini kiriting=");
        int a=sc.nextInt(),b=sc.nextInt();
        int S,P;
        S=a*b;
        P=2*(a+b);
        System.out.println("Yuzasi="+S);
        System.out.print("Peremetri="+P);
    }
}
