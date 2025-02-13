package Integers;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sekundlar sonini kiriting=");
        int N=sc.nextInt();
        System.out.println("Kun boshidan boshlab "+N/60+" minut"+" va "+N%60+" sekund o'tdi");
    }
}
