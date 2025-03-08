class TrafficSignal {
public static void stop() {
System.out.println("M5-Red light - Stop");

}
public static void green() {
System.out.println("M6-Green light - Go.");

    }

public static void red() {
System.out.println("M7-Red light- stop");

    }
public static void yellow() {
        System.out.println("M8-Yellow light- get ready");
		Lipstick.apply();
		Lipstick.remove();
		TrafficSignal.stop();
		TrafficSignal.green();
    }

}
