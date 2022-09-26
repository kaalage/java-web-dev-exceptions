package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
        //Divide(5,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String file : studentFiles.values()) {
            CheckFileExtension(file);
        }

    }

    public static int Divide(int x, int y) {
        // Write code here!

        if (y <= 0) {
            try {
                throw new ArithmeticException("Can't divide by 0");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }

        return x/y;

    }

    public static int CheckFileExtension(String fileName) {
        // Write code here!
        int points = 0;
        if (fileName.isEmpty() || fileName == null) {
            try {
                throw new RuntimeException("Field can't be empty");
            } catch (RuntimeException e) {
                e.printStackTrace();
                return points = -1;
            }
        } else if (fileName.endsWith(".java")) {
                return points = 1;
        } else if (!fileName.endsWith(".java")) {
                return points = 0;
        }

        return points;
    }

}


