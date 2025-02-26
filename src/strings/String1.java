package strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter c character:");
        char character=sc.next().charAt(0);
        System.out.println((int)(character));
    }
}
