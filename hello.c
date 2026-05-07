#include<stdio.h>
int main(){
    int x = 90;
    int *p = &x;

    printf("p stores= %p\n" ,*p);
    return 0;
}