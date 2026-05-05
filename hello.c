#include<stdio.h>
int main(){
    int a = 5;

    int *p = &a;

    *p = 50;
    printf("Updated value = %d", a);
    return 0;
}