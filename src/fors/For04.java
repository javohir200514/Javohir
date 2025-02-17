package fors;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter price of 1 kg sweet::");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(i+" kg -->"+(i*a)+" ");
        }
    }
}
