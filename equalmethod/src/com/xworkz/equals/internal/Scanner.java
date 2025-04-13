package com.xworkz.equals.internal;

import java.util.Objects;

public class Scanner {
    private String modelName; // The model name of the scanner (e.g., "HP ScanJet", "Canon LIDE")
    private String type;
    private double price;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Scanner) {
                System.out.println("Scanner ref will compare");
                Scanner scanner1 = this;
                Scanner scanner2 = (Scanner) obj;

                if (scanner1.modelName.equals(scanner2.modelName)) {
                    System.out.println("Both scanners have the same model name");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Scanner [modelName=" + modelName + ", type=" + type + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, type, price);
    }
}
