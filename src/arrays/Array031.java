package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array031 {
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
        int count=0;
        System.out.println("Greater than left neigbor elements indexs:");
        for (int i = 1; i < n; i++) {
           if(array[i-1]<array[i]){
               System.out.print(i+" ");
               count++;
           }
        }
        System.out.println();
        System.out.println("count="+count);


    }
}
