package strings;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number(1;26):");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print((char)('A'+i));
        }

    }
}
