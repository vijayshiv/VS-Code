#include <stdio.h>
#include <conio.h>

int main() {
    int len, num = 1;
    printf("Enter the length of triangle : ");
    scanf("%d", &len);

    for (int i = 1; i <= len; i++){
        for (int j = 1; j <= i; j++){
            printf("%d ", num);
            num++;
        }
        printf("\n");
    }
    
    return 0;
}