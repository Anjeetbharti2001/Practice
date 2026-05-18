// Convert Celsius into Fahrenheit
#include<stdio.h>

int main(){
    float c, f;
    printf("Enter temperature in celcius :");
    scanf("%f", &c);

    f = (9 * c / 5) + 32;

    printf("Temperature in Fahrenheit = %.2f", f);

    return 0;
}