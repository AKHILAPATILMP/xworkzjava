package com.xworkz.play;

 class Brush {
    BrushColor color;

    Brush(BrushColor color) {
        this.color = color;
    }

    void clean() {
        System.out.println(color + " brush is cleaning");
    }

    void scrub() {
        System.out.println(color + " brush is scrubbing");
    }
}
