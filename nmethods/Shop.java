class Shop{
public static void sell(String vegetable,int quantity){
System.out.println("shop owmer sold" +vegetable + "for" +quantity+ " rs");

Agent.purchase(vegetable,quantity);
}

}