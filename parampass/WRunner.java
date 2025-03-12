class WRunner{
public static void main (String[] args){

//1.for harpic 
String color="Red";
String odour="less";
double price=80;
String variety="jasmine";
String stain="yellow stain remover";
Harpic harpic=new Harpic(color,odour,price,variety,stain);
System.out.println("harpic color: "+harpic.color);
System.out.println("harpic odour: "+harpic.odour);
System.out.println("harpic price: "+harpic.price);
System.out.println("harpic variety: "+harpic.variety);
System.out.println("harpic stain: "+harpic.stain);

//2.for festival
String festname="Ugadi";
String culture="Karnataka";
String sweet="holige";
String focus="moon";
String activity="seeing moon in night";
Festival festival=new Festival(festname,culture,sweet,focus,activity);
System.out.println("festival name: "+festival.festname);
System.out.println("festival culture: "+festival.culture);
System.out.println("festival sweet: "+festival.sweet);
System.out.println("festival focus: "+festival.focus);
System.out.println("festival activity: "+festival.activity);

//3.for chat
String panipuri="golgappa";
double prices=30;
String flavours="rajwadi";
String panicolor="light green";
int noofpuri=7;
Chat chat=new Chat(panipuri,prices,flavours,panicolor,noofpuri);
System.out.println("chat type: "+chat.panipuri);
System.out.println("chat prices: "+chat.prices);
System.out.println("chat flavours :"+chat.flavours);
System.out.println("chat color: "+chat.panicolor);
System.out.println("chat number: "+chat.noofpuri);

//4.for charger
String brand = "Samsung";
String type = "Type-C";
double price1 = 1200.50;
int wattage = 25;
String colors = "White";
Charger charger = new Charger(brand, type, price1, wattage, colors);
        System.out.println("charger brand: " + charger.brand);
        System.out.println("charger type: " + charger.type);
        System.out.println("charger price: " + charger.price1);
        System.out.println("charger wattage: " + charger.wattage);
        System.out.println("charger color: " + charger.colors);

// 5.for whatsapp
		String username = "John Doe";
        String phoneNumber = "9742639172";
        String status = "This is my new number:)";
        boolean isOnline = true;
        int unreadMessages = 5;
WhatsApp user = new WhatsApp(username, phoneNumber, status, isOnline, unreadMessages);
        System.out.println("WhatsApp username: " + user.username);
        System.out.println("WhatsApp phone number: " + user.phoneNumber);
        System.out.println("WhatsApp status: " + user.status);
        System.out.println("Is online: " + (user.isOnline ? "Yes" : "No"));
        System.out.println("Unread messages: " + user.unreadMessages);
		
//6.for rat poison
		String brands = "KillRat";
        String chemicalComposition = "Zinc Phosphide";
        double price2 = 150.75;
        int quantityInGrams = 100;
        String color1 = "Dark Green";
RatPoison poison = new RatPoison(brands, chemicalComposition, price2, quantityInGrams, color1);
        System.out.println("Rat poison brand: " + poison.brands);
        System.out.println("Chemical composition: " + poison.chemicalComposition);
        System.out.println("Price: " + poison.price2);
        System.out.println("Quantity: " + poison.quantityInGrams);
        System.out.println("Color: " + poison.color1);
		
//7.for anklet
String material = "Silver";
        String design = "Floral Bells";
        double price3 =1400;
        double length = 25.0; 
        String color2 = "Silver";
Anklet anklet = new Anklet(material, design, price3, length, color2);
        System.out.println("Anklet material: " + anklet.material);
        System.out.println("Anklet design: " + anklet.design);
        System.out.println("Anklet price: ₹" + anklet.price3);
        System.out.println("Anklet length: " + anklet.length);
        System.out.println("Anklet color: " + anklet.color2);
		
//8.for magnet
String types = "Neodymium";
        String shape = "Disc";
        double strength = 1200.75; // in Gauss
        boolean isMagnetized = true;
        int quantity = 10;
        Magnet magnet = new Magnet(types, shape, strength, isMagnetized, quantity);
        System.out.println("Magnet type: " + magnet.types);
        System.out.println("Magnet shape: " + magnet.shape);
        System.out.println("Magnet strength: " + magnet.strength );
        System.out.println("Is magnetized: " + (magnet.isMagnetized));
        System.out.println("Quantity: " + magnet.quantity);
		
//9.for chain
String material1 = "Silver";
        String design1 = "Box Link";
        double length1 = 50.0; 
        double price4 = 2500.00;
        boolean isGoldPlated = false;
        Chain chain = new Chain(material1, design1, length1, price4, isGoldPlated);
        System.out.println("Chain material: " + chain.material1);
        System.out.println("Chain design: " + chain.design1);
        System.out.println("Chain length: " + chain.length1);
        System.out.println("Chain price: ₹" + chain.price4);
        System.out.println("Is gold plated: " + (chain.isGoldPlated ));
		
//10.for bar
 String name = "Skyline Lounge";
        String location = "New York";
        int capacity = 150;
        double rating = 4.5;
        boolean hasLiveMusic = true;
        Bar bar = new Bar(name, location, capacity, rating, hasLiveMusic);
        System.out.println("Bar name: " + bar.name);
        System.out.println("Bar location: " + bar.location);
        System.out.println("Bar capacity: " + bar.capacity);
        System.out.println("Bar rating: " + bar.rating);
        System.out.println("Has live music: " + (bar.hasLiveMusic));
		
//11.for sagar
		String fullName = "Sagar Kumar";
        int age = 28;
        String profession = "Software Engineer";
        double height = 5.9;
        String hometown = "Mysore";
        Sagar sagar = new Sagar(fullName, age, profession, height, hometown);
        System.out.println("Full name: " + sagar.fullName);
        System.out.println("Age: " + sagar.age);
        System.out.println("Profession: " + sagar.profession);
        System.out.println("Height: " + sagar.height);
        System.out.println("Hometown: " + sagar.hometown);
		
//12.for face
String shape1 = "Oval";
        String skinTone = "Medium";
        String eyeColor = "Brown";
        String hairType = "Curly";
        boolean hasFreckles = false;
        Face face = new Face(shape1, skinTone, eyeColor, hairType, hasFreckles);
        System.out.println("Face shape: " + face.shape1);
        System.out.println("Skin tone: " + face.skinTone);
        System.out.println("Eye color: " + face.eyeColor);
        System.out.println("Hair type: " + face.hairType);
        System.out.println("Has freckles: " + (face.hasFreckles ? "Yes" : "No"));
		}
}
