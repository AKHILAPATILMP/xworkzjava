package com.xworkz.later.internal;

public class ToolImpl implements Tool {

    public ToolImpl() {
        super();
        System.out.println("ToolImpl constructor running");
    }

    @Override
    public void use() {
        System.out.println("Tool is being used...");
    }
}
