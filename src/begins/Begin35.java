package begins;

import java.util.Scanner;

public class Begin35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("1-avtomobil tezligini kiriting=");
        int V1=sc.nextInt();
        System.out.print("2-avtomobil tezligini kiriting=");
        int V2=sc.nextInt();
        System.out.print(" vaqtni kiriting=");
        int T=sc.nextInt();
        int S=(V1+V2)*T;
        System.out.println(T+" vaqtdan keyin ular orasidagi masofa:"+S);
    }
}
