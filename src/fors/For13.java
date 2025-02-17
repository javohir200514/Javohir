package fors;

import java.util.Scanner;


public class For13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        double sum=0,count=0,a=1.1;
        for(int i=1;i<=n;i++){
            if(count%2==0){
                sum+=a;
            }else{
                sum-=a;
            }
            a+=0.1;
            count++;
        }
        System.out.print("value :"+sum);
    }
}
