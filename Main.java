package arrays;

import java.util.Scanner;

class project6 {
    public static void main(String[] args) {

        String firstText = "Введите размер массива: ";

        Scanner scanner = new Scanner(System.in);
        System.out.print(firstText);

        if(scanner.hasNextInt())
        {

            int n = Integer.parseInt(scanner.next());
            if (n <= 0)
            {
                System.out.println("Некорректный размер массива");
                System.exit(0);
            }

            int[] array = new int[n];

            int k = 0;
            double square = 2;
            double limit = Math.pow((double) n, square);
            int digit = (int) limit + 5;

            for (int i = 0; i <= digit; i++) {
                if (i % 5 == 2) {
                    array[k] = i;
                    k++;
                    if (k >= n) {
                        break;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(array[j] + "\t");
            }
        } else {
            System.out.println("Введено не численное значение");
            System.exit(0);
        }
    }
}