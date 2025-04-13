package com.xworkz.equals.internal;

import java.util.Objects;

public class Key {
    private String keyType; // Type of key (e.g., "House Key", "Car Key")

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Key) {
                System.out.println("Key ref will compare");
                Key key1 = this;
                Key key2 = (Key) obj;

                if (key1.keyType.equals(key2.keyType)) {
                    System.out.println("Both keys are of the same type");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Key [keyType=" + keyType + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyType);
    }
}
