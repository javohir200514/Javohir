package whiles;

import java.util.Scanner;

public class While27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt(),f1=1,f2=1,fk,count=3,i=3;
        while(i<n){
            fk=f1+f2;
            f1=f2;
            if(n>fk) {
                count++;
            }
            f2=fk;
            i++;
        }
        System.out.print(count);
    }
}
