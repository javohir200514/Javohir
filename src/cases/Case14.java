package cases;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Case14 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of triengle:");
        int number=sc.nextInt();
        System.out.println("Enter radius of triangle:");
        int a=sc.nextInt();
        double R1=a*sqrt(3)/6,R2=2*R1;
        switch(number){
            case 2->
                System.out.println("R1:" + R1);
            case 3-> System.out.println("R2:" +R2);
            case 4-> System.out.println("S:" + pow(a,2)*sqrt(3)/4);
            
        }
    }
}
