#include <stdio.h>
#include <conio.h>

int main()
{
    char ch;
    double a, b;
    a = 2;
    b = 3;
    printf("Enter the choice : ");
    scanf("%s", &ch);

    switch (ch)
    {
    case '+':
        printf("addition : %lf", b + a);
        break;
    case '-':
        printf("addition : %lf", a - b);
        break;
    case '*':
        printf("addition : %lf", a * b);
        break;
    case '/':
        printf("addition : %lf", a / b);
        break;

    default:
        printf("Wrong input");
        break;
    }
    return 0;
}