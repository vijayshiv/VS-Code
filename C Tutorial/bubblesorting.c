#include <stdio.h>
#include <conio.h>

void input(int *p){
    for(int i = 0; i < 5; i++){
        scanf("%d",(p+i));
    }
}

void display(int *p){
    for(int i = 0; i < 5; i++){
        printf("%d ",*(p+i));
    }
}
void sort(int *p){
    int r, i, t;
    for(r = 1; r < 5; r++){
        for(i = 0; i < 4; i++){
            if(*(p+i) > *(p+i+1)){
                t = *(p+i);
                *(p+i) = *(p+i+1);
                *(p+i+1) = t;
            }
        }
    }
}

void main() {
    int a[5];
    input(a);
    display(a);
    sort(a);
    printf("\n");
    display(a);
}