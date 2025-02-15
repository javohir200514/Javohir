package integers;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Uch xonali son kiriting=");
        int a=sc.nextInt();
        System.out.println("Yuzlar xonasidagi son="+a/100%10);
    }
}
