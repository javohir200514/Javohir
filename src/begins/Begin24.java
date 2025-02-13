package begins;

import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C laerni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),x,y,z;
        x=A;
        z=C;
        y=B;
        C=A;
        B=z;
        A=y;
        System.out.println("A="+A+"    "+"B="+B+"   "+"C="+C);
    }
}
