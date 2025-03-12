public class Main {
    public static void main(String[] args) {
        System.out.println("Creating 10 copies for each data type with 4 instance variables:\n");

       //For Star
        Star star1 = new Star("Star1", 10, true, "Yellow");
        Star star2 = new Star("Star2", 20, false, "Blue");
        Star star3 = new Star("Star3", 15, true, "White");
        Star star4 = new Star("Star4", 25, true, "Red");
        Star star5 = new Star("Star5", 30, false, "Green");
        Star star6 = new Star("Star6", 35, true, "Purple");
        Star star7 = new Star("Star7", 40, false, "Orange");
        Star star8 = new Star("Star8", 45, true, "Pink");
        Star star9 = new Star("Star9", 50, false, "Gold");
        Star star10 = new Star("Star10", 55, true, "Silver");
		System.out.println("--------------------\n");
		
		// For Bag
        Bag bag1 = new Bag("Leather", 5, "Brown", true);
        Bag bag2 = new Bag("Canvas", 10, "Black", false);
        Bag bag3 = new Bag("Nylon", 8, "Blue", true);
        Bag bag4 = new Bag("Plastic", 3, "Red", false);
        Bag bag5 = new Bag("Polyester", 7, "Green", true);
        Bag bag6 = new Bag("Cotton", 6, "White", false);
        Bag bag7 = new Bag("Denim", 12, "Indigo", true);
        Bag bag8 = new Bag("Suede", 4, "Tan", false);
        Bag bag9 = new Bag("Velvet", 9, "Purple", true);
        Bag bag10 = new Bag("Jute", 15, "Yellow", false);
		System.out.println("--------------------");
		
		
		//For Metro
        Metro metro1 = new Metro("Line 1", 10, true, "Red");
        Metro metro2 = new Metro("Line 2", 15, false, "Blue");
        Metro metro3 = new Metro("Line 3", 20, true, "Green");
        Metro metro4 = new Metro("Line 4", 12, false, "Yellow");
        Metro metro5 = new Metro("Line 5", 18, true, "Purple");
        Metro metro6 = new Metro("Line 6", 22, false, "Orange");
        Metro metro7 = new Metro("Line 7", 25, true, "Pink");
        Metro metro8 = new Metro("Line 8", 30, false, "Gray");
        Metro metro9 = new Metro("Line 9", 35, true, "White");
        Metro metro10 = new Metro("Line 10", 40, false, "Black");
		System.out.println("--------------------");
		
		//For Industry
		Industry industry1 = new Industry("TechCorp", 5000, "Technology", 120.5);
        Industry industry2 = new Industry("HealthPlus", 3000, "Healthcare", 80.2);
        Industry industry3 = new Industry("EcoEnergy", 1000, "Renewable Energy", 45.8);
        Industry industry4 = new Industry("Foodies", 1500, "Food & Beverages", 60.4);
        Industry industry5 = new Industry("AutoMotive", 2000, "Automobile", 110.3);
        Industry industry6 = new Industry("EduLearn", 2500, "Education", 75.1);
        Industry industry7 = new Industry("FashionHub", 1200, "Fashion", 40.7);
        Industry industry8 = new Industry("BuildWell", 1800, "Construction", 95.6);
        Industry industry9 = new Industry("MediaWorks", 2200, "Media & Entertainment", 70.9);
        Industry industry10 = new Industry("AgriGrow", 800, "Agriculture", 35.4);
		System.out.println("--------------------");
		
		// For PowerBank
        PowerBank pb1 = new PowerBank("Anker", 10000, true, "Black");
        PowerBank pb2 = new PowerBank("Xiaomi", 20000, false, "White");
        PowerBank pb3 = new PowerBank("Samsung", 15000, true, "Blue");
        PowerBank pb4 = new PowerBank("Realme", 25000, false, "Yellow");
        PowerBank pb5 = new PowerBank("OnePlus", 30000, true, "Red");
        PowerBank pb6 = new PowerBank("Sony", 35000, false, "Silver");
        PowerBank pb7 = new PowerBank("Baseus", 40000, true, "Green");
        PowerBank pb8 = new PowerBank("RavPower", 45000, false, "Purple");
        PowerBank pb9 = new PowerBank("Ugreen", 50000, true, "Orange");
        PowerBank pb10 = new PowerBank("Belkin", 55000, false, "Gold");
		System.out.println("--------------------");
		
		// For Bottle
        Bottle bottle1 = new Bottle("Bottle1", 500, "Plastic", "Blue");
        Bottle bottle2 = new Bottle("Bottle2", 750, "Glass", "Green");
        Bottle bottle3 = new Bottle("Bottle3", 1000, "Steel", "Silver");
        Bottle bottle4 = new Bottle("Bottle4", 600, "Aluminum", "Red");
        Bottle bottle5 = new Bottle("Bottle5", 400, "Copper", "Brown");
        Bottle bottle6 = new Bottle("Bottle6", 800, "Plastic", "Yellow");
        Bottle bottle7 = new Bottle("Bottle7", 1200, "Glass", "Purple");
        Bottle bottle8 = new Bottle("Bottle8", 900, "Steel", "Black");
        Bottle bottle9 = new Bottle("Bottle9", 1100, "Aluminum", "White");
        Bottle bottle10 = new Bottle("Bottle10", 700, "Plastic", "Orange");
		System.out.println("--------------------");
		
		// For Lamp
        Lamp lamp1 = new Lamp("Table Lamp", 40, true, "White");
        Lamp lamp2 = new Lamp("Floor Lamp", 60, false, "Black");
        Lamp lamp3 = new Lamp("Desk Lamp", 30, true, "Yellow");
        Lamp lamp4 = new Lamp("Ceiling Lamp", 75, true, "Gold");
        Lamp lamp5 = new Lamp("Night Lamp", 20, false, "Blue");
        Lamp lamp6 = new Lamp("Wall Lamp", 50, true, "Red");
        Lamp lamp7 = new Lamp("Chandelier", 100, false, "Crystal");
        Lamp lamp8 = new Lamp("Reading Lamp", 25, true, "Green");
        Lamp lamp9 = new Lamp("Outdoor Lamp", 80, false, "Orange");
        Lamp lamp10 = new Lamp("Bedside Lamp", 35, true, "Purple");
		System.out.println("--------------------");
		
		// For Earth
        Earth earth1 = new Earth("Earth1", 6371, true, "Nitrogen-Oxygen");
        Earth earth2 = new Earth("Earth2", 6400, false, "Carbon Dioxide");
        Earth earth3 = new Earth("Earth3", 6300, true, "Methane");
        Earth earth4 = new Earth("Earth4", 6500, false, "Hydrogen");
        Earth earth5 = new Earth("Earth5", 6200, true, "Oxygen");
        Earth earth6 = new Earth("Earth6", 6100, false, "Helium");
        Earth earth7 = new Earth("Earth7", 6450, true, "Argon");
        Earth earth8 = new Earth("Earth8", 6550, false, "Neon");
        Earth earth9 = new Earth("Earth9", 6350, true, "Nitrous Oxide");
        Earth earth10 = new Earth("Earth10", 6600, false, "Sulfur Dioxide");
		System.out.println("--------------------");
		
		 // For Bullet
        Bullet bullet1 = new Bullet("Bullet1", 300, true, "Steel");
        Bullet bullet2 = new Bullet("Bullet2", 400, false, "Copper");
        Bullet bullet3 = new Bullet("Bullet3", 350, true, "Lead");
        Bullet bullet4 = new Bullet("Bullet4", 450, false, "Brass");
        Bullet bullet5 = new Bullet("Bullet5", 500, true, "Aluminum");
        Bullet bullet6 = new Bullet("Bullet6", 550, false, "Titanium");
        Bullet bullet7 = new Bullet("Bullet7", 600, true, "Nickel");
        Bullet bullet8 = new Bullet("Bullet8", 650, false, "Silver");
        Bullet bullet9 = new Bullet("Bullet9", 700, true, "Gold");
        Bullet bullet10 = new Bullet("Bullet10", 750, false, "Carbon");
		System.out.println("--------------------");
		
		// For Flag
        Flag flag1 = new Flag("India", "Tricolor", 30, true);
        Flag flag2 = new Flag("USA", "Red, White, Blue", 40, true);
        Flag flag3 = new Flag("Germany", "Black, Red, Yellow", 25, false);
        Flag flag4 = new Flag("France", "Blue, White, Red", 35, true);
        Flag flag5 = new Flag("Japan", "White with Red Circle", 20, false);
        Flag flag6 = new Flag("Brazil", "Green, Yellow, Blue", 45, true);
        Flag flag7 = new Flag("UK", "Union Jack", 50, false);
        Flag flag8 = new Flag("Italy", "Green, White, Red", 30, true);
        Flag flag9 = new Flag("China", "Red with Stars", 40, false);
        Flag flag10 = new Flag("Australia", "Blue with Stars", 35, true);
		System.out.println("--------------------");
		
		// For Chocolate
        Chocolate choco1 = new Chocolate("Choco1", 50, true, "Mint");
        Chocolate choco2 = new Chocolate("Choco2", 60, false, "Strawberry");
        Chocolate choco3 = new Chocolate("Choco3", 45, true, "Orange");
        Chocolate choco4 = new Chocolate("Choco4", 70, false, "Hazelnut");
        Chocolate choco5 = new Chocolate("Choco5", 55, true, "Almond");
        Chocolate choco6 = new Chocolate("Choco6", 65, false, "Caramel");
        Chocolate choco7 = new Chocolate("Choco7", 40, true, "Coconut");
        Chocolate choco8 = new Chocolate("Choco8", 75, false, "Peanut Butter");
        Chocolate choco9 = new Chocolate("Choco9", 80, true, "Raspberry");
        Chocolate choco10 = new Chocolate("Choco10", 90, false, "Coffee");
		System.out.println("--------------------");
		
		// For Camera
        Camera cam1 = new Camera("Canon", 24, true, "Black");
        Camera cam2 = new Camera("Nikon", 30, false, "Silver");
        Camera cam3 = new Camera("Sony", 20, true, "White");
        Camera cam4 = new Camera("Fujifilm", 26, false, "Red");
        Camera cam5 = new Camera("Panasonic", 32, true, "Blue");
        Camera cam6 = new Camera("Olympus", 28, false, "Green");
        Camera cam7 = new Camera("Leica", 40, true, "Gray");
        Camera cam8 = new Camera("Pentax", 18, false, "Yellow");
        Camera cam9 = new Camera("GoPro", 12, true, "Black");
        Camera cam10 = new Camera("Samsung", 22, false, "Pink");
		System.out.println("--------------------");
		
		// For Train
        Train train1 = new Train("Express", 200, true, 'A');
        Train train2 = new Train("Metro", 150, false, 'B');
        Train train3 = new Train("Bullet", 300, true, 'C');
        Train train4 = new Train("Freight", 400, false, 'D');
        Train train5 = new Train("Passenger", 250, true, 'E');
        Train train6 = new Train("Monorail", 100, false, 'F');
        Train train7 = new Train("Subway", 180, true, 'G');
        Train train8 = new Train("Regional", 220, false, 'H');
        Train train9 = new Train("Intercity", 280, true, 'I');
        Train train10 = new Train("Sleeper", 350, false, 'J');
		System.out.println("--------------------");
		
		// For Road
        Road road1 = new Road("Highway 1", 100, true, '4');
        Road road2 = new Road("Main St", 50, false, '2');
        Road road3 = new Road("Ocean Drive", 80, true, '6');
        Road road4 = new Road("Valley Rd", 60, false, '3');
        Road road5 = new Road("Sunset Blvd", 120, true, '5');
        Road road6 = new Road("Park Ave", 40, false, '2');
        Road road7 = new Road("Mountain Pass", 70, true, '3');
        Road road8 = new Road("Riverside Rd", 90, false, '4');
        Road road9 = new Road("Expressway", 150, true, '8');
        Road road10 = new Road("Countryside Ln", 30, false, '1');
		System.out.println("--------------------");
    }
    }




