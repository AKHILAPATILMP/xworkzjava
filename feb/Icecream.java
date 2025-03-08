class Icecream {
    static void scoop() { System.out.println("Scooping the ice cream."); }
    static void addToppings() { System.out.println("Adding chocolate toppings."); }
    static void serve() { System.out.println("Serving the ice cream."); }
    static void eat() { System.out.println("Eating the ice cream."); }
    static void melt() { System.out.println("Ice cream is melting!"); }

    // Invoking methods from Dessert class
    static void invokeDessertMethods() {
        Dessert.prepareCone();
        Dessert.makeSundae();
        Dessert.freeze();
        Dessert.decorate();
        Dessert.sell();
    }

    public static void main(String[] args) {
        scoop();
        addToppings();
        serve();
        eat();
        melt();

        invokeDessertMethods();
    }
}

class Dessert {
    static void prepareCone() { System.out.println("Preparing a waffle cone."); }
    static void makeSundae() { System.out.println("Making an ice cream sundae."); }
    static void freeze() { System.out.println("Freezing the ice cream."); }
    static void decorate() { System.out.println("Decorating with sprinkles."); }
    static void sell() { System.out.println("Selling ice cream in the shop."); }
}