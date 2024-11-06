import java.util.Scanner;
/*1. Faça um programa que execute as operações básicas de uma calculadora.
Leia dois valores numéricos e um símbolo; caso o símbolo seja um dos
relacionados a seguir efetue a operação correspondente com os valores
digitados pelo usuário; caso contrário, digite a mensagem “Operador
inválido!”. Símbolos: + soma, - subtração, * multiplicação, / divisão.
Atenção para a divisão por 0. */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("<CALCULADORA>");
        System.out.format("\t(*numero *operador *numero)>resultado\n");
     
        Scanner s = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        Scanner sss = new Scanner(System.in);
        Scanner fim = new Scanner(System.in); String FIM;
        int c = s.nextInt();
        int resultado = 0;
        String ope ;
        int validador = 0;
        do{
        ope = ss.next();
        switch(ope){
            case "*":validador=1; break;
            case "/":validador=1; break;
            case "+":validador=1; break;
            case "-":validador=1; break;
            default: System.out.println("operador invalido");
            break;
        }
        }while(validador != 1);
        int cc = sss.nextInt();
        switch(ope){
            case "*":
            if(c==0 || cc==0){System.out.println("resultado = 0");
            break;    
            }
            resultado=c*cc;
            System.out.format("resultado = %d\n",resultado);
            break;
            case "/":
            if(c==0 || cc==0){System.out.println("impossivel dividir por 0");
            break;    
            }
            resultado=c/cc;
            System.out.format("resultado = %d\n",resultado);
            break;
            case "+":
            resultado=c+cc;
            System.out.format("resultado = %d\n",resultado);
            break;
            case "-":
            resultado=c-cc;
            System.out.format("resultado = %d\n",resultado);
            break;

            default:
            System.out.println("???");
            break;
        }

FIM=fim.nextLine();
                                                                                }
                                                                                    }
