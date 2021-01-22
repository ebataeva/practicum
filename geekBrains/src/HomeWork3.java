/*
1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
 После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
2. * Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static Scanner sc = new Scanner(System.in);
    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        int rand = new Random().nextInt(10); //компьютер загадал случайное число от 0 до 9
  //      System.out.println("нужно отгадать это число"+rand); //проверка числа
//         checkTheNumber(rand); //задание 1
       //не понимаю, почему нельзя подряд запустить игры.
        guessWordGame(); //задание 2

    }

    /*1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
            При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.*/
    public static void checkTheNumber(int number) {
        int trial;
        int i = 3;
        do {
            i--;
            System.out.println("введите цифру от 0 до 9 \n");
            trial = sc.nextInt();
            if (trial > number) {
                System.out.printf("это число больше, чем задумал компьютер, у вас %d попытки \n", i);
            } else if (trial < number) {
                System.out.printf("это число меньше, чем задумал компьтер у вас %d попыток \n", i);
            }


        } while (trial != number && i > 0);
        if (trial == number) {
            System.out.printf("вы угадали число c %d попыток!", 3 - i);
        } else {
            System.out.println("попытки закончились");
        }
    }
 /* 2   Создать массив из слов
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
    "pear", "pepper", "pineapple", "pumpkin", "potato"}.
            При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
            сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно можно пользоваться:
    String str = "apple";
    char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово.
    Используем только маленькие буквы.
            */

    public static String randomArray(String[] arr) {
        int rand = new Random().nextInt(arr.length);
        return arr[rand];
    }

    public static void guessWordGame(){
        String theWord = randomArray(words);
        System.out.printf("компьютер загадал одно из этих слов, угадайте, какое %s", Arrays.toString(words));
        System.out.println(theWord); //выводит слово, для самотестирования
        String trial;
        do{
        System.out.println("введите ваше слово ");
         trial = sc.nextLine();}
        while (!compareTheWords(theWord, trial));
    }

    public static boolean compareTheWords(String theWord, String myWord) {
        boolean result = false;
        int size = findMinimumWordLength(theWord, myWord);
        char[] hide = new char[15]; //массив спрятанных букв
        for (int i = 0; i < hide.length; i++) {
            hide[i] = '#';
        }
        int k = 0;
        for (int i = 0; i < size; i++) {
            char letter = theWord.charAt(i);
            if (letter == myWord.charAt(i)) {
                hide[i] = letter;
                k++;
            }
        }
        if (theWord.length() == myWord.length() && k == theWord.length()) {
            result = true;
            System.out.println("вы выиграли");
        } else {
            System.out.println("вот совпавшие буквы");
            print1DArray(hide);
        }
        return result;
    }


    public static int findMinimumWordLength(String word1, String word2) {
        int size = 0;
        if (word1.length() < word2.length()) {
            size = word1.length();
        } else {
            size = word2.length();
        }
        return size;

    }

    public static void print1DArray(char[] arr) {

        System.out.println(arr);
    }
}

