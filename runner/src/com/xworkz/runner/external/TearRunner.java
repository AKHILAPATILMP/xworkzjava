package com.xworkz.runner.external;

import com.xworkz.runner.internal.Tear;

public class TearRunner { public static void main(String[] args) {
    Tear tear = new Tear("Farewell", 3, "Sadness");
    System.out.println("tear" + tear.toString());
}
}
