package integers;

import java.util.Scanner;

public class Integer01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Uzunlikni kiriting=");
        int L=sc.nextInt();
        int metr=L/100;
        System.out.println(L+" sm"+"--->"+" "+metr+" metr");
    }
}
