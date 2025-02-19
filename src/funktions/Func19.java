package funktions;

import java.util.Scanner;

public class Func19 {
    public static int  Fact(int n) {
        int fact=1;
        for (int i = 2; i <=n; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println(Fact(n));
    }
}
