package com.servicebooking.util;

import java.util.Random;

public class IDGenerator {
    public static String generateUserId() {
        Random random = new Random();
        int number = 1000000 + random.nextInt(9000000); // 7 digit
        return "U" + number;
    }
}
