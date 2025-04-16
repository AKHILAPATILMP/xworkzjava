package com.xworkz.inherit.singlerun;

import com.xworkz.inherit.single.Dog;

public class Run {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method from Animal class
        dog.bark(); // Method of Dog class
    }
}
