import java.util.ArrayList;
import java.util.Scanner;

public class App {
    /*2. Considere que um produto possui codigo, descric¸ ´ ao, nome do fabricante, quantidade em estoque e estoque m ˜ ´ınimo.
De posse disso, implemente uma classe Produto de forma que a mesma disponibilize uma interface que permita:
• Acessar seus atributos;
• Verificar se um produto esta com estoque abaixo do m ´ ´ınimo;
• Exibir uma representac¸ao no formato String de um produto; ˜
• Realizar comparac¸ao entre dois objetos do tipo Produto; ˜
Em seguida, crie uma aplicac¸ao que execute tais operac¸ ˜ oes. Essa aplicac¸ ˜ ao deve estar fora da classe Produto. */
    public static void main(String[] args) throws Exception {
        int op = 0;
        int tam = 3;
        int minimo = 20;

       ArrayList<Produto> lista = new ArrayList<Produto>();
        Produto a1 = new Produto("1726673176", "bolacha agua e sal", "fortaleza", 15);
        lista.add(a1);
        Produto a2 = new Produto("17378378373", "bolacha doce", "fortaleza", 25);
        lista.add(a2);    
        Produto a3 = new Produto("1726673176", "cookie comun", "Toddy", 45);
        lista.add(a3);
        
        Scanner ler = new Scanner(System.in);
        do{
        System.out.println("<><><> LISTA PRODUTOS <><><>");
        System.out.format("estoque: (%d de ???)\n\n",tam);
        System.out.println("1 - EXIBIR");
        System.out.println("2 - STATUS ESTOQUE");
        System.out.println("3 - CONFERIR");
        System.out.println("4 - EXIT");
        op = ler.nextInt();
        
        if(op == 1) {
        for(int i=0; i<tam; i++){
        System.out.println("------------------");
        System.out.println(lista.get(i).getCodigo());
        System.out.println(lista.get(i).getDescri());
        System.out.println(lista.get(i).getFabricante());
        System.out.println(lista.get(i).getEstoque());
        System.out.println("------------------");
        }
                    }


        if(op == 2){
            System.out.println(" ººººººººº Produtos em Falta ººººººººº");
            for(int i=0; i<tam; i++)
            {
                if(lista.get(i).getEstoque()< minimo)
                {
                    System.out.println(lista.get(i).getDescri());
                    System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
                }
            }
        }

        if (op == 3)
        {
            for(int i=0; i<1; i++)
            {
                for(int j=1; j<tam; j++){
                if(lista.get(i).getCodigo().equals(lista.get(j).getCodigo()))
            { 
              System.out.println("a"); 
            }else{System.out.println("*************");
                  System.out.println("NENHUM COD EQUALS!");}}
            }
        }
        }while( op != 4);
    
    
    
    
    }
}
