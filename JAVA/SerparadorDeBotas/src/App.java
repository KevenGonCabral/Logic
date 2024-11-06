import java.util.Scanner;

public class App                                                {
    public static void main(String[] args) throws Exception {
    String op = "E";
    String opp = "D";
    String fim;
    int validacao = 1;  
    
        System.out.println("DIGITE O NUMERO DE BOTAS");
            Scanner A = new Scanner(System.in);
            Scanner B = new Scanner(System.in);
            Scanner C = new Scanner(System.in);           
            Scanner FIM = new Scanner(System.in);
    int testador = 1;
    int n;
            do{
            n = A.nextInt();
            if(n < 2 || n > 10000)
            {
                testador = 1;
            }else{testador= n%2;}
              }while(testador !=0);
              int[] mcopia = new int[n];
              String[] lcopia = new String[n];

        System.out.println("DIGITE A MEDIDA SEGUIDO DO LADO DA BOTA");
    int[]m = new int[5000];
    String[] l = new String[5000];
        for(int i=0;i<n;i++)
        {   
            System.out.format("<MEDIDA PAR(%d/%d)>\n",i+1,n);
            do{
            m[i] = B.nextInt();}while(m[i] < 30|| m[i] > 60);
            mcopia[i]= m[i];
                for(int j=0;j<1;j++)
                    {   System.out.format("<LADO DA BOTA(%d/%d)>\n",i+1,n);
                                     do{
                                        
                        l[i]= C.next();
                       
                        if(l[i].equalsIgnoreCase(op) || l[i].equalsIgnoreCase(opp))
                        {
                             validacao--;
                             lcopia[i]= l[i];
                        }else{validacao=validacao+0;}
                                        }while(validacao!=0); 
                                        System.out.format("BOTA LISTADA...\n\n");                     
                    }
        validacao=1;           
        }
    
        int formados=0;
        for(int i=0; i<n;i++){
             for(int j=1;j<n;j++){
                 if(m[i]==mcopia[j])
                 {
                     if(!(l[i].equalsIgnoreCase(lcopia[j])))
                     {
                         formados++;
                     }
                 }
                 j++;
             }
          i++;
        }
 //
        if(formados>0)
        {
          System.out.format("total de pares de botas formados:[%d]\n",formados);
        }
        else{System.out.format("nenhum par foi formado...\n");}


fim=FIM.nextLine();
                                                            }

                                                                }
