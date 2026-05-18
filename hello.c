// Area of Triangle
#include<stdio.h>

int main(){
    float base, height, area;
    printf("Enter base and Height :-");
    scanf("%f %f", &base, &height);

    area = 0.5 * base * height;
    printf(" Area = %.2f", area);

    return 0;
}