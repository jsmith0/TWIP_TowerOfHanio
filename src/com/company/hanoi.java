package com.company;

public class hanoi {
    static int count = 0;
    public static void solve(int top, String from, String mid, String to) {
        if (top == 1) {
                System.out.println("Disk 1 - from " + from + " to " + to);
                count++;
        } else {
            solve(top - 1, from, to, mid);
            count++;
            System.out.println("Disk " + top + " - from " + from + " to " + to);
            solve(top - 1, mid, from, to);
        }
    }
}
