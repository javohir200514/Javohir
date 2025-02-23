package matrixs;

import java.util.Scanner;

public class Matrix17 {
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
        int sum=0,product=1;
        for (int j = 0; j < m; j++) {
                sum+=matrix[j][k];
                product*=matrix[j][k];
        }
        System.out.println(k+" row elements sum:"+sum);
        System.out.println(k+" row elements product:"+product);
    }
}
