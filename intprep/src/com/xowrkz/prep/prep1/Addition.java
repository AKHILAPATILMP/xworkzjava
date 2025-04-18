package com.xowrkz.prep.prep1;
//method overloading(compile time polymorphism)
public class Addition {
    int add(int a,int b){
    return a + b;
    }
    double add(double c,double d){
        return c+d;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
