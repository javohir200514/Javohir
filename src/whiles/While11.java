package whiles;

import java.util.Scanner;

public class While11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt(),sum=0,i=0,k=0;
        while(sum<=n){
            k=i;
           sum+=i;
           i++;
        }
        System.out.println(sum);
        System.out.println(" "+k);
    }
}
