package com.xowrkz.prep.prep1;
//method overiding (runtime polymorphism)
public class Doctor extends Hospital{
    @Override
    public void checkup(){
        System.out.println("go to hsptl for check up ");
    }
}
