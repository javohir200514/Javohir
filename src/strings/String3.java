package strings;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter C character:");
        char character=sc.next().charAt(0);
        int a=(int)(character);
        System.out.println((char)((character)-1));
        System.out.println((char)((character)+1));
    }
}
