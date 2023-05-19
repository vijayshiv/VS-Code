#include <stdio.h>
#include <conio.h>
#include <string.h>

int main() {
    int num, p = 1, rv = 0;
    printf("Enter the number : ");
    scanf("%d", &num);
    while(num > 0){

        int dig = num % 2;
        num = num / 2;
        
        rv += dig * p;
        p = p * 10;

    }
        printf("%d",rv);
    return 0;
}