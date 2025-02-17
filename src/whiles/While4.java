package whiles;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        boolean a=true;
        int n=sc.nextInt(),k=1,b;
        b=n;
        while(n%3==0){
            k*=3;
            n/=3;
        }
        if(k==b){
            System.out.println(a);
        }
        else{
            a=false;
            System.out.println(a);
        }

    }
}
