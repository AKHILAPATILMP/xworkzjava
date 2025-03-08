//5. Program to store 10 temple names and print them:

public class TempleNames {
    public static void main(String[] args) {
        String[] temples = {"Kedarnath", "Meenakshi", "Golden Temple", "Jagannath", "Tirupati", 
                            "Vaishno Devi", "Somnath", "Badrinath", "Sabarimala", "Mahakaleshwar"};

        System.out.println("Temple Names:");
        for (String temple : temples) {
            System.out.println(temple);
        }
    }
}