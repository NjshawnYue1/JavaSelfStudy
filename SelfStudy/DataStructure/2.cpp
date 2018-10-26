//
// Created by Admin on 2018/10/22.
//
#include <stdio.h>

void f(int *p);

int main(void) {
    int i = 10;
    f(&i);
    printf("i = %d\n",i);
    return 0;
}

void f(int *p) {
    *p = 99;
}