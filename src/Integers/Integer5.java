package Integers;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A kesma uzunligini kiriting=");
        int A=sc.nextInt();
        System.out.println("B kesma uzunligini kiriting=");
        int B=sc.nextInt();
        System.out.println("A kesmaga B kesmani "+A/B+" marta joylashtirish mumkin");
        System.out.println("A kesmaga B kesmaning joylashmay qolgan qismi "+A%B+" qismi joylashmay qoladi");
    }
}
