//convert a Person's Name in Abbreviated
#include<stdio.h>
int main(){
    char fname[20], mname[20], lname[20];

    printf("Enter first name : ");
    scanf("%s", fname);

    printf("Enter Middle Name : ");
    scanf("%s", mname);

    printf("Enter Last Name :");
    scanf("%s", lname);

    printf("Abbreviated Name: %c.%c.%s", fname[0], mname[0], lname);

    return 0;
}