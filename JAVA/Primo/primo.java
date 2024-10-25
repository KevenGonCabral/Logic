import java.util.Scanner;

public class primo {
    public static void main(String[] args)throws Exception{
        System.out.println("digite um numero inteiro");
        Scanner receba = new Scanner(System.in);
        int x = receba.nextInt();
        int primo = 0;

        if (x <= 1) {
            primo = 0; 
        }
        
        if (x == 2){
            primo = 1;
        }
        
        for (int i = 2; i < x; i++){
            if (x % i == 0) {
                primo = 0;
                i = x; 
            }else{primo= 1;}
        }

        if(primo == 1){
            System.out.println("numero primo");
         }else{System.out.println("numero não primo");}
         
    }  
}
