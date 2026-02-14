#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

int shakeEm(int dc, int ds);

int main()
{
    int sampleSize = 10000;
    double averageOutput = 0;
    for (int i = 0; i<sampleSize; ++i)
    {
        averageOutput = averageOutput + shakeEm(99,6);
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

