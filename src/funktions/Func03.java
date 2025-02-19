package funktions;

import java.util.Scanner;

public class Func03 {
    public static double CircleS(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int r=sc.nextInt();
        System.out.print("area of circle:"+CircleS(r));
    }
}
