package begins;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Begin21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-nuqta kordinotasini kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("2-nuqta kordinotasini kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        System.out.println("3-nuqta kordinotasini kiriting=");
        int x3=sc.nextInt(),y3=sc.nextInt();
        double a=sqrt(pow(x2-x1,2)+pow(y2-y1,2));//3
        double b=sqrt(pow(x3-x1,2)+pow(y3-y1,2));//1
        double c=sqrt(pow(x3-x2,2)+pow(y3-y2,2));//4
        double S,P_yarim=(a+b+c)/2,P;
        S=sqrt(P_yarim*(P_yarim-a)*(P_yarim-b)*(P_yarim-c));
        P=a+b+c;
        System.out.println("S="+S+"    "+"P="+P);
    }
}
