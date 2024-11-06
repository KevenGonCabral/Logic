#include <stdio.h>
#include <stdlib.h>
int main()
{//aluno:KEVEN GONÇALVES CABRAL
 //matricula:508874
    /*OBS
    não seguindo as restrições
    ocasionará numa repetição,
    basta colocar um valor dentro
    dos parametros que funcionará
    */
        int n,x=0;
//
		printf("Digite o (N)umero de Botas:\n");
		do {
        scanf("%d",&n);
        if(n < 2 || n > 10000){
            x=1;
        }else{
        x = n% 2;
		}
       }while(x != 0);
//
	    printf("Digite a (M)edida da Bota seguido do (L)ado do pe:\n");
	    system("pause");
	    system("cls");
        int *d,*dcopia;
        char dd[n],ddcopia[n];
//
        d = malloc(n *sizeof(int));
        dcopia = malloc(n *sizeof(int));
        if (d == NULL)  {
         printf ("Socorro! malloc devolveu NULL!\n");
         exit(1);       }
        if (dcopia == NULL)  {
         printf ("Socorro! malloc devolveu NULL!\n");
         exit(1);       }
//
        for(int i=0; i<n; i++){
            printf("medida [%d]\n",i+1);
            do{
            scanf("%d",&d[i]);
            }while(d[i] < 30 || d[i] > 60);
            dcopia[i]= d[i];
            printf("\n(d)ireito ou(e)squerdo [%d]\n",i+1);
            do{
            scanf("%s",&dd[i]);
            }while(dd[i] != 'd' && dd[i] != 'e');
            ddcopia[i]= dd[i];
            printf("\nArquivado...                %d|%c\n",d[i],dd[i]);
            printf("\n");
        }
//
       system("pause");
       system("cls");
       int formados=0;
       for(int i=0; i<n;i++){
            for(int j=1;j<n;j++){
                if(d[i]==dcopia[j])
                {
                    if(dd[i]!=ddcopia[j])
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
         printf("total de pares de botas formados:[%d]\n",formados);
       }
       else{printf("nenhum par foi formado...\n");}
//
    return 0;
}
