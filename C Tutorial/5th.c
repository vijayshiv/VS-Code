#include <stdio.h>
#include <conio.h>

int main() {
    int a, b;
    printf("Enter two numbers : ");
    scanf("%d %d", &a, &b);
    int greater;
    greater = ((a > b) ? a : b);
    printf("The greater number is : %d", greater);
    return 0;
}   