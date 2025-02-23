package arrays;
import java.util.Scanner;

public class Array045 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
           array[i]=(int)(Math.random()*100);
            System.out.print(array[i]+" ");
        }
        int near=Math.abs(array[0]-array[1]),min1=array[0],min2=array[1];
        for (int i = 1; i < n; i++) {
            if(near>Math.abs(array[i-1]-array[i])){
                near=Math.abs(array[i-1]-array[i]);
                min1=array[i-1];
                min2=array[i];
            }
        }
        System.out.println();
        System.out.println(min1+" and "+min2);


    }
}
