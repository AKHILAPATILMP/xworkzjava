package com.xworkz.isarelation.cream;
public class FaceCream extends Cream {

    public FaceCream() {
        super();
        System.out.println("FaceCream constructor is running - subclass");
    }

    @Override
    public void apply() {
        System.out.println("Applying face cream gently - subclass");
    }

    @Override
    public void getIngredients() {
        System.out.println("FaceCream contains aloe vera and vitamin E - subclass");
    }

    @Override
    public void checkExpiry() {
        System.out.println("FaceCream expires in 12 months - subclass");
    }

    @Override
    public void remove() {
        System.out.println("Removing face cream with cotton pad - subclass");
    }
}
