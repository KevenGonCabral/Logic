#include<stdio.h>
#include<stdlib.h>
int main(int argc, char const *argv[])
{
    //par
    for(int i = 0; i <= 100; i ++){
        if(i % 2 == 0){
            printf("%d",i);
        
        }else{printf(" ");}
    } 
printf("\n");
    //impar
    for(int i = 0; i <= 100; i ++){
        if(i % 2 != 0){
            printf("%d",i);
        }else{printf(" ");}
    }
    system("pause");
    system("cls");
    return 0;
}
