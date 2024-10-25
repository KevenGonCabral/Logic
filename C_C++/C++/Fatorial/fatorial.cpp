#include <iostream>

using namespace std;
int num = 0;
int count;

int main(int argc, char const *argv[])
{
    cout << "digite um numero\n";
    cin >> num;
    count = num;

    for (int i = 1; i < count; i++)
    {
        cout << i << "*";
        num = num * i;
    }
    cout << count << "\n=" << num; 
    return 0;
}
