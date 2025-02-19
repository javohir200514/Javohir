package funktions;

import java.util.Scanner;

public class Func16 {
    public static boolean  IsPalindrome(int k) {
        int result=0,b=k;
        boolean a;
         while(k!=0){
             result=result*10+k%10;
             k/=10;
         }
         if(result==b) a=true;
         else a=false;
         return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter K numsber:");
        int k = sc.nextInt();
        System.out.println(IsPalindrome(k));
    }
}
