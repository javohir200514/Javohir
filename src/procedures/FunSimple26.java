package procedures;

import java.util.Scanner;

public class FunSimple26 {
    public static void    IsPower5(int k) {
        boolean a=false;
        for (int i=1;i<k;i++){
            if(k==i*i*i*i*i){
                a=true;
                break;
            }
        }
        System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter k:");
            int k = sc.nextInt();
            IsPower5(k);
    }
}
