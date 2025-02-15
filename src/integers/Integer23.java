package integers;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sekundlar sonini kiriting=");
        int N=sc.nextInt();
        System.out.println("Kun boshidan boshlab "+N/3600+" soat"+" va "+(N/60)%60+" minut "+N%60+" sekund o'tdi");

    }
}
