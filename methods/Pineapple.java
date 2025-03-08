class Pineapple {
    static void taste() {
        System.out.println("M13-Pineapple tastes sweet.");
	}

    static void smell() {
        System.out.println("M14-Pineapple has a tropical smell.");
    }

    static void ripen() {
        System.out.println("M15-Pineapple is ripening.");
        
    }

    static void slice() {
        System.out.println("M16-Slicing the pineapple.");
		Pineapple.taste();
		Pineapple.smell();
		TrafficSignal.yellow();
		TrafficSignal.red();
    }
	
}
