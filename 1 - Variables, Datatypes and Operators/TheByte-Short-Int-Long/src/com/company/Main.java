package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 2147483647; // 4 bytes - 32bits
        int number2 = -2147483648; // 4 bytes - 32bits

        // java 7 feature
        int number3 = 2_147_483_647;

        byte myByteValue = 127; // -128 to 127 - 1 byte - 8bits
        byte myNewByte = (byte) (myByteValue/2);

        short myShortValue = 32767; // 2 bytes - 16bits
        short myNewShort = (short) (myShortValue/2);

        long myLongValue = 100L; // 8 bytes - 64bits
        // No need for casting, since this is a bigger primitive time
        long longTotal = 5000 + myByteValue + myShortValue + number3;
    }
}
