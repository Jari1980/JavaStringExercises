package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("Which exercise do you want to see, 1-11 (111 for the duplicate exercise 1), :");
            try {
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        exercise1();
                        break;
                    case 111:
                        exercise111();
                        break;
                    case 2:
                        exercise2();
                        break;
                    case 3:
                        exercise3();
                        break;
                    case 4:
                        exercise4();
                        break;
                    case 5:
                        exercise5();
                        break;
                    case 6:
                        exercise6();
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
    public static void exercise6(){
        String text = "\tJ\ta\tv\ta\t";
        String textTimmed = text.trim();
        System.out.println("Given string: " + text + ", with tabspace from \"\\t\" trimmed : " + textTimmed);
        System.out.println("Removing tab space: ");
        String[] arr = text.split("\t", -1);
        String textMod = "";
        for (String element : arr){
            textMod = textMod + element;
        }
        text = textMod;
        System.out.println(text);
    }

    public static void exercise5(){
        String text = "Java is the worst programming language!";
        System.out.println("From given string: " + text + " replacing word worst with best.");
        text = text.replace("worst", "best");
        System.out.println(text);
    }

    public static void exercise4(){
        String text = "CAPS EQUALS SCREAMING";
        text = text.toLowerCase();
        System.out.println("Given string \"CAPS EQUALS SCREAMING\" converted to lowercase: " + text);
        text = text.toUpperCase();
        System.out.println("Given string \"CAPS EQUALS SCREAMING\" converted back to uppercase: " + text);
    }

    public static void exercise3(){
        String given = "Ok this is not as long!";
        String givenMod = given.substring(11, given.length()-1);
        System.out.println("Form given \"Ok this is not as long!\" creating substring of \"not as long\" " +
                "excluding the exclamation point: " + givenMod);
    }

    public static void exercise2(){
        String text = "Even longer example sentence";
        System.out.println("The index of 'o' in the sentence \"Even longer example sentence\": " + text.indexOf("o"));
    }

    public static void exercise111(){
        String text = "Long example sentence";
        System.out.println("Char at index 6 in the sentence \"Long example sentence\": " + text.charAt(6));
    }

    public static void exercise1(){
        String text = "Java";
        System.out.println("The length of the String: \"Java\" is: " + text.length());
    }
}