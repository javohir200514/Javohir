package cases;

import java.util.Scanner;

public class Case10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter direction:");
        char A=sc.next().charAt(0),result=0;
        System.out.println("Enter instruction:");
        int N=sc.nextInt();
        switch(N){
            case 1->{
                switch(A) {
                    case 'N' ->result='E';
                    case 'S' ->result='W';
                    case 'W' ->result='N';
                    case 'E' ->result='S';

                }
            }
            case -1->{
                switch(A) {
                    case 'N' ->result='N';
                    case 'S' ->result='S';
                    case 'W' ->result='W';
                    case 'E' ->result='E';

                }
            }
            case 2->{
                switch(A) {
                    case 'N' ->result='S';
                    case 'S' ->result='N';
                    case 'W' ->result='E';
                    case 'E' ->result='W';

                }
            }
        }
        System.out.print(result);
    }
}
