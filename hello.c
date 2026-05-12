// write a function no argument but return value

#include<stdio.h>

//function declaration
int add();

//main function 
int main(){
    int result ;
    result = add(); // calling function 
    printf("sum = %d", result);
    return 0;
}
// function defination
int add(){
    int a = 10, b = 20;
    int sum;

    sum = a + b;
    return sum ;
}