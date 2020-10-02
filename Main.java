package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class project10{
    public static void main (String [] args) {
        Random random = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int x = Integer.parseInt(sc.nextLine());

        int a = 10;

        int[] array = new int[x];


        for (int i=0; i<array.length; i++)
        {
            array[i] = random.nextInt(a) + 1;
            if (array[i] < a)
            {
                a = array[i];
            }
            System.out.print(array[i] + "\t");

            int j;
            for (j = i + 1; j < array.length; j++) ;
            if (array[j] < a) {
                a = array[j];
            }
        }

        System.out.println();

    }

}