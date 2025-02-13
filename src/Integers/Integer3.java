package Integers;

import java.util.Scanner;

public class Integer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Fayl hajmini kiriting=");
        int hajm=sc.nextInt();
        int kbayt=hajm/1024;
        System.out.println(hajm+" bayt"+"--->"+" "+kbayt+" kb");
    }
}
