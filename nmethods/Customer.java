class Customer{
public static void buy(String vegetable,int quantity){
System.out.println("customers take " +vegetable+ "for " +quantity+ " rs");

Shop.sell(vegetable,quantity);
}

}