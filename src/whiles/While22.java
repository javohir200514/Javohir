package whiles;

import java.util.Scanner;

public class While22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt(),i=1,count=0;
        while(i<=n){
            if(n%i==0){
            count++;}
             i++;
        }
        if(count==2) System.out.println(true);
        else System.out.println(false);

    }
}
