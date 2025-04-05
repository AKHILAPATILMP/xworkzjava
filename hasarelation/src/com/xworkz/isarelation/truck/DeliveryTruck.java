package com.xworkz.isarelation.truck;
public class DeliveryTruck extends Truck {

    public DeliveryTruck() {
        super();
        System.out.println("DeliveryTruck constructor is running - subclass");
    }

    @Override
    public void startEngine() {
        System.out.println("DeliveryTruck engine starts with GPS tracking - subclass");
    }

    @Override
    public void loadGoods() {
        System.out.println("DeliveryTruck loads packages with barcode scanning - subclass");
    }

    @Override
    public void unloadGoods() {
        System.out.println("DeliveryTruck unloads goods at scheduled stops - subclass");
    }

    @Override
    public void stopEngine() {
        System.out.println("DeliveryTruck engine stops and logs delivery - subclass");
    }
}
