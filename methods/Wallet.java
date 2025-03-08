class Wallet {
    static void store() {
        System.out.println("M33-Storing cash in the wallet.");
        
    }

    static void open() {
        System.out.println("M34-Opening the wallet.");
    }

    static void close() {
        System.out.println("M35-Closing the wallet.");
        
    }

    static void check() {
        System.out.println("M36-Checking the wallet.");
		Wallet.store();
		Wallet.open();
		Bracelet.customize();
		Bracelet.remove();
    }
}
