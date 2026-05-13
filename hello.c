#include<stdio.h>

// Non - tail- recursive factorial function 

unsigned int fact(unsigned int n){
    if(n <= 0)
    return 1;

    //Recursive call is not the last operation 
    return n * fact(n - 1);
}
int main(){
    // Testing the factorial function 
    printf("%u", fact(5));

    return 0;
}