#include "feed.h"


void escrever_vetor(int x[],int tam){
    for(int i = 0;i<tam;i++)
    {
        printf("[ %d ]\n",x[i]);
    }
}

void escrever_vetorp(int *x,int tam){
    for(int i = 0;i<tam;i++)
    {
        printf("[ %d ]\n",x[i]);
    }
}

