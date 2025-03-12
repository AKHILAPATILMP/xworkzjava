// Define 5 classes with explicit constructors

public class InstanceCreators {
class ClassA {
    ClassA() {
        System.out.println("Instance of ClassA created");
    }
}

class ClassB {
    ClassB() {
        System.out.println("Instance of ClassB created");
    }
}

class ClassC {
    ClassC() {
        System.out.println("Instance of ClassC created");
    }
}

class ClassD {
    ClassD() {
        System.out.println("Instance of ClassD created");
    }
}

class ClassE {
    ClassE() {
        System.out.println("Instance of ClassE created");
    }
}


    public void createinstances() {
        System.out.println("Creating instances");

        // Create 5 instances of each class
        for (int i = 1; i <= 5; i++) {
            new ClassA();
            new ClassB();
            new ClassC();
            new ClassD();
            new ClassE();
        }

        System.out.println("25 instances created for each class");
    }
}