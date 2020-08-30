package ru.eremin_dmitrii.lesson2;

public class lesson2_Eremin_Dmitrii {

    public static void main(String[] args) {
        changeArray(10);
        arrThroughThree(8, 3);
        arrMultiply(20, 9, 6, 2);
        arrKvadrat(5, 1);
    }

/*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0.
*/

    static void changeArray(int arrSize) {
        int arr[] = new int[arrSize];
        System.out.print("Исходный массив: \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nИзмененный массив: ");
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0) {
                arr[k] = 1;
            } else {
                arr[k] = 0;
            }
            System.out.print(arr[k] + " ");
        }
    }

    // 2. Задать пустой целочисленный массив размером 8. С
    //помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.

    private static void arrThroughThree(int arrSize, int step) {
        int arr[] = new int[arrSize];
        System.out.println("\nИсходный массив с шагом " + step + ":");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
            System.out.print(arr[i] + " ");
        }
    }

    // 3. Задать массив пример [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], пройти по
    // нему циклом и числа меньшие 6 умножить на 2.
    private static void arrMultiply(int arrSize, int maxElement, int minElement, int multiply) {
        int arr[] = new int[arrSize];
        System.out.print("\nИсходный массив: \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxElement);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nИзмененный массив: ");
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < minElement) {
                arr[k] *= multiply;
            }
            System.out.print(arr[k] + " ");
        }
    }

    //4. Создать квадратный двумерный целочисленный массив
    //(количество строк и столбцов одинаковое) и с помощью цикла
    //(-ов) заполнить его диагональные элементы единицами.

    private static void arrKvadrat(int arrSize, int symbol) {
        int arr[][] = new int[arrSize][arrSize];
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (i == k) {
                    arr[i][k] = symbol;
                    arr[arr.length - k - 1][k] = symbol;
                }
            }
        }
        PrintArr(arr);
    }

    // Метод для печати двумерного массива
    static void PrintArr(int[][] arr) {
        System.out.println("\nВывод двумерного массива: ");
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[i][k] + "|");
            }
            System.out.println("");
        }
    }

}