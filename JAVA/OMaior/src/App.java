import java.util.Random;
import java.util.Scanner;
/*3. Dado um array A, com N elementos gerados aleatoriamente, obter o
valor do maior elemento. Se houver empate, considerar o conteúdo da
primeira ocorrência. */
public class App {
    public static void main(String[] args)throws Exception{
        int g=0;
 
        System.out.println("DIGITE N ELEMENTOS");
        Scanner s = new Scanner(System.in);
            g = s.nextInt();
        System.out.println("<><><>");
        Random sr = new Random();
        int[]vetor = new int[g];
        for(int i=0; i<g;i++){
        vetor[i] = sr.nextInt(0,100);
        System.out.println(vetor[i]);
        }
        int[] mnum= new int[1];
        mnum[0]=vetor[0];
        for(int j=1;j<g;j++)
        {
          if(vetor[j]>mnum[0])
          {
            mnum[0] = vetor[j];
          }else{mnum[0] = mnum[0]+0;}
        }
        System.out.format("O MAIOR: %d\n",mnum[0]);

                                                                                }
                                                                                    }
