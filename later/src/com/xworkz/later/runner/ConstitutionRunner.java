package com.xworkz.later.runner;

import com.xworkz.later.internal.Constitution;
import com.xworkz.later.internal.CitizenConstitutionImpl;
import com.xworkz.later.external.Government;

public class ConstitutionRunner {
    public static void main(String[] args) {
        Constitution constitution = new CitizenConstitutionImpl();
        Government government = new Government(constitution); // abstraction
        government.ensureLawCompliance();
    }
}
