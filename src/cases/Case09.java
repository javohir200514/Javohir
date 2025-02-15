package cases;

import java.util.Scanner;

public class Case09 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of day:");
        int D=sc.nextInt();
        System.out.println("Enter value of month:");
        int M=sc.nextInt();
        switch(M){
            case 12:{
                switch(D){
                    case 31:{
                        D=1;
                        M=1;
                    }break;
                    default:{
                        D++;
                    }break;

                }
            }break;
            case 1:case 3: case 5: case 7: case 8: case 10:{
                switch(D){
                    case 31:{
                        D=1;
                        M++;
                    }break;
                    default:{
                        D++;
                    }break;

                }
            }break;
            case 2:{
                switch(D){
                    case 28:{
                        D=1;
                        M++;
                    }break;
                    default:{
                        D++;
                    }break;

                }
            }break;
            case 4: case 6: case 9: case 11:{
                switch(D){
                    case 30:{
                        D=1;
                        M++;
                    }break;
                    default:{
                        D++;
                    }break;

                }
            }break;

        }
        System.out.println("M="+M);
        System.out.println("D="+D);


    }
}
