class SamRunner{
public static void main(String[] values){

String ref1=Sam.getName(9742369172L);
System.out.println("Name: "+ref1);

String ref2=Sam.getownerName("Apple");
System.out.println("Owner Name: "+ref2);

String ref3=Sam.getpriceName("Rasmalai");
System.out.println("Price: "+ref3);

String ref4=Sam.getbalance(98100L);
System.out.println("Balance: "+ref4);

String ref5=Sam.getsource("Home Depot");
System.out.println("price: "+ref5);

String ref6=Sam.isalive("sameer");
System.out.println("alive or not: "+ref6);
}
}