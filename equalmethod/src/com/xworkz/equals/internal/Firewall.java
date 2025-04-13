package com.xworkz.equals.internal;

import java.util.Objects;

public class Firewall {
    private String name; // The name of the firewall, e.g., "ZoneAlarm", "Norton", etc.
    private String type;
    private double version;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Firewall) {
                System.out.println("Firewall ref will compare");
                Firewall firewall1 = this;
                Firewall firewall2 = (Firewall) obj;

                if (firewall1.name.equals(firewall2.name)) {
                    System.out.println("Both firewalls have the same name");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Firewall [name=" + name + ", type=" + type + ", version=" + version + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, version);
    }
}
