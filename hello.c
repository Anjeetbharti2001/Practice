#include<stdio.h>
int main(){
    int a = 5, b = 10;
    int *p1 = &a,*p2 = &b;

    int sum = *p1 + *p2;

    printf("sum = %d ", sum);
    return 0; 
}