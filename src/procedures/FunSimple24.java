package procedures;

import java.util.Scanner;

public class FunSimple24 {
        public static void Even(int k) {
            if(k%2==0){
                System.out.println(true);
            }else System.out.println(false);
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int k = sc.nextInt();
        Even(k);
       }
       }
