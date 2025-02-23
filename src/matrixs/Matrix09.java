package matrixs;

import java.util.Scanner;

public class Matrix09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix rows:");
        int m=sc.nextInt();
        System.out.println("Enter matrix cloumns:");
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Even index rows : ");
            for (int i = 0; i < m; i++) {
                for(int j=0;j<n;j++) {
                    if(i%2==0) {
                        System.out.print(matrix[i][j]+"\t");
                    }
                }
                if(i%2==0) {
                    System.out.println();
                }

            }


    }
}
