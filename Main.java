package com.company;

import java.util.Scanner;

class project4 {
    public static void main(String[]args){
        System.out.print("Введите первое число: ");
        Scanner InCD = new Scanner(System.in);
        int a = InCD.nextInt();

        System.out.print("Введите второе число: ");
        InCD = new Scanner(System.in);
        int b = InCD.nextInt();

        int max,min;
        if (a>b)
        { max=a;min=b;}
        else { max=b;min=a;};

        for(int i=min; i<=max; i++);
        for(int i=max; i>=min; i--)
            System.out.println(i);
    }
}