package com.xworkz.equals.internal;

import java.util.Objects;

public class Mill {
    private String type;
    private double capacity;
    private String location;
    private int workers;

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Mill) {
                System.out.println("Mill ref will compare");
                Mill mill1 = this;
                Mill mill2 = (Mill) obj;

                if (mill1.type.equals(mill2.type)) {
                    System.out.println("Both mills  are of the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mill [type=" + type + ", capacity=" + capacity + ", location=" + location + ", workers=" + workers + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, capacity, location, workers);
    }
}
