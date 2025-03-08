class Agent{
public static void purchase(String vegetable,int quantity){
System.out.println("Agent purchase " + vegetable + "for a" + quantity+ "rs ");

Broker.brokerage(vegetable,quantity);
}

}