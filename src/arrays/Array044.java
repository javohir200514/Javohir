package arrays;
import java.util.Scanner;

public class Array044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
           array[i]=sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if(array[i-1]==array[i]&&array[i-1]==array[i+1]){
                i+=2;
                continue;
            }
                if(array[i-1]==array[i]){
                    i++;
                    continue;
                }else {
                    System.out.print(array[i-1]+" ");
                }
        }
        if(array[n-2]!=array[n-1]){
            System.out.print(array[n-1]);
        }

    }
}
