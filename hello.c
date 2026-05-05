#include<stdio.h>
int main(){
    int a = 20;
    int *p = &a;

    printf("value using pointer = %d", *p);
    return 0;
    
}