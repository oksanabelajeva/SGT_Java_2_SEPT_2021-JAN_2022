package homeworks.lesson04.myAtoi;

public class MyAtoi {

    public static int myAtoi(String s) {

        int indexOfCharAt = 0, character = 1;

        while (indexOfCharAt < s.length() && s.charAt(indexOfCharAt) == ' ') {
            indexOfCharAt++;
        }

//      charAt() returns a symbol by index
        if (indexOfCharAt < s.length() && (s.charAt(indexOfCharAt) == '+' || s.charAt(indexOfCharAt) == '-')) {
//            Can't be written by if...else, because have to return int,
//            but in if...else case returns boolean.
//            In short if...else version -1 returns true; 1 returns false.
            character = s.charAt(indexOfCharAt) == '-' ? -1 : 1;
            indexOfCharAt++;
        }

        while (indexOfCharAt < s.length() && s.charAt(indexOfCharAt) == '0') {
            indexOfCharAt++;
        }

//      Character.isDigit() checks if char is a digit
        if (indexOfCharAt < s.length() && Character.isDigit(s.charAt(indexOfCharAt))) {
//      Character.getNumericValue() returns the int value that the specified Unicode character represents.
            int numberToBePrintedOut = Character.getNumericValue(s.charAt(indexOfCharAt++)) * character;
            while (indexOfCharAt < s.length() && Character.isDigit(s.charAt(indexOfCharAt))) {
                int nextDigit = Character.getNumericValue(s.charAt(indexOfCharAt++)) * character;
                int prevNumber = numberToBePrintedOut;
                numberToBePrintedOut = numberToBePrintedOut * 10 + nextDigit;
                if (Integer.signum(prevNumber) != Integer.signum(numberToBePrintedOut) || prevNumber != (numberToBePrintedOut - nextDigit) / 10) {
                    return character == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
            return numberToBePrintedOut;
        }
        return 0;
    }
}