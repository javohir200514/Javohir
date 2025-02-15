package integers;

import java.util.Scanner;

public class Integer08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("2 xonali son kiriting=");
        int a=sc.nextInt();
        System.out.println("Swap="+(a%10*10+a/10%10));
    }

}
