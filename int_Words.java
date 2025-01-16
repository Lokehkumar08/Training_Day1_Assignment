import java.util.Scanner;

public class int_Words {

    public static String numberToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        StringBuilder result = new StringBuilder();

        // Handle hundreds
        if (num >= 100) {
            int hundreds = num / 100;
            result.append(convertHundredToWord(hundreds)).append(" hundred ");
            num %= 100;
        }

        // Handle tens and ones
        if (num >= 20) {
            int tens = num / 10;
            int ones = num % 10;
            result.append(convertTensToWord(tens)).append(" ");
            if (ones > 0) {
                result.append(convertOnesToWord(ones));
            }
        } else if (num > 0) {
            result.append(convertTeensToWord(num));
        }

        return result.toString().trim(); // Trim to remove extra spaces
    }

    // Convert hundreds place
    private static String convertHundredToWord(int num) {
        switch (num) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Convert tens place (20 and above)
    private static String convertTensToWord(int num) {
        switch (num) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }

    // Convert ones place (for numbers 1-9)
    private static String convertOnesToWord(int num) {
        switch (num) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Convert numbers between 10-19 (the "teen" numbers)
    private static String convertTeensToWord(int num) {
        switch (num) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Output: Print the word representation of the number
        System.out.println(numberToWords(num));
        
        sc.close();
    }
}
