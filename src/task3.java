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
    String [] array = new String[]{"apple banana", "orange", "banana", "kiwi strawberry blueberry"};
    System.out.println(Arrays.toString(array));
    getUniqueArray(array);

    }

    public static void  getUniqueArray(String[] arr) {
        String array = Arrays.toString(arr);
        String[] words = array.split(" ");
        System.out.println(Arrays.toString(words));



    }
}
