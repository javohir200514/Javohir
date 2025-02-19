package procedures;

import java.util.Scanner;

public class FunSimple25 {
        public static void  IsSquare(int k) {
            boolean a=false;
            for(int i=0;i<k;i++) {
                if (k==i*i ) {
                    a=true;
                }
            }
            System.out.println(a);
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int k = sc.nextInt();
            IsSquare( k);
       }
       }
