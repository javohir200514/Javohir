package matrixs;

import java.util.Scanner;

public class Matrix15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix rows and colums:");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        int number=1,a=0,b=n-1,c=n-1,d=0;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++) {
                if(i==a){
                    matrix[i][j]=number;
                    number++;

                }else if(i==c){
                    matrix[j][n-1]=number;
                    number++;
                }

            }

        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();

        }



    }
}
