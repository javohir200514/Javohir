package Integers;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C larni kiriting:");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        int count=(A/C)*(B/C);
        int yuza=A*B-count*C*C;
        System.out.println("Kvadratlar soni:"+count);
        System.out.println("Ortib qolgan yuza:"+yuza);


    }
}
