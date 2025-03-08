class SubRegionalPostOffice{
public static void deliver(String customername,String address){
	System.out.println("sub regional post officer counts the of postal cards of " + customername + "to deliver at " +address);
		
		  RegionalPostOffice.deliver(customername,address);
	
}
}