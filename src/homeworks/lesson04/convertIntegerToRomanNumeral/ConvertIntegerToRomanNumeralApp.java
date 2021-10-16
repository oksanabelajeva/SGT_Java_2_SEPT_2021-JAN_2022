package homeworks.lesson04.convertIntegerToRomanNumeral;

public class ConvertIntegerToRomanNumeralApp {

    public static void main(String[] args) {

        ConvertIntegerToRomanNumeral convertIntegerToRomanNumeral = new ConvertIntegerToRomanNumeral();

        convertIntegerToRomanNumeral.convertIntegerToRomanNumeral(0);//Output: "Please insert number from 1 to 3999."
        convertIntegerToRomanNumeral.convertIntegerToRomanNumeral(3);//Output: "III"
        convertIntegerToRomanNumeral.convertIntegerToRomanNumeral(4);//Output: "IV"
        convertIntegerToRomanNumeral.convertIntegerToRomanNumeral(9);//Output: "IX"
        convertIntegerToRomanNumeral.convertIntegerToRomanNumeral(58);//Output: "LVIII"
        convertIntegerToRomanNumeral.convertIntegerToRomanNumeral(1994);//Output: "MCMXCIV"
        convertIntegerToRomanNumeral.convertIntegerToRomanNumeral(4000);//Output: "Please insert number from 1 to 3999."
    }
}