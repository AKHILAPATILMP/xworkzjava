class Wire {
    static void conduct() {
        System.out.println("M21-Wire is conducting electricity.");
       
    }

    static void insulate() {
        System.out.println("M22-Wire is insulated.");
    }

    static void bend() {
        System.out.println("M23-Bending the wire.");
       
    }

    static void connect() {
        System.out.println("M24-Connecting the wire.");
		Wire.conduct();
		Wire.insulate();
		Pineapple.ripen();
        Pineapple.slice();
    }
}