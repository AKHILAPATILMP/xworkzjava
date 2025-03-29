package com.xworkz.associate;

public class Panel {

        private String panelType;
        private final int resolution;

        public Panel(int resolution) {
            System.out.println("Running non-static method Panel");
            this.resolution = resolution;
            this.panelType = "LCD"; // Default value
            System.out.println("Resolution: " + this.resolution);
            System.out.println("Panel Type: " + this.panelType);
        }

        public void setPanelType(String panelType) {
            this.panelType = panelType;
        }

        public String getPanelType() {
            return this.panelType;
        }
    }
