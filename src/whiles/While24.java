package whiles;

import java.util.Scanner;

public class While24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt(),i=3,f1=1,f2=1,fk;
        boolean a=false;
        while(n>=i){
            fk=f1+f2;
            if(fk==n){
                a=(true);break;
            }
            f1=f2;
            f2=fk;
            i++;
        }
        System.out.println(a);

    }
}
