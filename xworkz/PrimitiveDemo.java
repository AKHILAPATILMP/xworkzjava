
// Class for byte type
class Byte {
    byte roomNumber, maxAttempts, doorLock, batteryLevel, queueSize;

    void initialize() {
        roomNumber = 5;
        maxAttempts = 3;
        doorLock = 1;
        batteryLevel = 75;
        queueSize = 20;
    }

    void reinitialize() {
        roomNumber = 10;
        maxAttempts = 5;
        doorLock = 0;
        batteryLevel = 90;
        queueSize = 30;
    }

    void printValues() {
        System.out.println("Byte values:");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Max Attempts: " + maxAttempts);
        System.out.println("Door Lock: " + doorLock);
        System.out.println("Battery Level: " + batteryLevel);
        System.out.println("Queue Size: " + queueSize);
    }
}

// Class for short type
class Short {
    short studentCount, yearStarted, buildingHeight, tripDistance, waterTemperature;

    void initialize() {
        studentCount = 25;
        yearStarted = 1998;
        buildingHeight = 175;
        tripDistance = 120;
        waterTemperature = 30;
    }

    void reinitialize() {
        studentCount = 30;
        yearStarted = 2000;
        buildingHeight = 180;
        tripDistance = 150;
        waterTemperature = 35;
    }

    void printValues() {
        System.out.println("Short values:");
        System.out.println("Student Count: " + studentCount);
        System.out.println("Year Started: " + yearStarted);
        System.out.println("Building Height: " + buildingHeight);
        System.out.println("Trip Distance: " + tripDistance);
        System.out.println("Water Temperature: " + waterTemperature);
    }
}

// Class for int type
class Int {
    int employeeId, orderNumber, productCount, price, score;

    void initialize() {
        employeeId = 1001;
        orderNumber = 5001;
        productCount = 15;
        price = 300;
        score = 85;
    }

    void reinitialize() {
        employeeId = 1002;
        orderNumber = 5002;
        productCount = 20;
        price = 400;
        score = 90;
    }

    void printValues() {
        System.out.println("Int values:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Product Count: " + productCount);
        System.out.println("Price: " + price);
        System.out.println("Score: " + score);
    }
}

// Class for long type
class Long {
    long population, distance, bankBalance, phoneNumber, starCount;

    void initialize() {
        population = 7800000000L;
        distance = 384400L;
        bankBalance = 1000000L;
        phoneNumber = 9876543210L;
        starCount = 1000000000L;
    }

    void reinitialize() {
        population = 8000000000L;
        distance = 500000L;
        bankBalance = 2000000L;
        phoneNumber = 9123456789L;
        starCount = 2000000000L;
    }

    void printValues() {
        System.out.println("Long values:");
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
        System.out.println("Bank Balance: " + bankBalance);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Star Count: " + starCount);
    }
}

// Class for float type
class Float {
    float height, width, weight, temperature, speed;

    void initialize() {
        height = 5.9f;
        width = 2.5f;
        weight = 70.5f;
        temperature = 36.6f;
        speed = 65.4f;
    }

    void reinitialize() {
        height = 6.1f;
        width = 3.0f;
        weight = 75.0f;
        temperature = 37.2f;
        speed = 80.0f;
    }

    void printValues() {
        System.out.println("Float values:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Weight: " + weight);
        System.out.println("Temperature: " + temperature);
        System.out.println("Speed: " + speed);
    }
}

// Class for double type
class Double{
    double pi, gravity, distanceToMoon, lightSpeed, atomicMass;

    void initialize() {
        pi = 3.14159;
        gravity = 9.81;
        distanceToMoon = 384400.0;
        lightSpeed = 299792458.0;
        atomicMass = 1.66e-27;
    }

    void reinitialize() {
        pi = 3.14;
        gravity = 9.8;
        distanceToMoon = 400000.0;
        lightSpeed = 300000000.0;
        atomicMass = 1.67e-27;
    }

    void printValues() {
        System.out.println("Double values:");
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
        System.out.println("Distance to Moon: " + distanceToMoon);
        System.out.println("Light Speed: " + lightSpeed);
        System.out.println("Atomic Mass: " + atomicMass);
    }
}

// Class for char type
class Char {
    char grade, initial, symbol, direction, vowel;

    void initialize() {
        grade = 'A';
        initial = 'J';
        symbol = '@';
        direction = 'S';
        vowel = 'E';
    }

    void reinitialize() {
        grade = 'B';
        initial = 'M';
        symbol = '#';
        direction = 'N';
        vowel = 'I';
    }

    void printValues() {
        System.out.println("Char values:");
        System.out.println("Grade: " + grade);
        System.out.println("Initial: " + initial);
        System.out.println("Symbol: " + symbol);
        System.out.println("Direction: " + direction);
        System.out.println("Vowel: " + vowel);
    }
}

// Class for boolean type
class Boolean {
    boolean isAvailable, isOnline, isActive, isVerified, isComplete;

    void initialize() {
        isAvailable = true;
        isOnline = false;
        isActive = true;
        isVerified = false;
        isComplete = true;
    }

    void reinitialize() {
        isAvailable = false;
        isOnline = true;
        isActive = false;
        isVerified = true;
        isComplete = false;
    }

    void printValues() {
        System.out.println("Boolean values:");
        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Online: " + isOnline);
        System.out.println("Is Active: " + isActive);
        System.out.println("Is Verified: " + isVerified);
        System.out.println("Is Complete: " + isComplete);
    }
}

// Main class to run the program

public class PrimitiveDemo {
    public static void main(String[] args) {
        System.out.println("----- ByteDemo -----");
        Byte byteDemo = new Byte();
        byteDemo.initialize();
        byteDemo.printValues();
        byteDemo.reinitialize();
        byteDemo.printValues();

        System.out.println("\n----- ShortDemo -----");
        Short shortDemo = new Short();
        shortDemo.initialize();
        shortDemo.printValues();
        shortDemo.reinitialize();
        shortDemo.printValues();

        System.out.println("\n----- IntDemo -----");
        Int intDemo = new Int();
        intDemo.initialize();
        intDemo.printValues();
        intDemo.reinitialize();
        intDemo.printValues();

        System.out.println("\n----- LongDemo -----");
        Long longDemo = new Long();
        longDemo.initialize();
        longDemo.printValues();
        longDemo.reinitialize();
        longDemo.printValues();

        System.out.println("\n----- FloatDemo -----");
        Float floatDemo = new Float();
        floatDemo.initialize();
        floatDemo.printValues();
        floatDemo.reinitialize();
        floatDemo.printValues();

        System.out.println("\n----- DoubleDemo -----");
        Double doubleDemo = new Double();
        doubleDemo.initialize();
        doubleDemo.printValues();
        doubleDemo.reinitialize();
        doubleDemo.printValues();

        System.out.println("\n----- CharDemo -----");
        Char charDemo = new Char();
        charDemo.initialize();
        charDemo.printValues();
        charDemo.reinitialize();
        charDemo.printValues();

        System.out.println("\n----- BooleanDemo -----");
        Boolean booleanDemo = new Boolean();
        booleanDemo.initialize();
        booleanDemo.printValues();
        booleanDemo.reinitialize();
        booleanDemo.printValues();
    }
}

