package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of month:");
        int number=sc.nextInt();
        switch(number){
            case 12:case 1:case 3:case 5:case 7:case 8:case 10: System.out.print(31);break;
            case 4:case 6: case 9: case 11: System.out.print(30);break;
            case  2: System.out.print(28);break;
            default :
                System.out.println("Error");

        }
    }
}
