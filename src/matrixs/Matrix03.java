package matrixs;

import java.util.Scanner;

public class Matrix03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix rows:");
        int m=sc.nextInt();
        System.out.println("Enter matrix cloumns:");
        int n=sc.nextInt();
        int[] k=new int[m];
        System.out.println("Enter numbers:");
        for (int i = 0; i < m; i++) {
            k[i]=(int)(Math.random()*100);
        }
        int[][] matrix=new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                   matrix[j][i]=k[j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
