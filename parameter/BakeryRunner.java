class BakeryRunner{

public static void main(String[] values) {

System.out.println("bakery runner");

String itemName="sweet";
String quantity="2";
Bakery.buy(itemName,quantity);

boolean yesorno=true;
Bakery.open(yesorno);

Bakery.close(yesorno);

String name="suma";
Bakery.cashier(name);

String names="ram and rahul";
Bakery.owner(names);

}
}
