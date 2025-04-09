package com.xworkz.runner.external;

import com.xworkz.runner.internal.Change;

public class ChangeRunner {public static void main(String[] args) {
    Change change = new Change("Climate", "Global warming", false);
    System.out.println("change" + change.toString());
}
}
