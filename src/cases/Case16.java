package cases;

import java.util.Scanner;

public class Case16 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int N=sc.nextInt();
        switch(N/10%10){
            case 2-> System.out.print("twenty ");
            case 3-> System.out.print("Thirty ");
            case 4-> System.out.print("forty ");
            case 5-> System.out.print("fifty ");
            case 6-> System.out.print("sixty ");

        }
        System.out.print("-");
        switch(N%10){
            case 1-> System.out.print("one  ");
            case 2-> System.out.print("two ");
            case 3-> System.out.print("three ");
            case 4-> System.out.print("four ");
            case 5-> System.out.print("five ");
            case 6-> System.out.print("six ");
            case 7-> System.out.print("seven ");
            case 8-> System.out.print("eight ");
            case 9-> System.out.print("nine ");
        }
        System.out.println("years");




    }
}
