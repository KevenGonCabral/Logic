import java.util.Scanner;
import java.lang.Math;
/*5. Calcular a média X e o desvio padrão S de um conjunto de números reais
dispostos em um array v de tamanho n. Tanto n quanto os valores de v
devem vir do teclado. Seguem as equações de X e S*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("<><><>Desvio Padrao<><><>");
        System.out.println("DIGITE QUANTAS NOTAS DA MANTISSA");
        int N,soma=0,vsoma=0;
        int X;
        int V;
        Scanner b = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        N = a.nextInt();
        System.out.println("CADASTRAR NOTAS");
        int[]v = new int[N];
        int[]S = new int[N];
        for(int i=0;i<N;i++)
{
        v[i]=b.nextInt();        
}
        for(int i=0;i<N;i++)
{
        soma=v[i]+soma;        
}
        X=soma/N;
        for(int i=0;i<N;i++)
{
        S[i]=(v[i]-X)*(v[i]-X);
        if(S[i]< 0){S[i]= S[i]*(-1);}                
} 
for(int i=0;i<N;i++)
{
        vsoma=S[i]+vsoma;        
}
        V=vsoma/N;
       
       Double raiz = Math. sqrt(V);
       System.out.format("\nDesvio Padrao = %.2f \n",raiz);


                                            
                                                                     }
                                                                        }
