package Task_5;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3, 4},
                {1, 2, 3, 4}};
        int[][] arr1 = new int[][]{{1, 2, 3, 4},
                {1, 2, 3, 4}};
        System.out.println("Программа сравнения двух элементов 2-х мерного массива");
        System.out.print("\n\t Элементы массива arr и arr1 : ");

        //numbers.equals(numbers2)

        boolean equalz = massCompare(arr, arr1);
        if (equalz) {
            System.out.println("Mассивы совпадают");
        } else {
            System.out.println("Mассивы не совпадают");
        }

    }
    private static boolean massCompare(int arr[][], int arr1[][]) {
        boolean temp = true;
        int i = 0;
        int j = 0;
        if ((arr.length != arr1.length) & (arr[0].length != arr1[0].length)) {
            temp = false;
        } else {
            while (temp & (i < arr.length)) {
                while (temp & (j < arr[0].length)) {
                    if (arr[i][j] != arr1[i][j]) {
                        temp = false;
                    }
                    j++;
                }
                i++;
            }
        }
        return temp;
    }
}




