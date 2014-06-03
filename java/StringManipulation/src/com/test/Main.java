package com.test;

public class Main {

    public static void main(String[] args) {
        
        String test = "total";
        String removeCharacters = "ta";
        System.out.println("First non repeated character in " + test + " is " + StringUtils.getFirstNonRepeated(test));

        System.out.println("Remove Characters "
                + removeCharacters + " from "
                + test + " is " + StringUtils.removeCharacters(test,removeCharacters));


        String test2 = "8724";
        int num = 786;
        System.out.println("strToInt of " + test2 + " = " + StringUtils.strToInt(test2));
        System.out.println("intToStr of " + num + " = " + StringUtils.intToStr(num));




    }
}
