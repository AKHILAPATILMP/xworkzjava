package com.xworkz.later.external;

import com.xworkz.later.internal.Tool;

public class ToolUser {

    Tool tool;

    public ToolUser(Tool tool) {
        this.tool = tool;
        System.out.println("ToolUser is initialized");
    }

    public void activate() {
        if (this.tool != null) {
            this.tool.use();
        } else {
            System.out.println("No tool to use");
        }
    }
}
