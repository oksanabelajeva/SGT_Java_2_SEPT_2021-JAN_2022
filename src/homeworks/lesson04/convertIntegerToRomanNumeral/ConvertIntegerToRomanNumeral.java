package homeworks.lesson04.convertIntegerToRomanNumeral;

public class ConvertIntegerToRomanNumeral {

    public void convertIntegerToRomanNumeral(int num) {
        if (num >= 1 && num <= 3999) {
            String thousand[] = {"", "M", "MM", "MMM"};
            String hundred[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String ten[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String one[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            String thousandRoman = thousand[num / 1000];
            String hundredRoman = hundred[(num % 1000) / 100];
            String tenRoman = ten[(num % 100) / 10];
            String oneRoman = one[num % 10];

            String numberRoman = thousandRoman + hundredRoman + tenRoman + oneRoman;
            System.out.println(numberRoman);
        } else {
            System.out.println("Please insert number from 1 to 3999.");
        }
    }
}