package com.xowrkz.prep.prep1;
//parameterised constructor
//this() is used
public class Bottle {
    public Bottle(){//constructor overloading
        System.out.println("bottle is no argument constructor");
    }
    public String name;
    public int cost;
    public Bottle(String name,int cost){
      this.name=name;
        this.cost=cost;

    }
    public void display(){
        System.out.println(name + " "+cost);
    }
}
