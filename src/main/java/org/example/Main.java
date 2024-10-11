package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-11, :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
                        break;
                    case 2:
                        exercise2();
                        break;
                    default:
                        System.out.println("There is no such exercise");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Closing program");
                System.exit(0);
            }
        }
    }
    public static void exercise2(){
        String text = "Long example sentence";
        System.out.println("Char at index 6 in the sentence \"Long example sentence\": " + text.charAt(6));
    }

    public static void exercise1(){
        String text = "Java";
        System.out.println("The length of the String: \"Java\" is: " + text.length());
    }
}