package com.xowrkz.prep.prep1;

public class Run {
    public static void main(String[] args) {
        Chiar chiar=new Chiar();
        Bottle bottle=new Bottle("cello",200);
        bottle.display();
        Book b1 = new Book("Java Guide");
        b1.display();
        Bottle bottle1=new Bottle();
        Waterbottle waterbottle=new Waterbottle();

Addition addition=new Addition();
addition.add(1,2);
addition.add(5,6);
addition.add(7,8,9);

        Hospital hospital=new Doctor();
        hospital.checkup();

        Student student=new Student();
        student.setName("akanksha");
        student.setAge(20);
        System.out.println("getname "+student.getAge());
        System.out.println("getage "+student.getName());

        Color color=new Slipper();
        color.yellow();
        }

    }


