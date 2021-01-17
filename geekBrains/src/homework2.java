//       1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//       2 Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//       3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//       4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//       5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//       6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
//       7 **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
//
//

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 0, 0, 1, 0, 5}; //// задание 1
        invert(array1);                   ////проверка
        printArray(array1);                     ///

        int[] array2 = new int[8];      ////
        stuffArray(array2);            /// задание 2
        printArray(array2);            /// проверка

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiply(array3);
        printArray(array3);

        int[][] array4 = new int[6][6];
        square(array4);
        printArray(array4);

        int[] array5 = {2, 2, 2, 1, 2, 2, 10, 1, 22};
        findExtremum(array5);
        findSumOfSecond(array5, 1);
        findSumOfFirst(array5, 1);
        checkBalance(array5);
        int[] array7 = {1, 2, 3, 4, 5, 6};
        printArray(array7);
        shift(array7, 4);
        System.out.println("теперь в другую сторону сдвигаем, то есть обратно на свое место");
        shift(array7, -4);
        shift(array7, -4);



    }

    // 0. метод для печати массива.
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("array i=" + i + " j= " + j + "  " + array[i][j]);

            }
        }
    }

    //  1,  Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    // считаю
    public static void invert(int[] array) {
        for (int i : array) {
            switch (i) {
                case 0:
                    i++;

                    break;
                case 1:
                    i--;

                    break;
                default:

                    break;
            }
        }
    }
    // 2. задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void stuffArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = i * 3;
        }

    }
//   3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void multiply(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

    }

//     4 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void square(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
    }
    //5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    //не понимаю, как сделать проверку, что массив не пустой.

    public static void findExtremum(int[] array) {
        int max = 0;
        int numb_max = 0;
        int min = 0;
        int numb_min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                numb_max = i;
            } else if (array[i] < min) {
                min = array[i];
                numb_min = i;
            }
        }
        System.out.println("максимальный элемент = " + max + "  с индексом  " + numb_max);
        System.out.println("минимальный элемент = " + min + "  с индексом  " + numb_min);
    }

//       6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,
//       в котором сумма левой и правой части массива равны.
//       Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.


    public static boolean checkBalance(int[] array) {

        boolean result = false;

        for (int i = 1; i < array.length; i++) {
            if (findSumOfFirst(array, i) == findSumOfSecond(array, i)) {
                result = true;

            }

        }
        System.out.println(result);
        return result;
    }

    //вспомогательный метод, который находит сумму первых элементов количества элементов. Насколько это приемлемо в программировании? Я так делаю, чтобы не запутаться.
    public static int findSumOfFirst(int[] arr, int i) {
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += arr[j];
        }
        System.out.println("сумма перед i = " + sum);
        return sum;
    }

    public static int findSumOfSecond(int[] arr, int i) {
        int sum = 0;
        for (int j = i; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println("сумма после i = " + sum);
        return sum;

    }
//     7 **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//     при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
//     Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//     Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
//

    public static void shift(int[] arr, int n) {

        int k = Math.abs(n);
        do {
            if (n < 0) {
                int first = arr[0];
                for (int i = 0; i <= arr.length - 2; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = first;
            }

            if (n > 0) {
                int last = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;
            }
       k--; }while(k>0);
        System.out.println("k=" + k);
        printArray(arr);


    }


}