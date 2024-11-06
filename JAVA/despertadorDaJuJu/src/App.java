import java.util.Scanner;
//QUESTÃO 6
public class App {
    public static void main(String[] args) throws Exception {
        int h1;
        int h2;
        int m1;
        int m2;
        int mc=0;
        
        System.out.format("DESPERTA DANI CALCULATOR'S\n<h1><m1>>:<h2><m2>\n");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        do{
         h1 = a.nextInt();
         if(h1 < 0 || h1 > 23 ){System.out.println("INVALIDO");}
        }while(h1 < 0 || h1 > 23);
        do{
         m1 = b.nextInt();
         if(m1 < 0 || m1 > 59 ){System.out.println("INVALIDO");}
        }while(m1 < 0 || m1 > 59);
        System.out.println("------");
        do{
         h2 = c.nextInt();
         if(h2 < 0 || h2 > 23 ){System.out.println("INVALIDO");}
        }while(h2 < 0 || h2 > 23);
        do{
         m2 = d.nextInt();
         if(m2 < 0 || m2 > 59 ){System.out.println("INVALIDO");}
        }while(m2 < 0 || m2 > 59);
        System.out.println("0 0 0 0");
        if(h1>h2 && m1 == m2){mc= ((h1-h2)*60);}
        if(h1>h2 && m1 <  m2){mc= ((h1-h2)*60) + (m2 - m1);}
        if(h1>h2 && m1 >  m2){mc= ((h1-h2)*60) + ((m1-60)*(-1)) + m2;}
        if(h1<h2 && m1 == m2){mc= ((h2-h1)*60);}
        if(h1<h2 && m1 <  m2){mc= ((h2-h1)*60) + (m2 - m1);}
        if(h1<h2 && m1 >  m2){mc= ((h2-h1)*60) + ((m1-60)*(-1)) + m2;}
        if(h1==h2 && m1 == m2){mc= 0;}
        if(h1==h2 && m1 <  m2){mc= m2 - m1;}
        if(h1==h2 && m1 >  m2){mc= (24 * 60)-(m1 - m2);}
        if(h1==23 && m1 <  m2){mc= (m2 - m1) + (h2*60);}
        if(h1==23 && m1 >  m2){mc= ((m1-60)*(-1)) + m2 + (h2*60);}
        
        System.out.format("        [%d] minutos para dormir...  \n",mc);
        
        
                                                                        }
                                                                           }
