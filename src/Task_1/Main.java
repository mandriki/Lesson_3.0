package Task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            System.out.println("Программа вывода элемета массива в обратном порядке ");
            Scanner ch = new Scanner(System.in);
            System.out.print("Введите длинну массива нажмите enter: ");
            int lArray = 0;
            if (ch.hasNextInt()) {
                int element = ch.nextInt();
                lArray = element;
            } else {
                System.out.println("Перезапустите программу ВЫ ВВЕЛИ НЕ ЧИСЛО и введите целое число!!!");
            }
            int[] arr = new int[lArray];
            System.out.print("Введите элементы массива через пробел (" + arr.length + ") шт. или через Enter и нажмите Enter: ");
            for (int i = 0; i < lArray; i++) {
                if (ch.hasNextInt()) {
                    arr[i] = ch.nextInt();
                } else {
                    System.out.println("Перезапустите программу ВЫ ВВЕЛИ НЕ ЧИСЛО и введите целое число!!!");
                    break;
                }
            }
            for (int i = 0; i < arr.length / 2; i++) {
                int mass = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = arr[i];
                arr[i] = mass;
            }
            System.out.print("Элементы массива в обратном порядке: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }

    }
}
