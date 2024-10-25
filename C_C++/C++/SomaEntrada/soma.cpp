#include<iostream>

using namespace std;

int main(int argc, char const *argv[]){   
    int vetor[10];
    int soma = 0;


    cout << "digite 10 numeros \n";
    for (int x = 0; x <= 9; x++)
    {
        cin >> vetor[x];
        cin.ignore();
    }
    
    for ( int i = 0; i <= 9; i++)
    {
        cout << vetor[i] << "+";
        soma = soma + vetor[i];
        
        
    }
    cout <<"=\n" << soma;
    
    return 0;
}
