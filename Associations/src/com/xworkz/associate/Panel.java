package com.xworkz.associate;

public class Panel {

        private String panelType;
        private final int resolution;

        public Panel(String panelType, int resolution) {
            this.panelType = panelType;
            this.resolution = resolution;
        }

        public String getPanelType() {
            return panelType;
        }

        public void setPanelType(String panelType) {
            this.panelType = panelType;
        }

        public void displayInfo() {
            System.out.println("Panel Type: " + panelType + ", Resolution: " + resolution + "p");
        }
    }


