#include <stdio.h>
#include <conio.h>

int main() {
    int a;
    printf("Enter the number : ");
    scanf("%d", &a);
    if(a % 2 == 0){
        printf("This is Even.");
    } else{
        printf("This is odd.");
    }
    return 0;
}