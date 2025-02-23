package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array042 {
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
        int near=Math.abs(array[0]+array[1]-r),min1=array[0],min2=array[1];
        for (int i = 1; i < n; i++) {
                if(near>Math.abs(array[i-1]+array[i]-r)){
                    min1=array[i];
                    min2=array[i-1];
                    near=Math.abs(array[i-1]+array[i]-r);
                }
        }
        System.out.println();
        System.out.println(min1+" and "+min2);

    }
}
