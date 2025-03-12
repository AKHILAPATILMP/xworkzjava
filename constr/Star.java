class Star {
	
    String name;
    int size;
    boolean isShining;
    String color;

    public Star(String name, int size, boolean isShining, String color) {
        
        this.name = name;
        this.size = size;
        this.isShining = isShining;
        this.color = color;
        printDetails();
    }

    void printDetails() {
		System.out.println("Star Details ");
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Shining: " + isShining);
        System.out.println("Color: " + color);
        System.out.println(" \n");
    }
}
class Bag {
    String material;
    int capacity;
    String color;
    boolean isWaterproof;

    public Bag(String material, int capacity, String color, boolean isWaterproof) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.isWaterproof = isWaterproof;
        printDetails();
    }

    void printDetails() {
		System.out.println("Bag Details");
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacity);
        System.out.println("Color: " + color);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("\n");
    }
}

class Metro {
    String name;
    int stations;
    boolean isUnderground;
    String color;

    public Metro(String name, int stations, boolean isUnderground, String color) {
        this.name = name;
        this.stations = stations;
        this.isUnderground = isUnderground;
        this.color = color;
        printDetails();
    }

    void printDetails() {
		System.out.println("Metro Details");
        System.out.println("Metro Name: " + name);
        System.out.println("Stations: " + stations);
        System.out.println("Underground: " + isUnderground);
        System.out.println("Color: " + color);
       System.out.println(" \n");
    }
}
class Industry {
    String name;
    int numberOfEmployees;
    String sector;
    double revenue;

    public Industry(String name, int numberOfEmployees, String sector, double revenue) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.sector = sector;
        this.revenue = revenue;
        printDetails();
    }

    void printDetails() {
		System.out.println("Industry Details");
        System.out.println("Industry Name: " + name);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Sector: " + sector);
        System.out.println("Revenue: $" + revenue + " million");
        System.out.println("\n");
    }
}
class PowerBank {
    String brand;
    int capacity;
    boolean isFastCharging;
    String color;

    public PowerBank(String brand, int capacity, boolean isFastCharging, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.isFastCharging = isFastCharging;
        this.color = color;
        printDetails();
    }

    void printDetails() {
		System.out.println("PowerBank Details");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "mAh");
        System.out.println("Fast Charging: " + isFastCharging);
        System.out.println("Color: " + color);
        System.out.println("\n");
    }
}
class Bottle {

    String brand;
    int capacity;
    String material;
    String color;

    public Bottle(String brand, int capacity, String material, String color) {
        this.brand = brand;
        this.capacity = capacity;
        this.material = material;
        this.color = color;
        printDetails();
    }

    void printDetails() {
		System.out.println("Bottle Details");
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "ml");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("\n");
    }
}
class Lamp {
    String type;
    int wattage;
    boolean isOn;
    String color;

    public Lamp(String type, int wattage, boolean isOn, String color) {
        
        this.type = type;
        this.wattage = wattage;
        this.isOn = isOn;
        this.color = color;
        printDetails();
    }

    void printDetails() {
		System.out.println("Lamp Details");
        System.out.println("Type: " + type);
        System.out.println("Wattage: " + wattage);
        System.out.println("On: " + isOn);
        System.out.println("Color: " + color);
        System.out.println("\n");
    }
}
class Earth {
    String name;
    int radius;
    boolean hasLife;
    String atmosphere;

    public Earth(String name, int radius, boolean hasLife, String atmosphere) {
        this.name = name;
        this.radius = radius;
        this.hasLife = hasLife;
        this.atmosphere = atmosphere;
        printDetails();
    }

    void printDetails() {
		System.out.println("Earth Details");
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius + " km");
        System.out.println("Has Life: " + hasLife);
        System.out.println("Atmosphere: " + atmosphere);
        System.out.println("\n");
    }
}
class Bullet {
    String name;
    int speed;
    boolean isFired;
    String material;

    public Bullet(String name, int speed, boolean isFired, String material) {
        this.name = name;
        this.speed = speed;
        this.isFired = isFired;
        this.material = material;
        printDetails();
    }

    void printDetails() {
		System.out.println("Bullet Details");
        System.out.println("Name: " + name);
        System.out.println("Speed: " + speed + " m/s");
        System.out.println("Fired: " + isFired);
        System.out.println("Material: " + material);
        System.out.println("\n");
    }
}
class Flag {
    String country;
    String color;
    int height;
    boolean isWaving;

    public Flag(String country, String color, int height, boolean isWaving) {
        this.country = country;
        this.color = color;
        this.height = height;
        this.isWaving = isWaving;
        printDetails();
    }

    void printDetails() {
		System.out.println("Flag Details");
        System.out.println("Country: " + country);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height + " meters");
        System.out.println("Waving: " + isWaving);
        System.out.println("\n");
    }
}
class Chocolate {
    String name;
    int weight;
    boolean isDark;
    String flavor;

    public Chocolate(String name, int weight, boolean isDark, String flavor) {
        this.name = name;
        this.weight = weight;
        this.isDark = isDark;
        this.flavor = flavor;
        printDetails();
    }

    void printDetails() {
		System.out.println("Chocolate Details");
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Dark Chocolate: " + isDark);
        System.out.println("Flavor: " + flavor);
        System.out.println("\n");
    }
}
class Camera {
    String brand;
    int resolution;
    boolean isMirrorless;
    String color;

    public Camera(String brand, int resolution, boolean isMirrorless, String color) {
        this.brand = brand;
        this.resolution = resolution;
        this.isMirrorless = isMirrorless;
        this.color = color;
        printDetails();
    }

    void printDetails() {
		System.out.println("Camera Details");
        System.out.println("Brand: " + brand);
        System.out.println("Resolution: " + resolution + " MP");
        System.out.println("Mirrorless: " + isMirrorless);
        System.out.println("Color: " + color);
        System.out.println("\n");
    }
}
class Train {
    String name;
    int capacity;
    boolean isElectric;
    char trackType;

    public Train(String name, int capacity, boolean isElectric, char trackType) {
        this.name = name;
        this.capacity = capacity;
        this.isElectric = isElectric;
        this.trackType = trackType;
        printDetails();
    }

    void printDetails() {
		System.out.println("Train Details");
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity + " passengers");
        System.out.println("Electric: " + isElectric);
        System.out.println("Track Type: " + trackType);
        System.out.println("\n");
    }
}
class Road {
    String name;
    int length;
    boolean isHighway;
    char laneCount;

    public Road(String name, int length, boolean isHighway, char laneCount) {
        this.name = name;
        this.length = length;
        this.isHighway = isHighway;
        this.laneCount = laneCount;
        printDetails();
    }

    void printDetails() {
		System.out.println("Road Details");
        System.out.println("Name: " + name);
        System.out.println("Length: " + length + " km");
        System.out.println("Highway: " + isHighway);
        System.out.println("Lane Count: " + laneCount);
        System.out.println("\n");
    }
}
