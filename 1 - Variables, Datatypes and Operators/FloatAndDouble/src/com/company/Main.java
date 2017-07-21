package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5; // 32 bits = 4 bytes
	    float myFloatValue = 5.2f; // 32 bits = 4 bytes
        float myFloatValueDivide = 5.2f / 2.1f;
        float myCastedFloat = (float) 4.20;
        // but java will naturally assume this literal is a double
	    double myDoubleValue = 5.25d; // 64 bits = 8 bytes
        double myDoubleValueDivided = 5.20d / 2.1d;
        double mySecondDoubleValue = 5.20; // this is fine as well

        System.out.println("myInvValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue); // 7 decimal digits of precision
        System.out.println("myFloatValueDivide = " + myFloatValueDivide);
        System.out.println("myCastedFloat = " + myCastedFloat);
        System.out.println("myDoubleValue = " + myDoubleValue); // 16 digits of precision
        System.out.println("myDoubleValueDivided = " + myDoubleValueDivided);
        System.out.println("mySecondDoubleValue = " + mySecondDoubleValue);


        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d; // The d is not necessary
        System.out.println("Kilograms = " + convertedKilograms);
        double pi =  3.141_592_7d;
    }
}
