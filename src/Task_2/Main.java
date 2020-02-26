package Task_2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner ch = new Scanner(System.in);
            System.out.println("Вывод чисел делящихся на 13 и 17");
            System.out.print("Введите колличество элементов делящихся на 13 и 17 нажмите enter: ");
            int element = ch.nextInt();
            int[] arr = new int[element];
            int  namberDivident = 1;
            for (int i = 0; i < element ; namberDivident++){
                if (namberDivident % 13 == 0 || namberDivident % 17 == 0) {
                    arr[i] = namberDivident;
                    i++;
                }
            }
            for (int i = 0; i <arr.length; i++) {
                System.out.println("Элемент № "+ i + ": " + arr[i]);
            }
        }    }

