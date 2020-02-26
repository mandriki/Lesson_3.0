package Task_8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static int massMin(int minimum) {
        //Создаем массив случайных чисел
        Integer[] arr = new Integer[10];
            for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("  ");
        int min = (int) Collections.min(Arrays.asList(arr));
        int max = (int) Collections.max(Arrays.asList(arr));
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        return min;
    }

    public static void main(String[] args) {
        // метод size () для целочисленного значени
        // Создание объекта ArrayList <Integer>
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int minimum = 0;

        Integer[] arr = new Integer[10];
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + "  ");
        }
        for (i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {
               list.add(i);
            }
        }

        System.out.println("Пазиция мин элемента massMin " + massMin(minimum));

        // распечатать список
        System.out.println("Элементы массива: " + list);
        // получаем общий размер списка используя метод size ()
        int size = list.size();
        // выводим размер списка
        System.out.println("Длинна массива: " + size);


    }

}