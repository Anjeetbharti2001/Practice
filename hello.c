// Write a function to add ntwo number 
#include <stdio.h>

int add(int a, int b){
    return a + b;
}

int main(){
    int result = add(5,3);
    printf("sum = %d", result);
    return 0;
}