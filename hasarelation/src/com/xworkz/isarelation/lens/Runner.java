package com.xworkz.isarelation.lens;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\nCreating instance of Lens:");
        Lens normalLens = new Lens();
        normalLens.focus();
        normalLens.zoom();
        normalLens.clean();
        normalLens.store();
        normalLens.adjust();

        System.out.println("\nCreating instance of ContactLens using Lens reference:");
        Lens lensRef = new ContactLens();
        lensRef.focus();
        lensRef.zoom();
        lensRef.clean();
        lensRef.store();
        lensRef.adjust();

        System.out.println("\nCreating instance of ContactLens using subclass reference:");
        ContactLens contact = new ContactLens();
        contact.focus();
        contact.zoom();
        contact.clean();
        contact.store();
        contact.adjust();
        contact.wear();

        System.out.println("\nUsing LensTechnician to test and cast:");
        LensTechnician technician = new LensTechnician();
        technician.testLens(normalLens);
        technician.testLens(lensRef);
        technician.testLens(contact);
    }
}
