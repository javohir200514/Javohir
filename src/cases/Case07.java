package cases;

import java.util.Scanner;

public class Case07 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of weight L:(1;5)");
        double M=sc.nextInt();
        System.out.println("Enter units of weight: 1 — kilogram, 2 — milligram, 3 — " +
                "gram, 4 — ton, 5 — centner  ");
        int number=sc.nextInt();
        switch(number){
            case 1-> System.out.println(M);
            case 2-> System.out.println(M*0.000001);
            case 3-> System.out.println(M*0.001);
            case 4-> System.out.println(M*1000);
            case 5-> System.out.println(M*100);
            default -> System.out.println("Error");
        }
    }
}
