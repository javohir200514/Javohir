package funktions;

import java.util.Scanner;

public class Func12 {
    public static boolean IsPowerN(int k,int  n) {
        boolean a=false;
        for (int i=1;i<k;i++){
            if(k==n){
                a=true;
                break;
            }
            n*=n;
        }
        return (a);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int k = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(  IsPowerN(k,n));
    }
}
