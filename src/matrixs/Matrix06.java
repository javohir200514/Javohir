package matrixs;

import java.util.Scanner;

public class Matrix06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix rows:");
        int m=sc.nextInt();
        System.out.println("Enter matrix cloumns:");
        int n=sc.nextInt();
        System.out.println("Enter q:");
        int q=sc.nextInt();
        System.out.println("Enter numbers:");
        int[][] matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            matrix[0][i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < n; i++) {
            for(int j=1;j<m;j++){
                matrix[j][i]=matrix[j-1][i]*q;

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
