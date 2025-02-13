package begins;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Begin17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A,B,C nuqtalarni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        int AC=abs(A-C),BC=abs(B-C);
        int length=AC+BC;
        System.out.println("AC="+AC+"   "+"BC="+BC+"   "+"Kesmalar uzunligi="+length);
    }
}
