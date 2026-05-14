#include<stdio.h>
int main(){
    int num = 10;

    // Pointer variable 
    int*ptr;

    // Address store karna 
    ptr = &num;

    printf("Value of num = %d\n", num );
    printf("Address of num = %p\n",&num);

    printf("Pointer ptr store address = %p\n", ptr);
    printf("value using pointer = %d\n", *ptr);

    return 0;
}