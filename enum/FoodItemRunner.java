public class FoodItemRunner {

    public static String[] getFoodItem(String foodItem) {
        System.out.println("Running ingredients by list of food items in runner");

        if (foodItem.equals("pizza")) {
            return new String[]{"Dough", "Toppings"};
        } else if (foodItem.equals("chitranna")) {
            return new String[]{"Paste", "Rice"};
        } else {
            return new String[]{"Ingredients not found"};
        }
    }

    public static void main(String[] args) {
        String[] foodItems = {"pizza", "chitranna", "idli"};

        for (String item : foodItems) {
            String[] ingredients = getFoodItem(item);
            System.out.println("Ingredients for " + item + ":");
            for (String ingredient : ingredients) {
                System.out.println("- " + ingredient);
            }
            System.out.println();
        }
    }
}
