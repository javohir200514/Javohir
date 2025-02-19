package funktions;

import java.util.Scanner;

public class Func15 {
    public static int   DigitN(int k, int n) {
        int count=0,result=0;
        while(k!=0){
            count++;
            if(count==n){
                result=(k%10);
                break;
            }
            k/=10;
        }
        if(count<n){
            return(-1);
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K:");
        int k = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(DigitN(k,n));

    }
}
