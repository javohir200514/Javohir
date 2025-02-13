package begins;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A va B laerni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),x;
        x=A;
        A=B;
        B=x;
        System.out.println("A="+A+"    "+"B="+B);
    }
}
