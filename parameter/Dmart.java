class Dmart {
    
    public static void addItem(String item) {
        System.out.println("Added item: " + item);
    }

    public static void checkout(double amount) {
        System.out.println("Total amount: " + amount);
    }

    public static void aisle(int number) {
        System.out.println("Aisle number: " + number);
    }

    
    public static void discount(String item, int percent) {
        System.out.println("Discount on " + item + ": " + percent + "%");
    }

    public static void stock(String item, int quantity) {
        System.out.println("Stocking " + item+ "units of " +quantity);
    }

    
    public static void order(String item, int quantity, double price) {
        System.out.println("Ordered a "+item+ "in"+quantity+ "of"+price);
    }

    public static void deliver(String address, String item, int days) {
        System.out.println("Delivering to" +address+ "a" +item+ "in" +"days");
    }
}