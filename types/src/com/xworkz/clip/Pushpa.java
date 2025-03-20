package com.xworkz.clip;

public class Pushpa {
        void useClip (Clip[]clips){
            for (Clip clip : clips) {
                clip.hold();

            }
        }

    public static void main(String[] args){
        Clip[] clips = {
                new Clip("Red"),
                new Clip("Blue"),
                new Clip("Green"),
                new Clip("Yellow"),
                new Clip("Black")
        };
        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);
    }
}


