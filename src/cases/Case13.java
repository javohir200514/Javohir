package cases;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Case13 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of triengle:");
        int number=sc.nextInt();
        System.out.println("Enter radius of triangle:");
        int a=sc.nextInt();
        double c=sqrt(2)*a,h=c/2;
        switch(number){
            case 2->
                System.out.println("c:" + sqrt(2)*a);
            case 3-> System.out.println("h:" + c/2);
            case 4-> System.out.println("S:" + c*h/2);
            
        }
    }
}
