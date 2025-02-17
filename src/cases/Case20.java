package cases;

import java.util.Scanner;
public class Case20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of day");
        int day=sc.nextInt();
        System.out.println("Enter value of month");
        int month=sc.nextInt();
        switch(month){
            case 1->{
                if(day>=20)System.out.println("Acuarius");
                else System.out.println("Capricorn");
            }
            case 2->{
                if(day<19) System.out.println("Aquarius");
                else System.out.println("Pickes");
            }
            case 3->{
                if(day<20) System.out.println("Pickes");
                else System.out.println("Aries");
            }
            case 4->{
                if(day<20) System.out.println("Aries");
                else System.out.println("Taurus");
            }
            case 5->{
                if(day<20) System.out.println("Taurus");
                else System.out.println("Gemini");
            }
            case 6->{
                if(day<22) System.out.println("Gemini");
                else System.out.println("Canser");
            }
            case 7->{
                if(day<23) System.out.println("Canser");
                else System.out.println("Leo");
            }
            case 8->{
                if(day<23) System.out.println("Leo");
                else System.out.println("Virgo");
            }
            case 9->{
                if(day<23) System.out.println("Virgo");
                else System.out.println("Libra");
            }
            case 10->{
                if(day<23) System.out.println("Libra");
                 else System.out.println("Scorpio");
            }
            case 11->{
                if(day<23) System.out.println("Scopio");
                else System.out.println("Saggittarius");
            }
            case 12->{
                if(day<22) System.out.println("Saggittarius");
                else System.out.println("Capricorn");
            }
        }

    }
}