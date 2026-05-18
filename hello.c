// Gross Salary of an Employee 

#include<stdio.h>
int main(){
    float basic, da, hra, gross;

    printf("Enter basic Salary: ");
    scanf("%f", &basic);

    da = basic * 0.40;
    hra = basic * 0.20;

    gross = basic + da + hra;

    printf("Gross salary = %.2f", gross);

    return 0;
}