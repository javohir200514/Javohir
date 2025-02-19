package procedures;

import java.util.Scanner;

public class FunSimple02 {
    public static void PowerA234(double a){
        System.out.println(a*a);
        System.out.println(a*a*a);
        System.out.println(a*a*a*a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one real number:");
        double a=sc.nextDouble();
        PowerA234(a);
    }
}
