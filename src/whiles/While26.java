package whiles;

import java.util.Scanner;

public class While26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt(),i=3,f1=1,f2=1,fk,max=0,min=0;
        while(i<n){
            fk=f1+f2;
            if(fk>n){
                max=fk;
            }else{
                min=fk;
            }
            f1=f2;
            f2=fk;
            i++;
        }
        System.out.print(min+" and "+max);
    }
}
