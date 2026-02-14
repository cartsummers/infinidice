#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

int shakeEm(int dc, int ds);

int main()
{
    cout << "input sample size" << endl;
    int DC;
    int DS;
    int sampleSize;
    cin >> sampleSize;
    cout << "put the ammount of dice you want to use" << endl;
    cin >> DC;
    cout << "put the amount of sides you want on each side" << endl;
    cin >> DS;
    double averageOutput = 0;
    for (int i = 0; i<sampleSize; ++i)
    {
        averageOutput = averageOutput + shakeEm(DC,DS);
    }
    averageOutput = averageOutput / sampleSize;
    cout << averageOutput;
    return 0;
}

int shakeEm(int dc, int ds)
{
    int diceCount = dc;
    int diceSides = ds;
    int outputTotal = 0;
    for (int i = 0; i<diceCount; i = i + 1)
    {
        outputTotal = outputTotal + ((rand()% diceSides)+1);
    }
    return outputTotal;
}

