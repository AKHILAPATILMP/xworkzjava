//6. Program to store 50 references and print them:

public class FiftyReferences {
    public static void main(String[] args) {
        String[] references = {
            "Python", "Java", "C++", "JavaScript", "HTML", "CSS", "SQL", "Django", "Flask", "React",
            "Tesla", "BMW", "Audi", "Mercedes", "Volvo", "Ford", "Toyota", "Honda", "Hyundai", "Kia",
            "New York", "Los Angeles", "Chicago", "Houston", "Miami", "Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata",
            "Pizza", "Burger", "Pasta", "Sushi", "Tacos", "Biryani", "Dosa", "Ramen", "Pho", "Falafel",
            "Netflix", "Amazon Prime", "Disney+", "Hulu", "Apple TV", "Spotify", "YouTube", "Twitch", "Reddit", "Instagram"
        };

        System.out.println("50 References:");
        for (String ref : references) {
            System.out.println(ref);
        }
    }
}
