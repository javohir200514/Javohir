import java.util.Scanner;

import static java.lang.Math.*;

public class Boolen {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        //1-misol
       /* System.out.println("A ni kiriting=");
        int A=sc.nextInt();
        boolean n=A>0;
        System.out.println(n);*/

        //2-misol
       /* System.out.println("A ni kiriting=");
        int A=sc.nextInt();
        boolean n=A%2!=0;
        System.out.println(n);*/

        //3-misol
       /* System.out.println("A ni kiriting=");
        int A=sc.nextInt();
        boolean n=A%2==0;
        System.out.println(n);*/

        //4-misol
       /* System.out.println("A va B larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A>2&&B<=3;
        System.out.println(n);*/

        //5-misol
       /* System.out.println("A ni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A>=0||B<-2;
        System.out.println(n);
*/
        //6-misol
       /* System.out.println("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A<=B&&B<=C;
        System.out.println(n);*/

        //7-misol
        /*System.out.println("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A<=B&&B<=C;
        System.out.println(n);*/

        //8-misol
        /*System.out.println("A va B sonlarni kiriting:");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A%2!=0&&B%2!=0;
        System.out.println(n);*/

        //9-misol
        /*System.out.println("A va B sonlarni kiriting:");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A%2!=0||B%2!=0;
        System.out.println(n);*/

        //10-misol
        /*System.out.println("A va B sonlarni kiriting:");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A%2!=0&&B%2==0||A%2==0&&B%2!=0;
        System.out.println(n);*/

        //11-misol
        /*System.out.println("A va B sonlarni kiriting:");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A%2==0&&B%2==0||A%2!=0&&B%2!=0;
        System.out.println(n);*/

        //12-misol
        /*System.out.print("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A>0&&B>0&&C>0;
        System.out.println(n);*/

        //13-misol
        /*System.out.print("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A>0&&B>0&&C>0||A<0&&B>0&&C>0||A>0&&B<0&&C>0||A>0&&B>0&&C<0||A>0&&B<0&&C<0||A<0&&B>0&&C<0||A<0&&B<0&&C>0;
        System.out.println(n);*/

        //14-misol
        /*System.out.print("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A>0&&B<0&&C<0||A<0&&B>0&&C<0||A<0&&B<0&&C>0;
        System.out.println(n);*/

        //15-misol
        /*System.out.print("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A<0&&B>0&&C>0||A>0&&B<0&&C>0||A>0&&B>0&&C<0;
        System.out.println(n);*/

        //16-misol
        /*System.out.println("Son kiriting=");
        int a=sc.nextInt();
        boolean n=a>=10&&a<=99&&a%2==0;
        System.out.println(n);*/

        //17-misol
        /*System.out.println("Son kiriting=");
        int a=sc.nextInt();
        boolean n=a>=100&&a<=999&&a%2!=0;
        System.out.println(n);*/

        //18-misol
       /* System.out.print(" 3 ta son kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=a==b&&b==c||a==b&&b!=c||a!=b&&b==c||a==c&&c!=b;
        System.out.println(n);*/

        //19-misol
        /*System.out.print(" 3 ta son kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=(a == -b) || (a == -c) || (b == -c);
        System.out.println(n);*/

        //20-misol
       /* System.out.println("3 xonali son kiriting");
        int son = sc.nextInt(), a = son % 10, b = son / 10 % 10, c = son / 100 % 10;
        boolean n=a!=b&&b!=c;
        System.out.println(n);*/

        //21-misol
        /*System.out.println("3 xonali son kiriting");
        int son = sc.nextInt(), a = son % 10, b = son / 10 % 10, c = son / 100 % 10;
        boolean n=a>b&&b>c;
        System.out.println(n);*/

        //22-misol
        /*System.out.println("3 xonali son kiriting");
        int son = sc.nextInt(), a = son % 10, b = son / 10 % 10, c = son / 100 % 10;
        boolean n=a>b&&b>c||a<b&&b<c;
        System.out.println(n);*/

        //23-misol
        /*System.out.println("3 xonali son kiriting=");
        int n=sc.nextInt(),a=n%10,c=n/100%10;
        boolean b=a==c;
        System.out.println(b);*/

        //24-misol
       /* System.out.println("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        double D=pow(B,2)-4*A*C;
        boolean n=D>=0;
        System.out.println(n);*/

        //25-misol
        /*System.out.println("x va y kordinotalarni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        boolean n=x<0&&y<0;
        System.out.println(n);*/

        //26-misol
        /*System.out.println("x va y kordinotalarni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        boolean n=x>0&&y<0;
        System.out.println(n);*/

        //27-misol
        /*System.out.println("x va y kordinotalarni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        boolean n=x<0;
        System.out.println(n);*/

        //28-misol
        /*System.out.println("x va y kordinotalarni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        boolean n=x>0&&y>0||x<0&&y<0;
        System.out.println(n);*/

        //29-misol
        /*System.out.println("x va y kordinotalarni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println("x1 va y1 kordinotalarni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 kordinotalarni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=(x2>x&&x>x1)&&(y1>y&&y>y2);
        System.out.println(n);*/

        //30-misol
        /*System.out.print(" uchburchak tomonlarini kiriting kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=a==b&&b==c;
        System.out.println(n);*/

        //31-misol
        /*System.out.print("a,b c larni kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=a==b&&b!=c||a!=b&&b==c||a==c&&c!=b;
        System.out.println(n);*/

        //32-misol
        /*System.out.print(" uchburchak tomonlarini  kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=(pow(a,2)+pow(b,2))==pow(c,2);
        System.out.println(n);*/

        //33-misol
       /* System.out.print(" uchburchak tomonlarini  kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=a+b>c&&b+c>a&&a+c>b;
        System.out.println(n);*/

        //34-misol
       /* System.out.println("x va y larni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        boolean n=(x+y)%2==0;
        System.out.println(n);*/

        //35-misol
        /*System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=(x1+y1)%2==0&&(x2+y2)%2==0||(x1+y1)%2!=0&&(x2+y2)%2!=0;
        System.out.println(n);*/

        //36-misol
        /*System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=x1==x2||y1==y2;
        System.out.println(n);*/

        //37-misol
        /*System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=(x2-x1)==1||(y2-y1)==1;
        System.out.println(n);*/

        //38-misol
       /* System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=x1+y1==x2+y2||abs(x2+y2-x1-y1)%2==0;
        System.out.println(n);*/

        //39-misol
        /*System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=x1+y1==x2+y2||abs(x2+y2-x1-y1)%2==0||x1==x2||y1==y2;
        System.out.println(n);*/

        //40-misol
        /*System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=(x2+y2)==x1+y1+1||(x2+y2)==x1+y1+3||(x2+y2-1)==x1+y1;
        System.out.println(n);*/
    }
}
