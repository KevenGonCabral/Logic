import java.util.Scanner;
/*4. Construa um algoritmo que repita a leitura de uma senha até que ela seja
válida. Para cada senha incorreta escrever a mensagem “SENHA
INVÁLIDA”. Quando a senha for informada corretamente deve ser
impressa a mensagem “ACESSO PERMITIDO” e o algoritmo encerrado.
Considere que a senha correta é “a76dk09”. */
public class App {
    public static void main(String[] args) throws Exception {
        String senha = new String();
        Scanner s = new Scanner(System.in);
        int testador=0;
        do{   
            System.out.print("IMFORME A SENHA: ");
            senha = s.nextLine();     
        switch(senha){
            case "a76dk09":
            System.out.println("ACESSO PERMITIDO");
            testador=1;
            break;
            default:
            System.out.println("SENHA INVALIDA");
            break;
        } if(testador == 1){testador=1;}
          else{testador=0;}
        }while(testador!= 1);
                                                                                }
                                                                                    }
