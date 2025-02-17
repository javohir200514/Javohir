package whiles;

import java.util.Scanner;

public class While14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        double a=sc.nextDouble(),sum=0,i=1,k=0;
        while(sum<=a){
            k=i;
            sum+=1.0/i;
            i++;
        }
        System.out.println(sum-1.0/k);
    }
}
