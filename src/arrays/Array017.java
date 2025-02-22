package arrays;

import java.util.Scanner;

public class Array017 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        int j=a.length-1;
        System.out.println();
        for(int i=0;i<n/2;i++){
            if(i==j){
                break;
            }
            System.out.print(a[i++]+" ");
            System.out.print(a[i]+" ");
            if(i==j){
                break;
            }
            System.out.print(a[j--]+" ");
            System.out.print(a[j--]+" ");
        }
        if(n%2!=0){
            System.out.println(a[n/2]);
        }

    }
}
