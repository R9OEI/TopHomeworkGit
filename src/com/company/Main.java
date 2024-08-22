package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Привет " + name);
    }
}
