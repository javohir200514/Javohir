package arrays;

import java.util.Scanner;

import static java.lang.Math.round;

public class Array009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=(int)round(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        int count=0;
        System.out.println("\nEven numbers:");
        for (int i =0; i<n; i++) {
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
                count++;
            }
        }
        System.out.println("\nEven number count="+count);

    }
}
