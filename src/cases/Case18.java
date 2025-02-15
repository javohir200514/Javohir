package cases;

import java.util.Scanner;
public class Case18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (100-999):");
        int N = sc.nextInt();
        switch (N / 100) {
            case 1 -> System.out.print("one");
            case 2 -> System.out.print("two");
            case 3 -> System.out.print("three");
            case 4 -> System.out.print("four");
            case 5 -> System.out.print("five");
            case 6 -> System.out.print("six");
            case 7 -> System.out.print("seven");
            case 8 -> System.out.print("eight");
            case 9 -> System.out.print("nine");
        }
        System.out.print(" hundred");
        int remainder = N % 100;
        if (remainder > 0) {
            System.out.print(" and ");
            if (remainder >= 10 && remainder < 20) {
                switch (remainder) {
                    case 10 -> System.out.print("ten");
                    case 11 -> System.out.print("eleven");
                    case 12 -> System.out.print("twelve");
                    case 13 -> System.out.print("thirteen");
                    case 14 -> System.out.print("fourteen");
                    case 15 -> System.out.print("fifteen");
                    case 16 -> System.out.print("sixteen");
                    case 17 -> System.out.print("seventeen");
                    case 18 -> System.out.print("eighteen");
                    case 19 -> System.out.print("nineteen");
                }
            } else {
                switch (remainder / 10) {
                    case 2 -> System.out.print("twenty");
                    case 3 -> System.out.print("thirty");
                    case 4 -> System.out.print("forty");
                    case 5 -> System.out.print("fifty");
                    case 6 -> System.out.print("sixty");
                    case 7 -> System.out.print("seventy");
                    case 8 -> System.out.print("eighty");
                    case 9 -> System.out.print("ninety");
                }
                switch (remainder % 10) {
                    case 1 -> System.out.print("-one");
                    case 2 -> System.out.print("-two");
                    case 3 -> System.out.print("-three");
                    case 4 -> System.out.print("-four");
                    case 5 -> System.out.print("-five");
                    case 6 -> System.out.print("-six");
                    case 7 -> System.out.print("-seven");
                    case 8 -> System.out.print("-eight");
                    case 9 -> System.out.print("-nine");
                }
            }
        }
    }
}
