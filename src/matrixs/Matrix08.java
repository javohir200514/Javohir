package matrixs;

import java.util.Scanner;

public class Matrix08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix rows:");
        int m=sc.nextInt();
        System.out.println("Enter matrix cloumns:");
        int n=sc.nextInt();
        System.out.println("Enter k:");
        int k=sc.nextInt();
        int[][] matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(k+" column elements:");
            for (int j = 0; j < m; j++) {
                System.out.println(matrix[j][k]+"\t");
            }


    }
}
