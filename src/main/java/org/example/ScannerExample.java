package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String scanned = scanner.next();
        System.out.println("You entered " +  scanned);
    }
}
