#include<stdio.h>
int main(){
    int x = 90;
    int *p = &x;

    printf("value using  pointer = %d\n" ,*p);
    return 0;
}