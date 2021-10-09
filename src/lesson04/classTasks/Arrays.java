package lesson04.classTasks;

public class Arrays {

    public static void main(String[] args) {

        // Define an array and initialize it in two lines
        int[] arrayOfIntegers;
        arrayOfIntegers = new int[5];

        // Define an array and initialize it in one line
        int[] anotherArray = new int[10];

        // Print the alphabet
        System.out.println(initAlphabet());

        // Define the array and initialize by using shorthand notation
        String[] cities = {
                "Riga",
                "London",
                "Paris"};
        for (String citiesNames : cities) {
            System.out.println(citiesNames);
        }

        String[] citiesTwo = new String[3];
        citiesTwo[0] = "Riga";
        citiesTwo[1] = "London";
        citiesTwo[2] = "Paris";


        // TWO DIMENSIONAL ARRAYS
        int[][] points = new int[10][10];
        points[0][0] = 99;
        points[0][1] = 5;
        points[1][0] = 45;

        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print(points[i][j] + " ");
            }
        }
    }

    static char[] initAlphabet() {
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        return alphabet;
    }
}