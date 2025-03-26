import java.util.Arrays;

public class Country {
    private PrimeMinister primeMinister;
    private Portfolio[] portfolios;
    private Security security1;
    private State[] states;

    public Country() {
        this.portfolios = new Portfolio[]{new Portfolio("Finance"), new Portfolio("Defense")};
        this.security1 = new Security("National Security");
        this.states = new State[]{new State("State A"), new State("State B")};
        this.primeMinister = new PrimeMinister("John Doe", portfolios, security1, states);
    }

    public void display() {
        System.out.println("Country Details:");
        primeMinister.display();
        security1.display();
        System.out.println("States: " + Arrays.toString(states));
    }
}
