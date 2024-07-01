package com.apj;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Read the input string from the user
        String input = scanner.nextLine();

        // Initialize an empty string to store the reversed version of the input string
        String reversed = "";

        // Iterate through each character of the input string from end to beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append each character to the 'reversed' string
            reversed += input.charAt(i);
        }

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}