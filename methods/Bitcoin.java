class Bitcoin {
    static void mine() {
        System.out.println("M41-Mining bitcoin.");
        
    }

    static void transfer() {
        System.out.println("M42-Transferring bitcoin.");
    }

    static void store() {
        System.out.println("M43-Storing bitcoin securely.");
    }

    static void trade() {
        System.out.println("M44-Trading bitcoin.");
		Bitcoin.mine();
		Bitcoin.transfer();
		Wallet.close();
		Wallet.check();
    }
}

