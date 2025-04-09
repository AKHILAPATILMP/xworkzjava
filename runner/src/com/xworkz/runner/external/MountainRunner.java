package com.xworkz.runner.external;

import com.xworkz.runner.internal.Mountain;

public class MountainRunner {
    public static void main(String[] args) {
    Mountain mountain = new Mountain("A large natural elevation", "Strength and challenge", 9.0);
    System.out.println("mountain" + mountain.toString());
}

}
