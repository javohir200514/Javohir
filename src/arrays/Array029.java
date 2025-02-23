package arrays;
import java.util.Random;
import java.util.Scanner;

public class Array029 {
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
        for (int i = 0; i < n; i+=2) {
            if(i==n){
                break;
            }
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println();
        System.out.println("odd indexs element of array among max element: "+max);

    }
}
