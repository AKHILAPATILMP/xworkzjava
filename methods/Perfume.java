class Perfume {
    static void spray() {
        System.out.println("M29-Spraying perfume.");
        
    }

    static void smell() {
        System.out.println("M30-Perfume smells good.");
    }

    static void evaporate() {
        System.out.println("M31-Perfume is evaporating.");
        
    }

    static void bottle() {
        System.out.println("M32-Storing perfume in a bottle.");
		Perfume.spray();
		Perfume.smell();
		Wire.bend();
		Wire.connect();
    }
	
}
