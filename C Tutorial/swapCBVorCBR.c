#include <stdio.h>

void swapcbv(int x, int y)
{
    int temp = x;
    x = y;
    y = temp;
}
void swapcbr(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

int main()
{
    int x,y;
    printf("Enter Two numbers : ");
    scanf("%d %d", &x,&y);
    printf("\nCall by Value \n");
    printf("Values before swap: x = %d, y = %d\n", x, y);
    swapcbv(x, y);
    printf("Values after swap: x = %d, y = %d\n", x, y);

    printf("\nCall by Reference \n");
    printf("Values before swap: x = %d, y = %d\n", x, y);
    swapcbr(&x, &y);
    printf("Values after swap: x = %d, y = %d", x, y);
}
