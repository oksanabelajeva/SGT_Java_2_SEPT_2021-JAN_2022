package homeworks.lesson04.myAtoi;

import java.io.*;
import java.util.Scanner;

public class MyAtoiApp {

    public static void main(String[] args) {

        MyAtoi myAtoi = new MyAtoi();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your text: ");
        String text = scanner.nextLine();

        System.out.println(myAtoi.myAtoi(text));
    }
}