package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lol = in.nextLine();
        int sum = 0;

        for(int i = 0; i < lol.length(); ++i) {
            char letter = lol.charAt(i);
            if (letter == '1' || letter == '2' || letter == '3' || letter == '4' || letter == '5' || letter == '6' || letter == '7' || letter == '8' || letter == '9') {
                sum += Character.getNumericValue(letter);
            }
        }

        System.out.print(sum);
    }
}
