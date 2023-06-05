#include <stdio.h>
#include <string.h>
#include <conio.h>
int main()
{
    char s[100];
    FILE *fp;
    fp = fopen("f1.txt", "r");
    if (fp == NULL)
    {
        printf("File cannot open");
        return 0;
    }
    printf("Enter the content for f1.txt file : ");
    gets(s);
    for (int i = 0; i < strlen(s); i++)
    {
        fputc(s[i], fp);
    }
    fclose(fp);
}