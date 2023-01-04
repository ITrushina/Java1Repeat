/**
 * Java1.HW3
 * @author Trusina Irina
 * @version 03.01.23
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        System.out.println("Задать целочисленный массив из 0 и 1. Заменить 0 на 1 и наоборот");
        changeValue(arrCreating());
        System.out.println("------------------");

        System.out.println("Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями от 1 до 100");
        int [] arr2 = new int [100];
        fillingArr(arr2);
        System.out.println("------------------");

        System.out.println("Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArr(arr3);
        System.out.println("------------------");

        System.out.println("Создать квадратный двумерный целочисленный массив и заполнить его диагонали единицами");
        creatingTwoDimArr();
        System.out.println("------------------");

        System.out.println("Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue");
        System.out.println(Arrays.toString(creatingArr(5, 9)));
        System.out.println(Arrays.toString(creatingArr(10, 1)));
        System.out.println("------------------");

        System.out.println("Задать одномерный массив и найти в нем минимальный и максимальный элементы");
        int [] arr6= {55, 10, 7, 22, 9};
        minAndMax (arr6);
        System.out.println("------------------");

        System.out.println("Написать метод, в который передается не пустой одномерный целочисленный массив,\n" +
                "метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части\n" +
                "массива равны");
        int [] arr7 = {1, 2, 3, 5};
        System.out.println(comparisonOfArrParts (arr7));
        int [] arr8 = {1, 2, 2, 5};
        System.out.println(comparisonOfArrParts (arr8));
        System.out.println("------------------");

    }

    static int[] arrCreating() {                    //Задача 1. создание массива
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива\n");
        int [] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            do {
                System.out.println("Заполните " + i + " элемент массива значением 0 или 1");
                arr[i] = scanner.nextInt();
            } while (arr[i] < 0 || arr[i] > 1);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static void changeValue(int arr[]) {          //Задача 1. замена значений на противоположные
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillingArr (int arr[]) {                //Задача 2
        for (int i = 0; i < arr.length; i++) {
            arr [i] += i;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArr (int arr[]) {                 //Задача 3.
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void creatingTwoDimArr () {                  //Задача 4.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну квадратного двумерного массива\n");
        int a = scanner.nextInt();
        int [][] arr = new int [a][a];
        for (int i = 0; i < arr.length; i++) {
            arr [i][i]  = 1;
            arr [i][arr.length - i-1] = 1;
        System.out.println(Arrays.toString(arr[i]));
        }
    }

    static int[] creatingArr(int len, int initialValue) {           //Задача 5.
        int [] arr = new int [len];
        Arrays.fill(arr, initialValue);//заполнение массива одинаковыми значениями
        return arr;
    }

    static void minAndMax (int arr[]) {                             //Задача 6.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива\n");
        int [] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите значение для i=" + i );
            arr [i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    static boolean comparisonOfArrParts (int arr[]) {
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        int part = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (part == sum - part) {
                return true;
            } else {
                part += arr[i];
            }
        }
        return false;
    }
}