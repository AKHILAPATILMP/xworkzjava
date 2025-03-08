class FoodItem {
    
    public static void cook(String item) {
        System.out.println("Cooking: " + item);
    }

    public static void price(double cost) {
        System.out.println("Price: " + cost);
    }

    public static void serve(String dishName) {
        System.out.println("Serving: " + dishName);
    }

    
    public static void store(String item, int quantity) {
        System.out.println("Storing " + item + " units of " + quantity);
    }

    public static void expire(String item, int days) {
        System.out.println(item + " expires in " + days + " days");
    }

    
    public static void pack(String item, int weight, String packagingType) {
        System.out.println("Packing " + item + "in " + weight + " of " + packagingType + " package");
    }

    public static void order(String item, int quantity, double price) {
        System.out.println("Ordered " + item + " of " + quantity+ " for " + price);
    }
}