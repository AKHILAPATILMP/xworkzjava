package com.xworkz.isarelation.dust;

public class DustCollector extends Dust {

    public DustCollector() {
        super();
        System.out.println("DustCollector constructor is running - subclass");
    }

    @Override
    public void spread() {
        System.out.println("DustCollector prevents dust from spreading - subclass");
    }

    @Override
    public void settle() {
        System.out.println("DustCollector reduces dust settling - subclass");
    }

    @Override
    public void clean() {
        System.out.println("DustCollector is cleaning the air - subclass");
    }

    @Override
    public void examine() {
        System.out.println("DustCollector analyzes air quality - subclass");
    }
}
