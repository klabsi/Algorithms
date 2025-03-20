package org.sawaklaudia.recursion;

public class BinaryConversion {

    public static void main(String[] args) {
        int decimal = 163;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + " to binary: " + binary);
        System.out.println("for loop: ");
        System.out.println(toBinary(decimal));
        System.out.println("recursion: ");
        System.out.println(toBinaryRecursively(decimal, ""));
    }

    public static int toBinary(int decimal) {
        int temp = decimal;
        int rest = 0;
        String binary = "";
        while (temp > 0) {
            rest = temp % 2;
            temp = temp / 2;
            binary = rest + binary;
        }
        return Integer.parseInt(binary);
    }

    public static int toBinaryRecursively(int decimal, String binary) {
        if (decimal == 0) {
            return Integer.parseInt(binary);
        }

        return toBinaryRecursively(decimal / 2, decimal % 2 + binary);
    }

}
