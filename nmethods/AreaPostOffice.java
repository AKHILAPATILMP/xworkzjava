class AreaPostOffice{
public static void deliver(String customername,String address){
	System.out.println("area post officer counts the of postal cards of " + customername + "to deliver at " +address);
		
		  SubRegionalPostOffice.deliver(customername,address);
	
}
}