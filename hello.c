// tail recursive function to calculate factorial 
#include<stdio.h>

unsigned int factTR(unsigned int n, unsigned int a){
    if(n <= 1)
    return a ;

    return factTR(n - 1, n * a);
}
// A wrapper over factTR
unsigned int fact(unsigned int n){
    return factTR(n, 1);
}
int main(){
    printf("%u", fact(5));
    return 0;
}