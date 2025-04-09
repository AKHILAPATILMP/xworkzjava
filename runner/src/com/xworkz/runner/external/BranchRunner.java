package com.xworkz.runner.external;

import com.xworkz.runner.internal.Branch;

public class BranchRunner { public static void main(String[] args) {
    Branch branch = new Branch(52, 90.0, "Upper right");
    System.out.println("branch" + branch.toString());
}
}
