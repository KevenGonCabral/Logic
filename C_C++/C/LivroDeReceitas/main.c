#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void lerint_vetor(int x[],int tam){//IMPRIME UMA SEQUENCIA DE VETORES
    for(int i = 0;i<tam;i++)
    {
        printf("[ %d ]\n",x[i]);
    }
}
void lerint_vetorp(int *x,int tam){//IMPRIME UMA SEQUENCIA DE VETORES EM PONTEIRO
    for(int i = 0;i<tam;i++)
    {
        printf("[ %d ]\n",x[i]);
    }
}
int aloc_R(int *x){//INFORMA SE ALOCAÇÃO FOI REALIZADA
if (x == NULL){printf("memoria indisponivel reinicie o programa\n");
    return 0;
}else{printf("memoria disponivel\n");
    return 1;}
}
struct receita{//STRUCT
char nome_receita[51];
char ingredientes[1001];
char preparo[1001];
};

int main()
{   setlocale(LC_ALL,"Portuguese");
    char op;
    int quant=0,quantt=0;
    FILE *lista_receitas;
    int vetor[2]={2,5};
    int *p;
    p = 15;
     lerint_vetor(vetor,2);
//O PROGRAMA LIVRO DE RECEITAS ARMAZENA A RECEITA EM UM ARQUIVO
//MENU
    do{//O PROGRAMA SE INICIA COM UM MENU EM QUE PODEMOS ESCOLHER OPÇÕES
    system("cls");
    printf("<><><><><><><><><><><><><><><><><><><>\n");
    printf("          Livro de Receitas\n");
    printf("\n");
    printf("1 - Receitas salvas\n");
    printf("2 - Adicionar receita\n");
    printf("3 - SAIR\n");
    printf("\n");

    scanf(" %c",&op);

    system("cls");

//LER RECEITAS DO ARQUIVO
        if (op == '1')
    {   char frase[100];
        lista_receitas = fopen("lista de receitas.txt", "r");
        while(fgets(frase,100,lista_receitas) != NULL){
            printf("%s\n",frase);
        }
        fclose(lista_receitas);
        system("pause");
        system("cls");

    }
//ADICIONAR RECEITAS NO ARQUIVO
    else if(op == '2')
    {

       printf("\n[%d] usado de [%d] disponivel\n",quant,quantt);

       struct receita *x;
       x=malloc(sizeof(int));//ALOCAÇÂO DINAMICA
       aloc_R(x);
       lista_receitas = fopen("lista de receitas.txt", "a");

       for(int i=0;i<=1;i++)
       {    printf("digite o nome da receita:\n");
            scanf(" %[^\n]s",&x->nome_receita);

           printf("digite os ingredientes da receita:\n");
            scanf(" %[^\n]s",&x->ingredientes);

           printf("digite o modo de preparo da receita:\n");
            scanf(" %[^\n]s",&x->preparo);
           i++;
       }


       //ESCREVER NO ARQUIVO
            quant = 1;
            quantt =1;
            printf("\n[%d] usado de [%d] disponivel\n",quant,quantt);
            system("pause");

            for(int i=0;i<=quantt;i++){fprintf(lista_receitas, "NOME RECEITA\n%s\n", &x->nome_receita);i++;}

            for(int i=0;i<=quantt;i++){fprintf(lista_receitas, "INGREDIENTES\n%s\n", &x->ingredientes);i++;}

            for(int i=0;i<=quantt;i++){fprintf(lista_receitas, "MODO DE PREPARO\n%s\n", &x->preparo);i++;}
            fprintf(lista_receitas, "receita pronta!\n_____________________\n");
            fprintf(lista_receitas, " \n");
            fclose(lista_receitas);
            quant = 0;
            quantt =0;
    }

    }while(op != '3');//SAIR DO PROGRAMA
printf("PROGRAMA FINALIZADO\n");


    return 0;
}
