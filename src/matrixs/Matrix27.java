package matrixs;

import java.util.Scanner;

public class Matrix27 {
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
        int sum=0,minSum=0,result=Integer.MAX_VALUE,index=0;
        for (int i = 0; i < m; i++) {
            minSum=0;
            for (int j = 0; j < n; j++) {
                minSum+=matrix[i][j];
            }
            System.out.println(i+"-index sum"+minSum);
            if(minSum<result) {
                result = minSum;
                index=i;
            }
        }
        System.out.println(index+"-rows the low than other:"+result);
        int maxElement=matrix[index][0];
        for (int i = 0; i < n; i++) {
            if(matrix[index][i]>maxElement){
                maxElement=matrix[index][i];
            }
        }
        System.out.println(index+"-row max element:"+maxElement);

    }
}
