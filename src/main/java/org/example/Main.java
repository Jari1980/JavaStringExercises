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
                    case 7:
                        exercise7();
                        break;
                    case 8:
                        exercise8();
                        break;
                    case 9:
                        exercise9();
                        break;
                    case 10:
                        exercise10();
                        break;
                    case 11:
                        exercise11();
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
    public static void exercise11(){
        char[] arr = new char[]{'J', 'a', 'v', 'a'};
        String text = "";
        for (int i = 0; i < arr.length; i++){
            text = text + arr[i];
        }
        System.out.println("Converting \"char[]: {'J', 'a', 'v', 'a'}\" to a string: " + text);
    }

    public static void exercise10(){
        String text = "ThisShouldBeConverted";
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++){
            arr[i] = text.charAt(i);
        }
        System.out.println("Converting \"ThisShouldBeConverted\" to a char array, char array:");
        for (char element : arr){
            System.out.println(element);
        }
    }

    public static void exercise9(){
        String text = "Carl,Susie,Fredrick,Bob,Erik";
        String[] arr = text.split(",");
        System.out.println("From given string: \"Carl,Susie,Fredrick,Bob,Erik\" splicing names to array.");
        System.out.println("Names in array:");
        for (String element : arr){
            System.out.println(element);
        }
    }

    public static void exercise8(){
        String text = "Oil and Water";
        String regex = (" and ");
        String[] arr = text.split(regex);
        System.out.println("From given string \"Oil an Water\" splitting words \"Oil\" and \"Water\" and storing them in array.");
        System.out.println("Words in array:");
        for(String element : arr){
            System.out.println(element);
        }
    }

    public static void exercise7(){
        int num = 20;
        String numPar = String.valueOf(num);
        numPar = numPar + "20";
        System.out.println("Parsing int: 20 to string and concatinating it with \"20\": " + numPar);
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