package com.company;
import java.util.Scanner;

class project1 {
    public static void main(String[] args) {

        System.out.print("Введите число от 1 до 7 :");
        Scanner InCD = new Scanner(System.in);
        int a = InCD.nextInt();

        String days [] = {"понедельник", "вторник", "среда", "четверрг", "пятница", "суббота", "воскресенье"};

        switch (a) {
            case 1:
                System.out.println(days[0]);
                break;
            case 2:
                System.out.println(days[1]);
                break;
            case 3:
                System.out.println(days[2]);
                break;
            case 4:
                System.out.println(days[3]);
                break;
            case 5:
                System.out.println(days[4]);
                break;
            case 6:
                System.out.println(days[5]);
                break;
            case 7:
                System.out.println(days[6]);
                break;
            default:
                System.out.println("Введённое число не входит в диапазон от 1 до 7");
                break;
        }

    }
}