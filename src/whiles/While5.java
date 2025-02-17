package whiles;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K:");
        int k=sc.nextInt(),i=0,b=1;
        while(k>i){
            b*=2;
            i++;
        }
        System.out.println(b);

    }
}
