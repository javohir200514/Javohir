package procedures;

import java.util.Scanner;

public class FunSimple30 {
    public static void     DigitN(int k, int n) {
        int count=0;
        while(k!=0){
            count++;
            if(count==n){
                System.out.println(k%10);
                break;
            }
            k/=10;
        }
        if(count<n){
            System.out.println(-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K:");
        int k = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        DigitN(k,n);

    }
}
