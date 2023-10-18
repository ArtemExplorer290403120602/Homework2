import java.util.Scanner;

public class Task1 {
    //Задача 1:
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void main(String[] args) {


        System.out.println("Введите размер строки:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int sizeStroka = scanner.nextInt();
            System.out.println("Введите размер столбца:");
            if (scanner.hasNextInt()) {
                int sizeStolbik = scanner.nextInt();
                /**
                 * создаем двумерный массив и заполняем случайными числами
                 */
                System.out.println("Заполните массив случайными числами:");
                int[][] array = new int[sizeStroka][sizeStolbik];
                for (int i = 0; i < sizeStroka; i++) {
                    for (int j = 0; j < sizeStolbik; j++) {
                        array[i][j] = scanner.nextInt();
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Ваш массив:");
                System.out.println("--------------------");
                for (int i = 0; i < sizeStroka; i++) {
                    for (int j = 0; j < sizeStolbik; j++) {
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("--------------------");
                /**
                 * Добавляем к каждому значению число,которое вводится с консоли
                 */
                System.out.println("Введите число для добавления для каждого элемента:");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    for (int i = 0; i < sizeStroka; i++) {
                        for (int j = 0; j < sizeStolbik; j++) {
                            array[i][j] += number;
                        }
                    }
                    System.out.println("Ваш массив:");
                    System.out.println("--------------------");
                    for (int i = 0; i < sizeStroka; i++) {
                        for (int j = 0; j < sizeStolbik; j++) {
                            System.out.print(array[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("--------------------");
                    /**
                     * Находим сумму всех получившихся элементов
                     */
                    int sum = 0;
                    for (int i = 0; i < sizeStroka; i++) {
                        for (int j = 0; j < sizeStolbik; j++) {
                            sum += array[i][j];
                        }
                    }
                    System.out.println("Сумма всех элементов в массиве:" + " " + sum);
                } else {
                    System.out.println("Вы ввели не число:");
                }
            } else {
                System.out.println("Вы ввели не число!");
            }
        } else {
            System.out.println("Вы ввели не число!");
        }
        System.out.println("Конец программы");
    }
}
