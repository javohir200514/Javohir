package cases;

import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of A and B:A(1;4) and B!=0::");
        double A=sc.nextInt(),B=sc.nextInt();
        System.out.println("Enter number of arithmetic operations( 1 — addition, 2 — subtraction, \n" +
                "3 — multiplication, 4 — division.):");
        int number=sc.nextInt();
        switch(number){
            case 1-> System.out.println(A+B);
            case 2-> System.out.println(A-B);
            case 3-> System.out.println(A*B);
            case 4-> System.out.println(A/B);
        }
    }
}
