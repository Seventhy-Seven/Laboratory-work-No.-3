package com.company;
import java.util.Scanner;

class Project3_2 {
    private static Scanner inCD;

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    public static void main (String[] args)
    {
        System.out.print("Введите число n: ");
        inCD = new Scanner(System.in);

        int n = inCD.nextInt();
        int fn = f(n);
        System.out.println(fn);
    }
}