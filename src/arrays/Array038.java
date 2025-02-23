package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array038 {
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
        int count=0;
        for (int i = 2; i < n; i++) {
           if(array[i-2]>array[i-1]&&array[i-1]>array[i]){
               count++;
           }
        }
        System.out.println();
        System.out.println(" parts of ascending count:"+count);

    }
}
