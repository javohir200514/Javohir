package funktions;

import java.util.Scanner;

public class Func11 {
    public static boolean   IsPower5(int k){
        boolean a=false;
        for (int i=1;i<k;i++){
            if(k==i*i*i*i*i){
                a=true;
                break;
            }
        }
        return (a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int a = sc.nextInt();
        System.out.println(  IsPower5(a));
    }
}
