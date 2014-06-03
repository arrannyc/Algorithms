package com.test;

import java.util.HashMap;

public class StringUtils {

    public static final int MAX_DIGITS = 10;



    /**
     * Find the first occurrence of a character in a string that is non repeating.
     * @param str
     * @return
     */
    public static Character getFirstNonRepeated(String str) {

        HashMap<Character, Integer> characterHashMap = new HashMap<Character, Integer>();

        /**
         * Iterate through string and put add or update an entry for that character
         * in the HashMap.
         */
        for (char c : str.toCharArray()) {

            int count = 0;
            if (characterHashMap.containsKey(c)) {
                count = characterHashMap.get(c);
            }

            count++;
            characterHashMap.put(c, count);

        }

        /**
         * Iterate through the string once more.
         * The first character with a count of 1 will be the first non repeatable
         * character in the string.
         */
        for (char c : str.toCharArray()) {

            if (characterHashMap.containsKey(c)) {
                int count = characterHashMap.get(c);
                if (count == 1) return c;
            }
        }

        return null;

    }

    /**
     * remove characters from a string.
     * @param str
     * @param remove
     * @return
     */
    public static String removeCharacters(String str, String remove) {

        StringBuffer sb = new StringBuffer();
        boolean[] removalLookupArray = new boolean[128];

        for (char c : remove.toCharArray()) {
            removalLookupArray[c] = true;
        }

        for (char c : str.toCharArray()) {

            if (removalLookupArray[c]) {

            } else {
                sb.append(c);
            }

        }

        return sb.toString();


    }


    /**
     * strToInt
     * @param str
     * @return
     */
    public static int strToInt(String str) {

        int total = 0;
        boolean negativeNum = false;
        char[] charArray = str.toCharArray();
        int i = 0;
        if (charArray[0] == '-') {
            negativeNum = true;
            i = 1;
        }

        while( i < str.length() ){
            total *= 10;
            total += ( str.charAt(i++) - '0' );
        }

        if (negativeNum) total = -total;

        return total;

    }

    /**
     * intToStr
     * @param num
     * @return
     */
    public static String intToStr( int num ){
        int i = 0;
        boolean isNeg = false;
    /* Buffer big enough for largest int and - sign */
        char[] temp = new char[ MAX_DIGITS + 1 ];
    /* Check to see if the number is negative */
        if( num < 0 ){
            num = -num;
            isNeg = true;
        }

    /* Fill buffer with digit characters in reverse order */
        do {
            temp[i++] = (char)((num % 10) + '0');
            num /= 10;
        } while( num != 0 );
        StringBuilder b = new StringBuilder();
        if( isNeg )
            b.append( '-' );

        while( i > 0 ){
            b.append( temp[--i] );
        }
        return b.toString();
    }

}
