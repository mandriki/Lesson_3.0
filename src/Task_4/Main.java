package Task_4;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[4]; //{1, 2, 3, 4};
        System.out.println("Программа проверки прогресии на возростания");
        System.out.print("\n\t Случайный масссив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\t " + "Результат: ");
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) {
                    if (arr[i - 1] >= arr[i]) {
                        System.out.println("Прогрессия не возрастающая");
                        break;
                    }
                }
                if (i == arr.length - 1)
                    System.out.println("Последовательность строго возрастающая");
            }
    }
}

