#include<iostream>
using namespace std;

struct Pair
{
    int min;
    int max;
};

Pair getMinMax(int arr[], int n)
{
    struct Pair min_max;
    int i;
    if (n == 1)
    {
        min_max.max = arr[0];
        min_max.min = arr[0];
        return min_max;
    }

    if (arr[0] > arr[1])
    {
        min_max.max = arr[0];
        min_max.min = arr[1];
    }
    else
    {
        min_max.max = arr[1];
        min_max.min = arr[0];
    }

    for(i = 2; i < n; i++)
    {
        if (arr[i] > min_max.max)
            min_max.max = arr[i];

        else if (arr[i] < min_max.min)
            min_max.min = arr[i];
    }
    return min_max;
}

int main(){
    int size;
    cin >> size;
    int array[size];
    for (int i = 0; i < size; ++i)
    {
        cin >> array[i];
    }
    struct Pair min_max = getMinMax(array, size);
    cout << min_max.min << endl;
    cout << min_max.max;

    return 0;
}
