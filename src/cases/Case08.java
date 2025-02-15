package cases;

import java.util.Scanner;

public class Case08 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of day:");
        int D=sc.nextInt();
        System.out.println("Enter value of month:");
        int M=sc.nextInt();
        switch(M){
            case 1:{
                switch(D){
                    case 1:{
                        D=31;
                        M=12;
                    }break;
                    default:{
                        D--;
                    }break;

                }
            }break;
            case 2: case 4: case 6: case 8: case 9: case 11:{
                switch(D){
                    case 1:{
                        D=31;
                        M--;
                    }break;
                    default:{
                        D--;
                    }break;

                }
            }break;
            case 3:{
                switch(D){
                    case 1:{
                        D=28;
                        M--;
                    }break;
                    default:{
                        D--;
                    }break;

                }
            }break;
            case 5: case 7: case 10: case 12:{
                switch(D){
                    case 1:{
                        D=30;
                        M--;
                    }break;
                    default:{
                        D--;
                    }break;

                }
            }break;

        }
        System.out.println("M="+M);
        System.out.println("D="+D);


    }
}
