package com.xworkz.isarelation.lens;

public class LensTechnician {
    public void testLens(Lens lens) {
        lens.focus();
        lens.zoom();
        lens.clean();
        lens.store();
        lens.adjust();

        if (lens instanceof ContactLens) {
            System.out.println("Casting Lens to ContactLens...");
            ContactLens contactLens = (ContactLens) lens;
            contactLens.wear();
        }
    }
}
