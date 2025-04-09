package com.xworkz.runner.external;

import com.xworkz.runner.internal.Wisdom;

public class WisdomRunner {public static void main(String[] args) {
    Wisdom wisdom = new Wisdom(25, "Patience leads to clarity", "Think before you act");
    System.out.println("wisdom" + wisdom.toString());
}
}
