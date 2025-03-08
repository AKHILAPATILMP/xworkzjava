class Brand {
    static void identify() {
        System.out.println("M9-Identifying the brand.");
        
    }

    static void advertise() {
        System.out.println("M10- Advertising the brand.");
    }

    static void compare() {
        System.out.println("M11-Comparing brand features.");
        
    }

    static void review() {
        System.out.println("M12-Reviewing the brand.");
		Brand.identify();
		Brand.advertise();
		Lipstick.dry();
		Lipstick.shine();
    }
}
