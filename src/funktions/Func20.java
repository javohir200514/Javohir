package funktions;

import java.util.Scanner;

public class Func20 {
    public static int  Fact2(int n) {
        int fact=1;
        if(n%2!=0){
        for (int i = 1; i <=n; i+=2) {
            fact*=i;
        }
        }else{
            for (int i = 2; i <=n; i+=2) {
                fact*=i;
        }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(Fact2(n));
    }
}
