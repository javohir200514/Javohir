package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array028 {
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
        int min=array[1];
        for (int i = 1; i < n; i+=2) {
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("even indexs element of array among min element: "+min);

    }
}
