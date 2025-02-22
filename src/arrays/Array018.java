package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Array018 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= (random.nextInt(1,20));
            System.out.print(array[i]+" ");
        }
        int index=0;
        boolean a=false;
        for (int i = 0; i < n; i++) {
            if(array[i]<array[n-1]){
                a=true;
                index=i;
                break;
            }
        }
        if(a){
            System.out.println();
            System.out.print(array[index]);
        }else System.out.println(0);


    }
}
