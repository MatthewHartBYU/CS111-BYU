package JavaCodingPuzzles;

public class RomanNumeral {
    public static void main(String[] args){
        String characters = "IV";
        int total = calculateNumber(characters);
        System.out.println("Roman Numeral String: " + characters);
        System.out.println("Numerical Number: " + total);
        int number = 4;
        String numString = calculateString(number);
        System.out.println();
        System.out.println("Numerical Number: " + number);
        System.out.println("Roman Numeral String: " + numString);
    }
    public static int calculateNumber(String roman) {
        int total = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = getValue(roman.charAt(i));

            if (i < roman.length() - 1) {
                int next = getValue(roman.charAt(i + 1));

                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }
            } else {
                total += current;
            }
        }
        return total;
    }
    private static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static String calculateString(int number){
        StringBuilder result = new StringBuilder();
        int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };
        String[] numerals = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(numerals[i]);
                number -= values[i];
            }
        }
        return result.toString();
    }
}
