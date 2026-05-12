// // write a function to check even or odd number

// #include<stdio.h>

// // function declaration
// int main(){
//     int n;

//     printf("Enter a number:-");
//     Scanf("%d",&n);

//     // function call 
//     checkEvenOdd(n);
//     return 0;
// }
// // function defination
// void checkEvenOdd(int num){
//     if(num %2 == 0){
//         printf("even number:-");
//     }else{
//         printf("odd number:-");
//     }
// }

// write a function to check even or odd number

#include<stdio.h>

// function declaration
void checkEvenOdd(int num);

int main(){
    int n;

    printf("Enter a number:- ");
    scanf("%d", &n);

    // function call
    checkEvenOdd(n);

    return 0;
}

// function definition
void checkEvenOdd(int num){
    if(num % 2 == 0){
        printf("Even number");
    }else{
        printf("Odd number");
    }
}