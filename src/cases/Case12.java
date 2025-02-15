package cases;

import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of circle:");
        int number=sc.nextInt();
        System.out.println("Enter radius of circle:");
        int radius=sc.nextInt();
        switch(number){
            case 2-> System.out.println("Diametr:" + 2 * radius);
            case 3-> System.out.println("Length of circle:" + 2 * 3.14 * radius);
            case 4-> System.out.println("area of circle:" + 3.14 * radius * radius);
            
        }
    }
}
