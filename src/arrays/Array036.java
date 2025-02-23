package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array036 {
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
        int max=array[0];
        System.out.println();
        System.out.println(" Lokal maximum::");
        for (int i = 2; i < n; i++) {
           if(array[i]<array[i-1]&&array[i-2]<array[i-1]){
                  System.out.print(array[i-1]+" ");
           }else {
               if(max<array[i-1]){
                   max=array[i-1];
               }
           }
        }
        System.out.println();
        System.out.println("No lokal maximum Maximum element="+max);




    }
}
