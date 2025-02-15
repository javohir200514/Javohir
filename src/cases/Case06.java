package cases;

import java.util.Scanner;

public class Case06 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of length L:(1;5)");
        double L=sc.nextInt();
        System.out.println("Enter units of length: 1 — decimeter, 2 — kilometer, 3 — " +
                "meter, 4 — millimeter, 5 — centimeter.");
        int number=sc.nextInt();
        switch(number){
            case 1-> System.out.println(L*0.1);
            case 2-> System.out.println(L*1000);
            case 3-> System.out.println(L);
            case 4-> System.out.println(L*0.001);
            case 5-> System.out.println(L*0.01);
            default -> System.out.println("Error");
        }
    }
}
