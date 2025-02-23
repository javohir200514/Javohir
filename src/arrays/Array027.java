package arrays;
import java.util.Scanner;

public class Array027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt(),first=0;
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        boolean a=false;
        for(int i=1;i<n;i++){
           if(array[i]>0&&array[i-1]>0||array[i]<0&&array[i-1]<0){
               first=array[i];
               a=true;
               break;
           }
        }
        if(a){
            System.out.println();
            System.out.println(" first element " +
                    "that breaks :"+first);
        }else{
            System.out.println();
            System.out.println(0);
        }

    }
}
