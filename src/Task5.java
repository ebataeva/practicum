//Привет. Сегодня пишем шифратор и дешифратор текста :)
//        Работать будем только с английским. Следовательно, буквы будут использоваться только английского словаря.
//
//        Надо написать две функции.
//
//        Первая должна получать на вход строку и шифровать ее по следующему принципу - каждая буква заменяется на следующую в алфавите, при этом большая буква становится маленькой, а маленькая - большой.
//        То есть "a" заменяется на "B", а "X" заменяется на "z". Последняя буква заменяется на первую, то есть "Z" на "a", а "z" на "A". Итоговая строка возвращается.
//
//        Вторая функция должна расшифровывать строку, соответственно действовать наоборот.

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> alp = new HashMap<>();
        alp.put(2, "b");
        System.out.println(alp);
    }
}