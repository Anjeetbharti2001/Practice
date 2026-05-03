#include<stdio.h>
void disp(int*p){
    printf("%d",*p);
    printf("%d",*(p+3));
}
int main(){
    int a[] = {11,2,3,4,5};
    {
        disp(&a);
    }
    return 0;
}