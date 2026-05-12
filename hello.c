#include<stdio.h>
int main(){
    //Normal variable 
    int var = 10;
    // Pointer varable ptr that stores address of var 
    int *ptr = &var;

    // Directly accessing ptr will give us an address
    printf("%p", ptr);

    return 0;
}