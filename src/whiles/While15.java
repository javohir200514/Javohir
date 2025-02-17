package whiles;

import java.util.Scanner;
public class While15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter S:");
        double sum=sc.nextDouble();
        System.out.println("Enter p%:");
        double p=sc.nextDouble(),result=sum;
        int k=0;
        while(2*sum>result){
            result+=sum*p/100.0;
            k++;
        }
        System.out.println(result+sum*p/100);
        System.out.println(++k);
    }
}
