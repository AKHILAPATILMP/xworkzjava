class PostHeadMaster{
	public static void deliver(String customername,String address){
		System.out.println("post head coolects the of card of " + customername + "to deliver at " +address);
		
		 PostMaster.deliver(customername,address);
	}
	
}