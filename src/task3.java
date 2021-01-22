//Сегодня поработаем с массивами. Давайте напишем функцию, которая на вход получает массив слов. Например:
//
//        ["apple banana", "orange", "banana", "kiwi strawberry blueberry"]
//
//        Видно, что в этом массиве в некоторых слотах затесалось сразу несколько слов. На выходе функция должна вернуть такой массив, где одно слово будет в каждом элементе:
//
//        ["apple", "banana", "orange", "banana", "kiwi", "strawberry", "blueberry"]
//
//        Словом считается любой набор символов, обособленный пробелами или началом/концом строки.


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class task3 {

    public static void main(String[] args){
    String [] array = new String[]{"apple banana", "orange", "banana", "kiwi strawberry blueberry", "orange", "a"};
    System.out.println(Arrays.toString(array));
    getUniqueArray(array);

    }

    public static void  getUniqueArray(String[] arr) {
        String array = Arrays.toString(arr);
        String[] words = array.split(" ");
        String[] uniq = new String[words.length];
        int k = 0;

        for(int i=0; i< arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    uniq[j] = arr[i];
                    k++;
                }
            }

        }
        String[] arr_new = new String[k];
        for(int i=0; i<k;i++){
            for(String a:uniq){
                if(arr[i] != null) {
                    arr_new[i] = uniq[i];
                    System.out.println("повторяющиеся элементы" + k);
                }
            }
        }
        System.out.println("повторяющиеся элементы"+Arrays.toString(arr_new));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(uniq));


    }
}
