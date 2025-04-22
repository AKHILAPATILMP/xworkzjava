package com.xworkz.later.runner;

import com.xworkz.later.internal.Tool;
import com.xworkz.later.internal.ToolImpl;
import com.xworkz.later.external.ToolUser;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool = new ToolImpl();
        ToolUser toolUser = new ToolUser(tool); // abstraction
        toolUser.activate();
    }
}
