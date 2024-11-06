import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        int tam=0;
        int op=0;
        int r;
        String nome;
        String telefone;
        String email;
       
        
            ArrayList<Contato> agenda = new ArrayList<Contato>(100);
            //contatos prontos para teste
            nome = "keven";
            telefone="82823636";
            email="m0nsterUdyr235@gmail.com";
            Contato a1 = new Contato(nome,telefone,email);
            agenda.add(a1);tam++;

            nome = "EdnaldoPereira";
            telefone="2874200";
            email="ednaldochance@hotmail.com";
            Contato a2 = new Contato(nome,telefone,email);
            agenda.add(a2);tam++;

            nome = "Raiden";
            telefone="56523636";
            email="UgaUga135@gmail.com";
            Contato a3 = new Contato(nome,telefone,email);
            agenda.add(a3);tam++;

        




            do{
        Scanner ler = new Scanner(System.in);
        System.out.format("<><><><><><><><>AGENDA<><><><><><><><>\nUsage(%d of 99)\n\n",tam-1);
        System.out.println("1 - pesquisar contatos");      
        System.out.println("2 - adicionar contato");
        System.out.println("3 - atualizar dado");
        System.out.println("4 - apagar contato");
        System.out.println("5 - EXIT");
        op=ler.nextInt();

        //metodo imprimir
        if(op == 1) {
        for(int i=0; i<tam; i++)
        {   
            System.out.println("--------------------------------------");
            System.out.println(agenda.get(i).getNome());
            System.out.println(agenda.get(i).getTelefone());
            System.out.println(agenda.get(i).getEmail());
            System.out.println("--------------------------------------\n");
            
        }   op=0;
                    }

        //metodo inserir
        if(op == 2) {
        for(int i=0; i<1; i++)
        {   System.out.println("nome:");
            nome=ler.next();
            System.out.println("telefone:");
            telefone=ler.next();
            System.out.println("email:");
            email=ler.next();
            Contato novo = new Contato(nome,telefone,email);
            agenda.add(novo);tam++;
            op=0;
        }
//metodo atualizar
                    }
        if(op == 3){
        System.out.format("Posiçao a ser atualizada{%d/99}\n",tam-1);
        r=ler.nextInt();
        System.out.println("nome:");
        nome=ler.next();
        agenda.get(r).setNome(nome);
        System.out.println("telefone:");
        telefone=ler.next();
        agenda.get(r).setTelefone(telefone);
        System.out.println("email:");
        email=ler.next();
        agenda.get(r).setEmail(email);
                    op=0;     
                    }
//metodo apagar
        if(op == 4){
            System.out.format("Posiçao a ser apagada{%d/99}\n",tam-1);
            r=ler.nextInt();
            agenda.remove(r);
            tam--;
            op=0;
        }    
}while(op!=5);

    }
}
