package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("I will solve the Tower Of Hanoi for you.");
        System.out.println("The board looks like this \n   |   |   | \n___a___b___c___");
        System.out.println("Enter the number of disks you would like in the tower.");

        Scanner kb = new Scanner(System.in);
        int disks = kb.nextInt();
        hanoi.solve(disks, "a", "b", "c");
        System.out.println("It took " + hanoi.count + " moves to complete your tower of hanoi.");
    }
}
