package matrixs;

import java.util.Scanner;

public class Matrix07 {
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
        System.out.println(k+" row elements:");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[k][j]+"\t");
            }


    }
}
