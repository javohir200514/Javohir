package arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array043 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
           array[i]=(int)(Math.random()*10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        int count=0;
        for (int i = 1; i < n-1; i++) {
                if(array[i-1]==array[i]&&array[i]==array[i+1]){
                    i++;
                    count++;
                }else if(array[i-1]==array[i]){
                    count++;
                }
        }
        if(array[n-2]==array[n-1]){
           count++;
        }
        System.out.println("  equal " +
                "values:"+count);

    }
}
