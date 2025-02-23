package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array035 {
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
        int min= Integer.MAX_VALUE;
        System.out.println();
        System.out.println(" Lokal maximum::");
        for (int i = 2; i < n; i++) {
           if(array[i]<array[i-1]&&array[i-2]<array[i-1]){
              if(array[i]<min){
                  System.out.println(array[i-1]+" ");
                  min=array[i-1];
              }
           }
        }
        System.out.println("Maximum lokal maximum:"+min);



    }
}
