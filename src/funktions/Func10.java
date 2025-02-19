package funktions;

import java.util.Scanner;

public class Func10 {
    public static boolean  IsSquare(int k){
        boolean a=false;
        for(int i=0;i<k;i++) {
            if (k==i*i ) {
                a=true;
            }
        }
        return(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int a = sc.nextInt();
        System.out.println(  IsSquare(a));
    }
}
