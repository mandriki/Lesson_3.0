package Task_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создаем массив случайных чисел
        Integer arr[] = new Integer[10];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println(" ");
        Arrays.sort(arr);
        System.out.println("Сортированный массив: ");
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        int srednee = 0;
        int count = arr.length;
        int summary = 0;
        for (int i = 0; i < count; i++){
            summary += arr[i];
        }
        srednee = summary / count;
        System.out.println("Среднее арифметическое: " + srednee);

        int min = (int) Collections.min(Arrays.asList(arr));
        int max = (int) Collections.max(Arrays.asList(arr));
        System.out.println("min: " + min);
        System.out.println("max: " + max);

    }
}




