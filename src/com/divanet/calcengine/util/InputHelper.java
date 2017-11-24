package com.divanet.calcengine.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHelper {

    public static String input(String prompt) {
        System.out.println(prompt);

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.flush();
        try {
            return stdin.readLine();
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }

    public static char getCharInput(String prompt){
        String opCodeChar = input(prompt);
        return opCodeChar.charAt(0);
    }

    public static double getDoubleInput(String prompt){
        String value = input(prompt);
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.err.println("Invalid Entry :" + e.getMessage());
            return 0.0;
        }
    }
}
