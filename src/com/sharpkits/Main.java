package com.sharpkits;

import java.nio.channels.FileLock;
import java.sql.SQLOutput;

public class Main {

    static String randomStr = "String to use";
    static final double PINUM = 3.14;

    public static void main(String[] args) {
        byte bigByte = 127;
        byte bigShort = -128;
        short shortValue = 32767;
        int bigInt = 210000000;
        long bigLong = 9200000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.1432342342366;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 65;
        char anotherChar = 'A';

        String escapeCharacter = "Jatin\b";

        String randomString = "This is a random String";
        String anotherStr = "Stuff";

        String combinedString = randomString + ' ' + anotherStr;

        double aDoubleValue = 30000000000000000000.1423232;
        int doubleToInt = (int) aDoubleValue;

        System.out.println(randomChar);
        System.out.println(escapeCharacter);
        System.out.println(doubleToInt);
    }
}