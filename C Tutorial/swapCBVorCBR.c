#include <stdio.h>

// void swap(int *, int *);
// void swap2(int, int);

void swap(int *x, int *y)
{
    int t;
    t = *x;
    *x = *y;
    *y = t;
}
void swap2(int x, int y)
{
    int t;
    t = x;
    x = y;
    y = t;
}

void main()
{
    int a, b;
    printf("Enter any two number : ");
    scanf("%d %d", &a, &b);
    printf("a = %d, b = %d\n", a, b);

    swap2(a, b);

    printf("a = %d, b = %d", a, b);
}