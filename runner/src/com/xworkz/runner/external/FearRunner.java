package com.xworkz.runner.external;

import com.xworkz.runner.internal.Fear;

public class FearRunner {
    public static void main(String[] args) {
        Fear fear = new Fear("An emotion in response to danger", "Shadow of the unknown", 9.2);
        System.out.println("fear" + fear.toString());
    }
}
