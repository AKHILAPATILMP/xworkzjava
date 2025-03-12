//For harpic
	
class Harpic{
String color;
String odour;
double price;
String variety;
String stain;
Harpic(String color,String odour,double price,String variety,String stain){
this.color=color;
this.odour=odour;
this.price=price;
this.variety=variety;
this.stain=stain;
System.out.println("harpic parameters passed");
}
}
//for festival
class Festival{
String festname;
String culture;
String sweet;
String focus;
String activity;
Festival(String festname,String culture,String sweet,String focus,String activity){
this.festname=festname;
this.culture=culture;
this.sweet=sweet;
this.focus=focus;
this.activity=activity;
System.out.println("festival parameters passed");
}
}
//for chat
class Chat{
	String panipuri;
	double prices;
	String flavours;
	String panicolor;
	int noofpuri;
Chat(String panipuri,double prices,String flavours,String panicolor,int noofpuri){
	this.panipuri=panipuri;
	this.prices=prices;
	this.flavours=flavours;
	this.panicolor=panicolor;
	this.noofpuri=noofpuri;
System.out.println("chat parameters passed");
}
}
//for charger
class Charger {
    String brand;
    String type;
    double price1;
    int wattage;
    String colors;
Charger(String brand, String type, double price1, int wattage, String colors) {
        this.brand = brand;
        this.type = type;
        this.price1 = price1;
        this.wattage = wattage;
        this.colors = colors;
        System.out.println("charger parameters passed");
    }
}
//for whatsapp
class WhatsApp {
    String username;
    String phoneNumber;
    String status;
    boolean isOnline;
    int unreadMessages;
WhatsApp(String username, String phoneNumber, String status, boolean isOnline, int unreadMessages) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.isOnline = isOnline;
        this.unreadMessages = unreadMessages;
        System.out.println("WhatsApp parameters passed");
    }
}
//for rat poison
class RatPoison {
    String brands;
    String chemicalComposition;
    double price2;
    int quantityInGrams;
    String color1;
RatPoison(String brands, String chemicalComposition, double price2, int quantityInGrams, String color1) {
        this.brands = brands;
        this.chemicalComposition = chemicalComposition;
        this.price2 = price2;
        this.quantityInGrams = quantityInGrams;
        this.color1 = color1;
        System.out.println("Rat poison parameters passed");
    }
}

//for anklet
class Anklet {
    String material;
    String design;
    double price3;
    double length;
    String color2;
Anklet(String material, String design, double price3, double length, String color2) {
        this.material = material;
        this.design = design;
        this.price3 = price3;
        this.length = length;
        this.color2 = color2;
        System.out.println("Anklet parameters passed");
    }
}
//for magnet
class Magnet {
    String types;
    String shape;
    double strength; // in Gauss
    boolean isMagnetized;
    int quantity;
    Magnet(String types, String shape, double strength, boolean isMagnetized, int quantity) {
        this.types = types;
        this.shape = shape;
        this.strength = strength;
        this.isMagnetized = isMagnetized;
        this.quantity = quantity;
        System.out.println("Magnet parameters passed");
    }
}
//for chain
class Chain {
    String material1;
    String design1;
    double length1; // in cm
    double price4; // in currency
    boolean isGoldPlated;
    Chain(String material1, String design1, double length1, double price4, boolean isGoldPlated) {
        this.material1 = material1;
        this.design1 = design1;
        this.length1 = length1;
        this.price4 = price4;
        this.isGoldPlated = isGoldPlated;
        System.out.println("Chain parameters passed");
    }
}
//for bar
class Bar {
    String name;
    String location;
    int capacity;
    double rating;
    boolean hasLiveMusic;
    Bar(String name, String location, int capacity, double rating, boolean hasLiveMusic) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.rating = rating;
        this.hasLiveMusic = hasLiveMusic;
        System.out.println("Bar parameters passed");
    }
}
//for sagar
class Sagar {
    String fullName;
    int age;
    String profession;
    double height;
    String hometown;
    Sagar(String fullName, int age, String profession, double height, String hometown) {
        this.fullName = fullName;
        this.age = age;
        this.profession = profession;
        this.height = height;
        this.hometown = hometown;
        System.out.println("Sagar parameters passed");
    }
}
//for face
class Face {
    String shape1;
    String skinTone;
    String eyeColor;
    String hairType;
    boolean hasFreckles;
    Face(String shape1, String skinTone, String eyeColor, String hairType, boolean hasFreckles) {
        this.shape1 = shape1;
        this.skinTone = skinTone;
        this.eyeColor = eyeColor;
        this.hairType = hairType;
        this.hasFreckles = hasFreckles;
        System.out.println("Face parameters passed");
    }
}