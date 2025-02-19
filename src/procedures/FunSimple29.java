package procedures;

import java.util.Scanner;

public class FunSimple29 {
    public static void     DigitCount(int k) {
        int count=0;
        while(k!=0){
            count++;
            k/=10;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter K:");
            int k = sc.nextInt();
        DigitCount(k);

    }
}
