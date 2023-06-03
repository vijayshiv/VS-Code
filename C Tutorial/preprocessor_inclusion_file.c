#include<stdio.h>
int sum(int , int);
int a,b;
int s;
void main()
{
    scanf("%d %d",&a,&b);
    int ans = sum(a,b);
    printf("sum = %d", ans);
}
int sum(int x, int y){
    s = x + y;
    return s;
}