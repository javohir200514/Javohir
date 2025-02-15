package integers;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("999 dan katta son kiriting=");
        int a=sc.nextInt();
        System.out.println("Yuzliklar xonasidagi son="+a/100%10);
    }
}
