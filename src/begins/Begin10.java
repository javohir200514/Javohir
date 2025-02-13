package begins;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Begin10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("2 number entery=");
        int a=sc.nextInt(),b=sc.nextInt();
        int sum,kopaytma,kvadrat_a,kvadrat_b;
        sum=a+b;
        kopaytma=a*b;
        kvadrat_a=(int)(pow(a,2));
        kvadrat_b=(int)(pow(b,2));
        System.out.println("Yig'indisi="+sum+"  "+"Ko'paytmasi="+kopaytma+"   "+"a ni kvadrati="+kvadrat_a+"   "+"b ni kvadrati="+kvadrat_b);

    }
}
