package begins;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Begin20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-nuqta koordinotasini kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("2-nuqta koordinotasini kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        double distance;
        distance=sqrt(pow(x2-x1,2)+pow(y2-y1,2));
        System.out.println("2 ta nuqta orasidagi masofa ="+distance);
    }
}
