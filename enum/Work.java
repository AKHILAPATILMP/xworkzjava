//Write Below Methods

//1. Method to take set of emails and print on console
//2. Method to take set of countries and print only countries ending with 'a' or 'A'
//3. Method to take alphabets and print in ascending order
//4. Method to return list of ingredients by food item

class Work{
public static void getemails( String[] emails){

System.out.println("running email in runner" );

for(String ref: emails){
System.out.println(ref);
}
}

public static void getcountries(String[] countries){
	System.out.println("running countries ends with A in runner" );

for(String ref1: countries){
	if(ref1.endsWith("A")||(ref1.endsWith("a"))){
System.out.println(ref1);
}
}
}	
public static void getalpha(char[] alphabets){
	System.out.println("running alphabets in ascending order in runner" );
	
for(char letter='A';letter<='Z';letter++){
for(char ref2: alphabets){
	if(ref2==letter){
System.out.println(ref2);
}
}	
}
}

public static String[] getFoodItem(String foodItem) {
        System.out.println("Running ingredients by list of food items in runner");

        if (foodItem.equals("pizza")) {
            return new String[]{"Dough", "Toppings"};
        } else if (foodItem.equals("chitranna")) {
            return new String[]{"Paste", "Rice"};
        } else {
            return new String[]{"Ingredients not found"};
        }
}
	}









