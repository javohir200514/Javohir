package cases;

import java.util.Scanner;

public class Case17 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int N=sc.nextInt();
        switch(N){
            case 10->System.out.println("Ten");
            case 11-> System.out.println("eleven");
            case 12-> System.out.println("twelve");
            case 13-> System.out.println("thirteen");
            case 14-> System.out.println("fourteen");
            case 15-> System.out.println("fifteen");
            case 16-> System.out.println("sixteen");
            case 17-> System.out.println("seventeen");
            case 18-> System.out.println("eighteen");
            case 19-> System.out.println("nineteen");
        }
        switch(N/10%10){
            case 2-> System.out.print("Twenty ");
            case 3-> System.out.print("thirty ");
            case 4-> System.out.print("fouty ");

        }
        System.out.print("-");
        switch(N%10){
            case 1-> System.out.print(" first ");
            case 2-> System.out.print("second ");
            case 3-> System.out.print("third ");
            case 4-> System.out.print("four ");
            case 5-> System.out.print("five ");
            case 6-> System.out.print("six ");
            case 7-> System.out.print("seven ");
            case 8-> System.out.print("eight ");
            case 9-> System.out.print("nine ");
        }
        System.out.println(" task");




    }
}
