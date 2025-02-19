package funktions;

import java.util.Scanner;

public class Func14 {
    public static int     DigitCount(int k) {
        int count=0;
        while(k!=0){
            count++;
            k/=10;
        }
        return (count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K:");
        int k = sc.nextInt();
        System.out.println(DigitCount(k));

    }
}
