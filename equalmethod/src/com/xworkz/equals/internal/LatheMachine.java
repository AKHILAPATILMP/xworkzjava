package com.xworkz.equals.internal;

import java.util.Objects;

public class LatheMachine {
    private String model;
    private double power;
    private String manufacturer;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof LatheMachine) {
                System.out.println("LatheMachine ref will compare");
                LatheMachine lathe1 = this;
                LatheMachine lathe2 = (LatheMachine) obj;

                if (lathe1.model.equals(lathe2.model)) {
                    System.out.println("Both lathe  machines have the same model");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "LatheMachine [model=" + model + ", power=" + power + ", manufacturer=" + manufacturer + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power, manufacturer, year);
    }
}
