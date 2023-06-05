#include<stdio.h>
#include<string.h>

int main(){
    char ch;
    FILE *fp;
    fp = fopen("f1.txt","r");
    if(fp == NULL){
        printf("NO file is here");
        return 0;
    }
    ch = fgetc(fp);
    while(!feof(fp)){
        printf("%c", ch);
        ch = fgetc(fp);
    }
    fclose(fp);
}