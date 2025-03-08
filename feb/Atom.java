class Atom {
    // 5 methods within the Atom class
    static void describeStructure() { System.out.println("Atoms consist of protons, neutrons, and electrons."); }
    static void explainBohrModel() { System.out.println("Electrons orbit the nucleus in energy levels."); }
    static void defineAtomicNumber() { System.out.println("Atomic number represents the number of protons in an atom."); }
    static void discussIsotopes() { System.out.println("Isotopes are atoms with the same protons but different neutrons."); }
    static void showElectronConfiguration() { System.out.println("Electron configuration follows the Aufbau principle."); }

    // Method to invoke methods from Physics class
    static void invokePhysicsMethods() {
        Physics.explainQuantumTheory();
        Physics.defineWaveParticleDuality();
        Physics.describeStrongForce();
        Physics.explainNuclearFission();
        Physics.discussParticlePhysics();
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Calling methods within Atom class
        describeStructure();
        explainBohrModel();
        defineAtomicNumber();
        discussIsotopes();
        showElectronConfiguration();

        // Calling methods from the Physics class
        invokePhysicsMethods();
    }
}

// Separate class for Physics-related concepts
class Physics {
    static void explainQuantumTheory() { System.out.println("Quantum theory explains atomic behavior at subatomic levels."); }
    static void defineWaveParticleDuality() { System.out.println("Electrons exhibit both wave and particle characteristics."); }
    static void describeStrongForce() { System.out.println("The strong nuclear force holds the nucleus together."); }
    static void explainNuclearFission() { System.out.println("Nuclear fission splits an atomic nucleus, releasing energy."); }
    static void discussParticlePhysics() { System.out.println("Particle physics studies fundamental particles and forces."); }
}