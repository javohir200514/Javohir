package cases;

import java.util.Scanner;

public class Case15 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter suit of card:");
        int number=sc.nextInt();
        System.out.println("Enter number of card:");
        int N=sc.nextInt();
        switch(number){
            case 1->{
                switch(N){
                    case 6-> System.out.println("six of ");
                    case 7-> System.out.println("seven of ");
                    case 8-> System.out.println("eight of ");
                    case 9-> System.out.println("nine of ");
                    case 10-> System.out.println("ten of ");
                    case 11-> System.out.println("Jack of ");
                    case 12-> System.out.println("Queen of ");
                    case 13-> System.out.println("King  of ");
                    case 14-> System.out.println("Ace of ");
                    default -> System.out.println("Error");
                }
                System.out.println("spades");

            }
            case 2->{
                switch(N){
                    case 6-> System.out.println("six of ");
                    case 7-> System.out.println("seven of ");
                    case 8-> System.out.println("eight of ");
                    case 9-> System.out.println("nine of ");
                    case 10-> System.out.println("ten of ");
                    case 11-> System.out.println("Jack of ");
                    case 12-> System.out.println("Queen of ");
                    case 13-> System.out.println("King  of ");
                    case 14-> System.out.println("Ace of ");
                    default -> System.out.println("Error");
                }
                System.out.println("clubs");

            }
            case 3->{
                switch(N){
                    case 6-> System.out.println("six of ");
                    case 7-> System.out.println("seven of ");
                    case 8-> System.out.println("eight of ");
                    case 9-> System.out.println("nine of ");
                    case 10-> System.out.println("ten of ");
                    case 11-> System.out.println("Jack of ");
                    case 12-> System.out.println("Queen of ");
                    case 13-> System.out.println("King  of ");
                    case 14-> System.out.println("Ace of ");
                    default -> System.out.println("Error");
                }
                System.out.println("diamonds");

            }
            case 4->{
                switch(N){
                    case 6-> System.out.println("six of ");
                    case 7-> System.out.println("seven of ");
                    case 8-> System.out.println("eight of ");
                    case 9-> System.out.println("nine of ");
                    case 10-> System.out.println("ten of ");
                    case 11-> System.out.println("Jack of ");
                    case 12-> System.out.println("Queen of ");
                    case 13-> System.out.println("King  of ");
                    case 14-> System.out.println("Ace of ");
                    default -> System.out.println("Error");
                }
                System.out.print("hearts");

            }

            default->System.out.println("Error");
        }
    }
}
