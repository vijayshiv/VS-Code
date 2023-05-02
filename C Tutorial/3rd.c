#include <stdio.h>
#include <conio.h>

int main() {
    int a, b, c;
    float avg ;
    printf("Enter the numbers : ");
    scanf("%d %d %d", &a, &b, &c);
    printf("First number : %d \n", a);
    printf("Second number : %d \n", b);
    printf("Third number : %d \n", c);

    avg = (a + b + c) / 3;

    printf("The average of these three numbers : %f ", avg );
    return 0;
}