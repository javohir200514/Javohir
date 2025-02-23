package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array032 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=random.nextInt(1,50);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(" first Lokal mimimum:");
        for (int i = 2; i < n; i++) {
           if(array[i]>array[i-1]&&array[i-2]>array[i-1]){
               System.out.print(array[i-1]);
               break;
           }
        }



    }
}
