package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("I will solve the Tower Of Hanoi for you, enter the number of disks you would like.");

        Scanner kb = new Scanner(System.in);
        int disks = kb.nextInt();
        hanoi.solve(disks, "a", "b", "c");
        System.out.println("It took " + hanoi.count + " moves to complete your tower of hanoi.");
    }
    public static class hanoi {
        static int count = 0;
        public  static void solve(int top, String from, String mid, String to) {
            if (top == 1) {
                System.out.println("Disk 1 - " + from + " -> " + to);
            } else {
                solve(top - 1, from, to, mid);
                count++;
                System.out.println("Disk " + top + " - from " + from + " -> " + to + " -- Move Number: " + count);
                solve(top - 1, mid, from, to);
            }
        }
    }
}
