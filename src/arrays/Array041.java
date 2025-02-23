package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array041 {
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
        int max=array[0]+array[1],max1=array[0],max2=array[1];
        for (int i = 1; i < n; i++) {
                 if(max<array[i]+array[i-1]){
                     max1=array[i];
                     max2=array[i-1];
                     max=array[i]+array[i-1];
                 }
        }
        System.out.println();
        System.out.println(max1+" and "+max2);

    }
}
