#include<stdio.h>


int factorial(int n ){
    if(n <= 1){
        return 1;
    }else{
        return n * factorial(n -1); // recursive case
    }
}
int main(){
    printf("Factorial of 5 is : %d ", factorial(5));
    return 0;
}