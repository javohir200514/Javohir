package matrixs;

import java.util.Scanner;

public class Matrix31 {
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
        int totolSum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totolSum+=matrix[i][j];
            }
        }
        int  totolMeanArifmetic=totolSum/(m*n);
        System.out.println("Totol mean arifmetic:"+totolMeanArifmetic);
        int meanArifmetic=0,sum=0,min=Integer.MAX_VALUE,index=0,near=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                sum+=matrix[j][i];
            }
            meanArifmetic=sum/m;
            System.out.println(i+"-column mean arifmetik value:"+meanArifmetic);
                if(Math.abs(meanArifmetic-totolMeanArifmetic)<min){
                min=Math.abs(meanArifmetic-totolMeanArifmetic);
                index=i;
                near=meanArifmetic;
                }
            sum=0;
        }

        System.out.println(index+"-meanArifmetic:"+near);



    }
}
