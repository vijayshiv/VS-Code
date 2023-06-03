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

/*
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
*/

// can we free memory before realloc in c
// No. Why? The whole point of realloc is that it reallocates the existing memory
// block, preserving the values already stored in that memory block
/*
void main(){
    int *ptr, n,i;
    printf("Enter the size of array : ");
    scanf("%d",&n);
    ptr = (int*)malloc(n * sizeof(int));
    printf("Enter elements in array :\n");
    for(i = 0; i < n; i++){
        scanf("%d", &ptr[i]);
    }

    printf("The values are : ");
    for(i = 0; i < n; i++){
        printf("%d ", ptr[i]);
    }
    free(ptr);

    printf("Enter the new size : ");
    scanf("%d", &n);
    ptr = (int*)realloc(ptr, n*sizeof(int));

    printf("Enter more elements in array :\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &ptr[i]);
    }

    printf("The new values are : ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", ptr[i]);
    }
}
*/

/*
union item
{
    int a; float b; char c;
};
void main(){
    union item i;

    i.a = 6;
    i.c = 'v';
    printf("%c",i.a);
}
*/

/*
void main(){
    enum month{
        January = 1,February,March,April,May,June,July,August,September,October,Novenmber,December 
    };
    enum month m;
    int x;
    x = March;
    printf("%d",x);
}
*/
 void main(){
    float g;
    int on;
    char cc[30] = "2.3.56#E-hg";
    // on = 3*2/2+3/2*2+2+3.2;
    // g = 3/2+3*4/3-3+1.5/3;
    // printf("%f",g);
    // printf("%d",on);
    printf("%s",cc);
}