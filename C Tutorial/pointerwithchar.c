#include <stdio.h>
#include <conio.h>
#include <string.h>

char* reverse(char *p)
{
    int a, i;
    char t;
    for (a = 0; *(p+a)!='\0'; a++);
    for (i = 0; i < a / 2; i++)
    {
        t = *(p+i);
        *(p+i) = *(p+a-1-i);
        *(p+a-1-i) = t;
    }
    return (p);
}
int length(char *p)
{
    int i;
    for (i = 0; *(p + i) != '\0'; i++);
    return i;
}
void main()
{
    char ch[20];
    char *p;
    p = &ch[0];
    scanf("%s", ch);
    printf("%s",reverse(ch));
    printf("\n%d",length(ch));
}