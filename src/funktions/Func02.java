package funktions;

import java.util.Scanner;

public class Func02 {
    public static int RootCount(int a,int b,int c){
       int discremant=b*b-4*a*c;
       if(discremant>0) return (2);
       else if(discremant==0) return (1);
       else return (0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int x=sc.nextInt();
        System.out.println("Enter value of b: ");
        int y=sc.nextInt();
        System.out.println("Enter value of c: ");
        int z=sc.nextInt();
        System.out.println(RootCount(x,y,z));
    }
}
