package begins;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Begin19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("To'rtburchak 1-uchi kordinotasini kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("To'rtburchak 2-uchi kordinotasini kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        int peremetr=2*(abs(x1-x2)+abs(y1-y2));
        int yuza=abs(x1-x2)*abs(y1-y2);
        System.out.println("peremetri="+peremetr);
        System.out.println("Yuzasi="+yuza);
    }
}
