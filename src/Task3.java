import java.util.Scanner;

public class Task3 {
    //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
//Формат входных данных:
//Программа получает на вход два числа n и m.
//Формат выходных данных:
//Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3 символа.
    public static void main(String[] args) {
        System.out.println("Введите размер строки:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int sizeStroka = scanner.nextInt();
            System.out.println("Введите размер столбца:");
            if (scanner.hasNextInt()) {
                int sizeStolbik = scanner.nextInt();
                int[][] array = new int[sizeStroka][sizeStolbik];
                int value = 0;
                for (int i = 0; i < sizeStroka; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < sizeStolbik; j++) {
                            array[i][j] = value++;
                        }
                    } else {
                        for (int j = sizeStolbik - 1; j >= 0; j--) {
                            array[i][j] = value++;
                        }
                    }
                }
                System.out.println("Ваш массив:");
                for (int i = 0; i < sizeStroka; i++) {
                    for (int j = 0; j < sizeStolbik; j++) {
                        System.out.print(" " + array[i][j]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Вы ввели не число!");
            }
        } else {
            System.out.println("Вы ввели не число!");
        }
        System.out.println("Конец программы!");
    }
}
