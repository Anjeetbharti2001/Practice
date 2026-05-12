// write a function without return values 

#include<stdio.h>
//function declaration
void greet();
int main(){
    greet(); // function call

    return 0;
}

// function defination 
void greet(){
    printf("hello. welcome to c programming ");
}