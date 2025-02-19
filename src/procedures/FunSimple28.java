package procedures;

import java.util.Scanner;

public class FunSimple28 {
    public static void     IsPrime(int n) {
        int count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(true);
        }else System.out.println(false);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter n:");
            int n = sc.nextInt();
            IsPrime(n);

    }
}
