package com.company;
import java.util.Scanner;

class project2 {
    public static void main(String[] args) {

        System.out.print("Введите название дня недели :");
        Scanner InCD = new Scanner(System.in);
        String a = String.valueOf(InCD.nextLine());

        int days[] = {1, 2, 3, 4, 5, 6, 7};

        switch (a) {
            case "понедельник" -> {
                System.out.println(days[0] + "-ый день недели");
                break;
            }
            case "вторник" -> {
                System.out.println(days[1] + "-ой день недели");
                break;
            }
            case "среда" -> {
                System.out.println(days[2] + "-ий день недели");
                break;
            }
            case "четверг" -> {
                System.out.println(days[3] + "-ый день недели");
                break;
            }
            case "пятница" -> {
                System.out.println(days[4] + "-ый день недели");
                break;
            }
            case "суббота" -> {
                System.out.println(days[5] + "-ой день недели");
                break;
            }
            case "воскресенье" -> {
                System.out.println(days[6] + "-ой день недели");
                break;
            }
            default -> {
                System.out.println("Введённое слово не является днём недели");
                break;
            }

        }
    }
}