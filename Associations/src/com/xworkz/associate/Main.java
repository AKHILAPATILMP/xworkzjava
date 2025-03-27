package com.xworkz.associate;

public class Main {

        public static void main(String[] args) {
            Lamp lamp = new Lamp("2 years", "Philips");
            Port port = new Port("USB-C", 10);
            Wire wire = new Wire("High", 5);
            Board board = new Board("1000uF", "Plastic");
            Button button = new Button("Metal", "Push");
            Remote remote = new Remote("AA", "Sony");
            Screw screw = new Screw("M3", "Steel");
            Len len = new Len("Zoom", 50);
            Panel panel = new Panel("OLED", 1080);

            lamp.displayInfo();
            port.displayInfo();
            wire.displayInfo();
            board.displayInfo();
            button.displayInfo();
            remote.displayInfo();
            screw.displayInfo();
            len.displayInfo();
            panel.displayInfo();
        }
    }


