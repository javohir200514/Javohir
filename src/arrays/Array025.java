package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array025 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        double d=(double)(array[1]/array[0]);
        int j=0,count=0;
        for(int i=0;i<n;i++){
            j++;
            if(j==n){
                break;
            }
            if((double)(array[j]/array[i])!=d){
                System.out.println(0);

                return ;
            }
        }
        System.out.println();
        System.out.println(d);


    }
}
