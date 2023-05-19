#include <stdio.h>
#include <conio.h>

int main() {
    int num, rem, result = 0, newnum;
    printf("Enter the number : ");
    scanf("%d", &num);
    newnum = num;
    while(num > 0){
        rem = num % 10;
        result = result + (rem * rem * rem);
        num = num / 10;
    }

    if(result == newnum){
        printf("The number is armstrong");
    } else{
        printf("The number is not armstrong");
    }
    return 0;
}