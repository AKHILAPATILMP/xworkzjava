class Bracelet {
    static void design() {
        System.out.println("M25-Designing the bracelet.");
    }

    static void wear() {
        System.out.println("M26-Wearing the bracelet.");
    }

    static void customize() {
        System.out.println("M27-Customizing the bracelet.");
       
    }

    static void remove() {
        System.out.println("M28-Removing the bracelet.");
		Bracelet.design();
		Bracelet.wear();
		Gold.purify();
		Gold.shape();
    }
}
