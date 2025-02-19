package procedures;

import java.util.Scanner;

public class FunSimple27 {
    public static void     IsPowerN(int k,int  n) {
        boolean a=false;
        for (int i=1;i<k;i++){
            if(k==n){
                a=true;
                break;
            }
            n*=n;
        }
        System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter k:");
            int k = sc.nextInt();
            System.out.println("Enter n:");
            int n = sc.nextInt();
            IsPowerN(k, n);
    }
}
