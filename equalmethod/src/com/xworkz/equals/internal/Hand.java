package com.xworkz.equals.internal;

import java.util.Objects;

public class Hand {
    private String type;   // E.g., "Right" or "Left"
    private int numberOfFingers;
    private boolean isDominant; // True if dominant hand

    public void setType(String type) {
        this.type = type;
    }

    public void setNumberOfFingers(int numberOfFingers) {
        this.numberOfFingers = numberOfFingers;
    }

    public void setIsDominant(boolean isDominant) {
        this.isDominant = isDominant;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Hand) {
                System.out.println("Hand ref will compare");
                Hand hand1 = this;
                Hand hand2 = (Hand) obj;

                // Compare three properties: type, number of fingers, and dominance
                if (hand1.type.equals(hand2.type) && hand1.numberOfFingers == hand2.numberOfFingers && hand1.isDominant == hand2.isDominant) {
                    System.out.println("Both hands are the same based on type, number of fingers, and dominance");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hand [type=" + type + ", numberOfFingers=" + numberOfFingers + ", isDominant=" + isDominant + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numberOfFingers, isDominant);
    }
}
