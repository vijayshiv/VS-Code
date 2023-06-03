#include <stdio.h>
#include "C:\Users\ACER\Desktop\VS code\C Tutorial\preprocessor_inclusion_file.c"
void main()
{
    int a, b;
    printf("Enter the two number : ");
    scanf("%d %d", &a, &b);
    int ans = sum(a, b);
    printf("The ans in file 2 %d", ans);
}