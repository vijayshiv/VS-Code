#include<stdio.h>

#define action(a,b) a##b+a*b

void main(){
    printf("%d", action(3,4));
}