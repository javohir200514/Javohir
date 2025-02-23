package matrixs;

import java.util.Scanner;

public class Matrix29 {
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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                sum+=matrix[i][j];
            }
            meanArifmetic=sum/n;
            System.out.println(i+"-row mean arifmetik value:"+meanArifmetic);
            for (int j = 0; j < n; j++) {
                if(meanArifmetic>matrix[i][j]){
                    count++;
                }
            }
            sum=0;
        }
        System.out.println("count="+count);



    }
}
