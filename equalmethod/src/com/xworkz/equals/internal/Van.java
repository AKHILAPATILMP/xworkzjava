package com.xworkz.equals.internal;

import java.util.Objects;

public class Van {
    private String make;        // Make of the van (e.g., "Ford", "Mercedes")
    private int seatingCapacity; // Seating capacity of the van (e.g., 8)
    private String fuelType;    // Type of fuel used by the van (e.g., "Diesel", "Petrol")

    public void setMake(String make) {
        this.make = make;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Van) {
                System.out.println("Van ref will compare");
                Van van1 = this;
                Van van2 = (Van) obj;

                // Compare three properties: make, seatingCapacity, and fuelType
                if (van1.make.equals(van2.make) && van1.seatingCapacity == van2.seatingCapacity && van1.fuelType.equals(van2.fuelType)) {
                    System.out.println("Both vans are the same based on make, seatingCapacity, and fuelType");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Van [make=" + make + ", seatingCapacity=" + seatingCapacity + ", fuelType=" + fuelType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, seatingCapacity, fuelType);
    }
}
