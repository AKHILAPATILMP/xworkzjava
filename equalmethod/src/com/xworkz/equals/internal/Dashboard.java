package com.xworkz.equals.internal;

import java.util.Objects;

public class Dashboard {
    private String layout;
    private String theme;
    private int widgets;
    private boolean isCustomizable;

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setWidgets(int widgets) {
        this.widgets = widgets;
    }

    public void setIsCustomizable(boolean isCustomizable) {
        this.isCustomizable = isCustomizable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");

            if (obj instanceof Dashboard) {
                System.out.println("Dashboard ref will compare");
                Dashboard d1 = this;
                Dashboard d2 = (Dashboard) obj;

                if (d1.layout.equals(d2.layout) && d1.theme.equals(d2.theme)) {
                    System.out.println("Both dashboards have the same layout and theme");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dashboard [layout=" + layout + ", theme=" + theme + ", widgets=" + widgets + ", isCustomizable=" + isCustomizable + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(layout, theme, widgets, isCustomizable);
    }
}
