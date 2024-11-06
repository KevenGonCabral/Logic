import java.util.ArrayList;
import java.util.Scanner;

public class App {
//<><><><><>AVISO<><><><><>
//não use virgulas, espaços, pontos e sinais especiais
    public static void main(String[] args) throws Exception {
        int n=0;
        float maior=0;
        String nome;
        int carreira; 
        String titulo; 
        String cod; 
        int anol; 
        String genero; 
        float valorp; 
        String gravadora;
        System.out.println("Digite o (N)umero de Dvd's:");
        Scanner s= new Scanner(System.in);
        n = s.nextInt(); n=n+0;
        int[]cont = new int[n];
        int[]contg = new int[n];      
        int mc;
        ArrayList<DVD> dvds = new ArrayList<DVD>();
        
        for(int i=0; i<n; i++)
        {   System.out.println("-------------------");
            System.out.println(" nome autor ");
            nome=s.next();
            System.out.println(" carreira-> solo (1) grupo(2)");
            carreira=s.nextInt();   
            System.out.println("titulo dvd");
            titulo=s.next();
            System.out.println("codigo do dvd");
            cod=s.next();
            System.out.println("ano de lançamento");
            anol=s.nextInt();
            System.out.println("genero musical");
            genero=s.next();
            System.out.println("preço dvd");
            valorp=s.nextInt();
            System.out.println("gravadora");
            gravadora=s.next();
            System.out.println("-------------------\n");
            DVD d = new DVD(nome,carreira,titulo,cod,anol,genero,valorp,gravadora);
            dvds.add(d);
        }System.out.format("\n\n\n\n\n\n\n\n");
//DvDs Iprimidos
       System.out.println("<><<><>SO PEDRADAS!<><><>");
       for(int i=0; i<n; i++)
       {
        System.out.println("-------------------");
        System.out.println("Autor: "+dvds.get(i).getNomea());
        if(dvds.get(i).getCarreira()==1){
        System.out.println("solo\n");}else{System.out.println("grupo musical\n");}
        System.out.println("titulo: \n"+dvds.get(i).getTitulo());
        System.out.println("ano de lançamento: \n"+dvds.get(i).getAnol());
        System.out.println("genero musical: \n"+dvds.get(i).getGenero());
        System.out.println("preço: \n"+dvds.get(i).getValorp());
        System.out.println("gravadora: \n"+dvds.get(i).getGravadora());
        System.out.println("-------------------\n");
       }
//mais cara e o mais barato

        System.out.println("DVD's mais caro:");
        maior = dvds.get(0).getValorp();
        for(int i=0; i<n; i++)
        {   if(dvds.get(i).getValorp()>=maior){
          maior=dvds.get(i).getValorp();}else{maior=maior+0;}
        }
        System.out.println("->"+maior);
        System.out.println("DVD's mais barato:");
        maior = dvds.get(0).getValorp();
        for(int i=0; i<n; i++)
        {   if(dvds.get(i).getValorp()<=maior){
          maior=dvds.get(i).getValorp();}else{maior=maior+0;}
        }
        System.out.println("->"+maior);
//soma DVDs    
        float soma=dvds.get(0).getValorp();
        for(int i=1; i<n; i++)
        {
         soma =soma + dvds.get(i).getValorp();
        }
        System.out.println("soma dos dvds:\n"+soma);
//artistas solos
        System.out.println("artistas solos e seus dvd's:");
        for(int i=0; i<n; i++)
        {
            if(dvds.get(i).getCarreira()==1)
            {
                System.out.println(dvds.get(i).getNomea()+"\n-----------");
                System.out.println(dvds.get(i).getTitulo());
            }else{n=n+0;}
        }
//maior ano de lançamento
        cont[0]=1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {cont[i]=1;
             
                if(i == j){n=n+0;}else{
                        if(dvds.get(i).getAnol()==dvds.get(j).getAnol())
                        {   
                            cont[i]++;}
                }
             
            }
                          
        }
        mc = cont[0];
        for(int k=0; k<n; k++)
        {
             if(mc<cont[k]){
                mc=cont[k];
             }else{mc=mc+0;}
        }
        for(int k=0; k<n; k++)
        {
            if(mc==cont[k])
            {System.out.println("ano de maior lançamento:\n"+dvds.get(k).getAnol());k=n;}
        }

//genero musical favorito
        contg[0]=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
             
                if(i == j){n=n+0;}else{
                        if(dvds.get(i).getGenero().equals(dvds.get(j).getGenero()))
                        {   
                            contg[i]++;}
                }
             
            }
                          
        }
        int sles=0;
        mc = contg[0];
        for(int k=0; k<n; k++)
        {
             if(mc<contg[k]){
                mc=contg[k];
                sles++;
             }else{sles=sles+0;}
             
        }System.out.format("genero preferido do usuario:\n%s\n",dvds.get(sles).getGenero());
        

    }
}
