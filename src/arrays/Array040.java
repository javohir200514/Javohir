package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array040 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter R:");
        int r=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
           array[i]=random.nextInt(1,50);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        int min=Math.abs(array[0]-r),min_element=array[0];
        for(int i=1;i<n;i++){
            if(min>Math.abs(array[i]-r)){
                min_element=array[i];
                min=Math.abs(array[i]-r);
            }
        }
        System.out.println();
        System.out.println("nearst to number R is:"+min_element);

    }
}
