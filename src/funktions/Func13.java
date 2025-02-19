package funktions;

import java.util.Scanner;

public class Func13 {
    public static boolean     IsPrime(int n) {
        int count=0;
        boolean a;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            a=(true);
        }else a=(false);
        return a;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(  IsPrime(n));
    }
}
