package arrays;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class Array007 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=(int)round(Math.random()*100);
        }
        for (int i =n-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }

    }
}
