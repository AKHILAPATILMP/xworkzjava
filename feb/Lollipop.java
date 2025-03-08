class Lollipop {
    static void unwrap() { System.out.println("Lollipop is being unwrapped."); }
    static void lick() { System.out.println("Licking the lollipop."); }
    static void bite() { System.out.println("Biting the lollipop."); }
    static void checkFlavor() { System.out.println("Lollipop flavor: Strawberry."); }
    static void finish() { System.out.println("Lollipop is finished."); }

    // Invoking methods from Candy class
    static void invokeCandyMethods() {
        Candy.makeSweet();
        Candy.pack();
        Candy.sell();
        Candy.eat();
        Candy.recycleWrapper();
    }

    public static void main(String[] args) {
        // Calling methods within the class
        unwrap();
        lick();
        bite();
        checkFlavor();
        finish();

        // Invoking methods from another class
        invokeCandyMethods();
    }
}
class Candy {
    static void makeSweet() { System.out.println("Making the candy sweet."); }
    static void pack() { System.out.println("Packing the candy."); }
    static void sell() { System.out.println("Selling the candy."); }
    static void eat() { System.out.println("Eating the candy."); }
    static void recycleWrapper() { System.out.println("Recycling candy wrapper."); }
}