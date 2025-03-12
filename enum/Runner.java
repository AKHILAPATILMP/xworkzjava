class Runner{
public static void main(String[] values){
String [] emails={"priyarao13@gmail.com","arjun.gowda@gmail.com","deepa.hegde@gmail.com","vinay.kulkarni@gmail.com","megha.naik@gmail.com" };
Work.getemails(emails);

String [] countries={"India","AmericA","Russia","ArgentinA","AustraliA","Agfghan","Bahrain","Belgium" };
Work.getcountries(countries);

char [] alphabets={'A', 'M', 'P', 'C', 'Z', 'T', 'J', 'F', 'X', 'B', 'N', 'Q', 'Y', 'D', 'L', 'V', 'E', 'O', 'R', 'W', 'K', 'G', 'U', 'H', 'S', 'I' };
Work.getalpha(alphabets);

String[] foodItems = {"pizza", "chitranna", "idli"};
for (String ref3 : foodItems) 
{
String[] ingredients = Work.getFoodItem(ref3);
System.out.println("Ingredients for " + ref3 + ":");
for (String ingredient : ingredients) {
System.out.println(ingredient);
}
System.out.println();
}
   	
}
}
