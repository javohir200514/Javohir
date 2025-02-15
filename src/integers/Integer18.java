package integers;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("999 dan katta son kiriting=");
        int a=sc.nextInt();
        System.out.println("Yuzliklar xonasidagi son="+a/1000%10);
    }
}
