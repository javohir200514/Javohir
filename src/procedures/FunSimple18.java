package procedures;

import java.util.Scanner;

public class FunSimple18 {
    public static void   CircleS(double r){
        System.out.println(Math.PI*r*r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<3){
            System.out.println("Enter r:");
            double r = sc.nextDouble();
            CircleS(r);
            i++;
        }


    }
}
