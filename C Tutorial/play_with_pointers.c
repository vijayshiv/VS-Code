/*
#include <stdio.h>
#include <conio.h>

int main() {
    int a, *p, b;
    a = 10;
    *p = a;
    p = &a;
    printf("a = %d\n", a);
    printf("*p = %d\n", *p);
    printf("p = %d\n", p);
    printf("&a = %d\n", &a);

    b = 13;
    *p = b;
    printf("b = %d\n", b);
    printf("*p = %d\n", *p);
    printf("p = %d\n", p);
    return 0;
}*/

#include <stdio.h>
int main()
{

    int x[5] = {1, 2, 3, 4, 5};
    int *ptr;

    // ptr is assigned the address of the third element
    ptr = &x[2];

    printf("ptr = %d \n", ptr);           // 3
    printf("(ptr+1) = %d \n", (ptr + 1)); // 4
    printf("(ptr-1) = %d", (ptr - 1));    // 2

    return 0;
}

/*
#include <stdio.h>
#include <conio.h>
struct ex
{
    int a;
    float b;
};
struct ex s, *p;
int main() {
    scanf("%d", p->a);
    printf("%d", p->a);
    return 0;
}
*/

// Program to calculate the sum of n numbers entered by the user

/*
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, i, *ptr, sum = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    ptr = (int *)malloc(n * sizeof(int));

    // if memory cannot be allocated
    if (ptr == NULL)
    {
        printf("Error! memory not allocated.");
        exit(0);
    }

    printf("Enter elements: ");
    for (i = 0; i < n; ++i)
    {
        scanf("%d", ptr + i);
        sum += *(ptr + i);
    }

    printf("Sum = %d", sum);

    // deallocating the memory
    free(ptr);

    return 0;
}
*/