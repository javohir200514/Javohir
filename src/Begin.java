
import java.util.Scanner;

import static java.lang.Math.*;

public class Begin {
    public static void main (String[] arg){
        //2-misol
       /* Scanner Sc=new Scanner(System.in);
        System.out.print("Kvadrat tomonini kiriting=");
        int a=Sc.nextInt();
        int S=a*a;
        System.out.print("Yuza="+S);*/

        //3-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.print("To'g'ri to'rtburchak tomonlarini kiriting=");
        int a=sc.nextInt(),b=sc.nextInt();
        int S,P;
        S=a*b;
        P=2*(a+b);
        System.out.println("Yuzasi="+S);
        System.out.print("Peremetri="+P);*/

        //4-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Diametr enter=");
        int d=sc.nextInt();
        double L;
        L=2*3.14*d;
        System.out.print("Length="+L);*/

        //5-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.print("a entery=");
        int a=sc.nextInt();
        int V,S;
        V=(int)pow(a,3);
        S=(int)(6*pow(a,2));
        System.out.println("V="+V+" "+"S="+S);*/

        //6-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Parallelepiped tomonlarini kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int V,S;
        V=a*b*c;
        S=(a*b+b*c+a*c);
        System.out.print("V="+V+"  "+"S="+S);*/

        //7-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Doira radiusini kiriting=");
        int r=sc.nextInt();
        double L,S;
        L=2*3.14*r;
        S=3.14*pow(r,2);
        System.out.print("L="+L+"  "+"S="+S);*/

        //8-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.print("a and b entery=");
        int a=sc.nextInt(),b=sc.nextInt();
        double orta_arifmetik;
        orta_arifmetik=(double)(a+b)/2;
        System.out.println("O'rta arifmetigi="+orta_arifmetik);*/

        //9-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("a and b entery=");
        int a=sc.nextInt(),b=sc.nextInt();
        double orta_geometrik;
        orta_geometrik=sqrt(a*b);
        System.out.println("O'rta geometrigi="+orta_geometrik);*/

        //10-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("2 number entery=");
        int a=sc.nextInt(),b=sc.nextInt();
        int sum,kopaytma,kvadrat_a,kvadrat_b;
        sum=a+b;
        kopaytma=a*b;
        kvadrat_a=(int)(pow(a,2));
        kvadrat_b=(int)(pow(b,2));
        System.out.println("Yig'indisi="+sum+"  "+"Ko'paytmasi="+kopaytma+"   "+"a ni kvadrati="+kvadrat_a+"   "+"b ni kvadrati="+kvadrat_b);
*/

        //11-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("2 number entery=");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("a ni muduli="+abs(a));
        System.out.println("b ni moduli="+abs(b));*/

        //12-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("katetlarni kiriting=");
        int a=sc.nextInt(),b=sc.nextInt();
        double c=sqrt(pow(a,2)+pow(b,2));
        double P=a+b+c;
        System.out.println("Gipatenuzasi="+c+"   "+"Peremetri="+P);*/

        //13-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Aylana radiuslarini kiriting=");
        int R1=sc.nextInt(),R2=sc.nextInt();
        double S1=3.14*R1,S2=3.14*R2;
        double S3=3.14*(R1-R2);
        System.out.println("S1="+S1+"  "+"S2="+S2+"   "+"S3="+S3);*/

        //14-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Ayalana uzunligini kiriting=");
        double L=sc.nextDouble();
        System.out.println(" ");
        double R=L/(2*3.14);
        double S=3.14*pow(R,2);
        System.out.println("R="+R);
        System.out.println("S="+S);*/

        //15-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Yuzani kiriting=");
        double S=sc.nextDouble();
        double R=Math.sqrt(S/Math.PI);
        System.out.println("R="+R);*/

        //16-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("2 ta nuqta kiriting=");
        int x1=sc.nextInt(),x2=sc.nextInt();
        int distance=abs(x1-x2);
        System.out.println("Masofa="+distance);*/

        //17-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("A,B,C nuqtalarni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        int AC=abs(A-C),BC=abs(B-C);
        int length=AC+BC;
        System.out.println("AC="+AC+"   "+"BC="+BC+"   "+"Kesmalar uzunligi="+length);*/

        //18-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("A,B,C nuqtalarni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        int AC=abs(A-C),BC=abs(B-C);
        System.out.println("AC*BC="+AC*BC);*/

        //19-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("To'rtburchak 1-uchi kordinotasini kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("To'rtburchak 2-uchi kordinotasini kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        int peremetr=2*(abs(x1-x2)+abs(y1-y2));
        int yuza=abs(x1-x2)*abs(y1-y2);
        System.out.println("peremetri="+peremetr);
        System.out.println("Yuzasi="+yuza);*/
        //20-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("1-nuqta koordinotasini kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("2-nuqta koordinotasini kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        double distance;
        distance=sqrt(pow(x2-x1,2)+pow(y2-y1,2));
        System.out.println("2 ta nuqta orasidagi masofa ="+distance);*/

        //21-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("1-nuqta kordinotasini kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("2-nuqta kordinotasini kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        System.out.println("3-nuqta kordinotasini kiriting=");
        int x3=sc.nextInt(),y3=sc.nextInt();
        double a=sqrt(pow(x2-x1,2)+pow(y2-y1,2));//3
        double b=sqrt(pow(x3-x1,2)+pow(y3-y1,2));//1
        double c=sqrt(pow(x3-x2,2)+pow(y3-y2,2));//4
        double S,P_yarim=(a+b+c)/2,P;
        S=sqrt(P_yarim*(P_yarim-a)*(P_yarim-b)*(P_yarim-c));
        P=a+b+c;
        System.out.println("S="+S+"    "+"P="+P);*/

        //22-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("A va B laerni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),x;
        x=A;
        A=B;
        B=x;
        System.out.println("A="+A+"    "+"B="+B);*/

        //23-misol

        /*Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C laerni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),x,y,z;
        x=A;
        z=C;
        y=B;
        B=A;
        C=y;
        A=z;
        System.out.println("A="+A+"    "+"B="+B+"   "+"C="+C);*/

        //24-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C laerni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),x,y,z;
        x=A;
        z=C;
        y=B;
        C=A;
        B=z;
        A=y;
        System.out.println("A="+A+"    "+"B="+B+"   "+"C="+C);*/

        //25-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.print("x ni kiriting=");
        int x=sc.nextInt();
        double y;
        y=3*pow(x,6)-6*pow(x,2)-7;
        System.out.println("y="+y);
        */

        //26-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("x ni kiriting=");
        int x=sc.nextInt();
        double y;
        y=4*pow(x-3,6)-7*pow(x-3,3)+2;
        System.out.println("y="+y);*/

        //27-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("A ni kiriting=");
        int A=sc.nextInt();
        System.out.println(pow(A, 2));
        System.out.println(pow(A, 4));
        System.out.println(pow(A, 8));*/

        //28-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("A ni kiriting=");
        int A=sc.nextInt();
        System.out.println(pow(A, 2));
        System.out.println(pow(A, 3));
        System.out.println(pow(A, 5));
        System.out.println(pow(A, 10));
        System.out.println(pow(A, 15));*/

        //29-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Burchakni kiriting=");
        int burchak=sc.nextInt();
        double radian= PI/180*burchak;
        System.out.println("Radian="+radian);
*/
        //30-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Radianni kiriting=");
        double radian=sc.nextDouble();
        double burchak= (180/PI*radian);
        System.out.println("Burchak="+burchak);*/

        //31-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("T_F=");
        double T_F=sc.nextDouble();
        double T_c=(5*(T_F-32))/9;
        System.out.println("Tc="+T_c);*/

        //33-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Konfet og'irligini kiriting=");
        double X=sc.nextDouble();
        System.out.println("Konfet narxini kiriting=");
        double A=sc.nextDouble();
        double narx=A/X;
        System.out.println("Nechi kg kanfet olishingizni kiriting=");
        double Y=sc.nextDouble();
        System.out.println("1 kg konfet narxi=" + narx);
        System.out.println(Y+" "+"kg konfet narxi "+Y*narx);*/

        //34-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Shokolod umumiy og'rligini kiriting=");
        double X=sc.nextDouble();
        System.out.println("Shokolod umumiy narxini kiriting=");
        double A=sc.nextDouble();
        System.out.println("Konfet umumiy og'rligini kiriting=");
        double Y=sc.nextDouble();
        System.out.println("Konfet umumiy narxini kiriting=");
        double B=sc.nextDouble();
        double narx_shokolod = A / X, narx_konfet = B / Y;
        System.out.println("1 kg shokolod 1 kg konfetdan "+(narx_shokolod-narx_konfet)+" so'm qimmat turadi");
*/

        //35-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Qayiq tezligini kiriting=");
        double V=sc.nextDouble();
        System.out.println("Oqim tezligini kiriting=");
        double U=sc.nextDouble();
        System.out.println("Qayiqni oqim bo'ylab yurgan vaqtini  kiriting=");
        double T1=sc.nextDouble();
        System.out.println("Oqimga qarshi yurgan vaqtini  kiriting=");
        double T2=sc.nextDouble();
        double S=(U+V)*T1+(V-U)*T2;
        System.out.println("S="+S);*/

        //36-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.print("1-avtomobil tezligini kiriting=");
        int V1=sc.nextInt();
        System.out.print("2-avtomobil tezligini kiriting=");
        int V2=sc.nextInt();
        System.out.print(" vaqtni kiriting=");
        int T=sc.nextInt();
        int S=(V1+V2)*T;
        System.out.println(T+" vaqtdan keyin ular orasidagi masofa:"+S);*/

        //37-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.print("1-avtomobil tezligini kiriting=");
        int V1=sc.nextInt();
        System.out.print("2-avtomobil tezligini kiriting=");
        int V2=sc.nextInt();
        System.out.print(" vaqtni kiriting=");
        int T=sc.nextInt();
        int S=abs(V1-V2)*T;
        System.out.println(T+" vaqtdan keyin ular orasidagi masofa:"+S);*/

        //38-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("A ni kiriting");
        double A=sc.nextDouble();
        System.out.println("B ni kiriting");
        double B=sc.nextDouble();
        double x;
        x=-B/A;
        System.out.println("x=" + x);*/

        //39-misol
       /* Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C kofetsientlarni kiriting=");
        double A=sc.nextDouble();
        double B=sc.nextDouble();
        double C=sc.nextDouble();
        double diskremant=sqrt(pow(B,2)-4*A*C);
        double x1=(-B+sqrt(diskremant))/2,x2=(-B-sqrt(diskremant))/2;
        System.out.println(A+"x^2+"+B+"x+"+C+"=0 tenglama ildizi="+x1+" va"+" x2="+x2);*/

        //40-misol
        /*Scanner sc=new Scanner(System.in);
        System.out.println("A1,B1 va C1 kofetsientlarni kiriting=");
        double A1=sc.nextDouble();
        double B1=sc.nextDouble();
        double C1=sc.nextDouble();
        System.out.println("A2,B2 va C2 kofetsientlarni kiriting=");
        double A2=sc.nextDouble();
        double B2=sc.nextDouble();
        double C2=sc.nextDouble();
        double D=A1*B2-A2*B1;
        double x=(C1*B2-C2*B1)/D,y=(A1*C2-A2*C1)/D;
        System.out.println("x=" + x);
        System.out.println("y="+y);*/

    }
}
