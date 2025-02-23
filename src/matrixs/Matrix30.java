package matrixs;

import java.util.Scanner;

public class Matrix30 {
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
        int meanArifmetic=0,sum=0,count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                sum+=matrix[j][i];
            }
            meanArifmetic=sum/m;
            System.out.println(i+"-column mean arifmetik value:"+meanArifmetic);
            for (int j = 0; j < m; j++) {
                if(meanArifmetic<matrix[j][i]){
                    count++;
                }
            }
            sum=0;
        }
        System.out.println("count="+count);



    }
}
