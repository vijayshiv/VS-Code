#include <stdio.h>
#include <stdlib.h>

/*
void main(){
    int a;      //sma - static memory allocation
    float b;    //sma

    float *c;
    c = (float*)malloc(4);
    printf("%d\n", a);
    printf("%d", c);
}
*/

/*
void main()
{
    int *ptr;
    int size;
    printf("Enter the size of the arry : ");
    scanf("%d", &size);

    ptr = (int *)malloc(size * sizeof(int));
    printf("%d\n", sizeof(ptr));
    for (int i = 0; i < size; i++)
    {
        printf("Enter the value number %d of this array\n", i);
        scanf("%d", &ptr[i]);
    }
    printf("The array is : ");
    for (int i = 0; i < size; i++)
    {
        printf("%d ", ptr[i]);
    }
}
*/

/*
int total;
int square(int x)
{
    return (x * x);
}
int squareofSum(int x, int y)
{
    int z = square(x + y);
    return z;
}
int main()
{
    int a = 4, b = 8;
    total = squareofSum(a, b);
    printf("Output = %d", total);
}
*/

int main()
{
    int n;
    printf("Enter the size of array : ");
    scanf("%d", &n);
    int *a = (int*)malloc(n * sizeof(int));
    printf("Enter the elements in array :\n");
    for (int i = 0; i < n; i++)
    {
        printf("Enter the elemets now : ");
        scanf("%d", &a[i]);
    }
    printf("The elements in the array : ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    free(a);
}