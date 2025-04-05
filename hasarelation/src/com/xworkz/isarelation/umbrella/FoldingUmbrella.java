package com.xworkz.isarelation.umbrella;

public class FoldingUmbrella extends Umbrella {

    public FoldingUmbrella() {
        super();
        System.out.println("FoldingUmbrella constructor is running - subclass");
    }

    @Override
    public void open() {
        System.out.println("Opening folding umbrella with automatic button - subclass");
    }

    @Override
    public void close() {
        System.out.println("Closing folding umbrella compactly - subclass");
    }

    @Override
    public void provideShade() {
        System.out.println("Folding umbrella providing instant shade - subclass");
    }

    @Override
    public void carry() {
        System.out.println("Folding umbrella is lightweight and easy to carry - subclass");
    }
}


