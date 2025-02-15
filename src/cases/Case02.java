package cases;

import java.util.Scanner;

public class Case02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of K:");
        int number=sc.nextInt();
        switch(number){
            case 1-> System.out.print("bad");
            case 2-> System.out.print("unsatisfactory");
            case 3-> System.out.print("mediocre");
            case 4-> System.out.print("good");
            case 5-> System.out.print("excellent");
            default->System.out.print("Error");
        }
    }
}
