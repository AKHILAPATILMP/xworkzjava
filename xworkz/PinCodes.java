//2. Program to store 10 pin-codes and print them:

public class PinCodes {
    public static void main(String[] args) {
        int[] pinCodes = {560001, 110001, 400001, 600001, 700001, 411001, 380001, 500001, 302001, 641001};

        System.out.println("Pin-codes:");
        for (int pin : pinCodes) {
            System.out.println(pin);
        }
    }
}