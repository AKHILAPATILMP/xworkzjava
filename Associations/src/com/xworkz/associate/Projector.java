package com.xworkz.associate;


public class Projector {
    public static void main(String[] args) {
        Lens lens=new Lens(50);
        Lamp lamp=new Lamp("trip",new Warranty("20/1/0","4/2/2025"));
        lamp.LampDis();
        Port port=new Port("ton",5,new PortType("tyo",200));
        port.displayPortDetails();
        Wire wire=new Wire("brazil",200,new Quality("zoom",5));
        wire.displayWireDetails();
        Board board=new Board("scate",5,new Capacitor(420));
        board.BoardDis();
        Button button=new Button("Blue",true);
        button.displayButtonDetails();
        Remote remote=new Remote("Infosys","Red",new Battery(99,new Voltage(20,"Wat")));
        remote.RemoteDis();
        Screw screw=new Screw(50);
        screw.getMaterial();
        Panel panel=new Panel(150);
        panel.getPanelType();
    }
}
