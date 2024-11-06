import java.util.Scanner;

public class App {
    /*2. Dado um array A, com N elementos inteiros, obter quantos são pares,
impares, positivos, negativos e neutros */
    public static void main(String[] args) throws Exception {
        System.out.println("DIGITE N DE ELEMENTOS");
        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);
        int n = A.nextInt();
        System.out.println("PREENCHA");

        int[]vetor = new int[n];
        for(int i=0;i<n;i++)
        {
            vetor[i]=B.nextInt();
        }
        int pares=0,impar=0,cont,positivo=0,negativo=0,neutro=0;
        for(int i=0;i<n;i++)
        {   
            cont=vetor[i]%2;
            if(cont == 0){pares++;}else{impar++;}
            if(vetor[i]>0){positivo++;}else{neutro=neutro+0;}
            if(vetor[i]<0){negativo++;}else{neutro=neutro+0;}
            if(vetor[i]==0){neutro++;}else{neutro=neutro+0;}
            
            
        }
        System.out.format("pares:%d impares:%d negativos:%d positivos:%d neutros:%d\n",pares,impar,negativo,positivo,neutro);

                                                                            }
                                                                                }
