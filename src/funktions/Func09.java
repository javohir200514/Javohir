package funktions;

import java.util.Scanner;

public class Func09 {
    public static boolean Even(int k){
        if(k%2==0){
            return(true);
        }else return(false);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int a = sc.nextInt();
        System.out.println( Even(a));
    }
}
