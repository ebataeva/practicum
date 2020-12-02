import java.util.Scanner;

//
//Сегодня предлагаю написать программу, которая будет работать с текстом. Надо написать функцию, которая на вход принимает текстовое значение и число - указание максимальной длины.
//        Результатом ее работы должен стать анализ этого текста по следующим правилам:
//
//        - Функция должна напечатать количество символов в тексте.
//        - Функция должна напечатать количество символов без учета пробелов.
//        - Функция должна напечатать "количество символов в тексте четное" или "количество символов в тексте нечетное" в зависимости от количества символов (тут пробелы учитываем).
//        - Функция должна напечатать "длина текста превышает длину {N} символов", где N - это целочисленное значение, которое передается вторым параметром в функцию.
//        Само собой, если на самом деле длина текста меньше максимальной, то это писать не надо.
public class lesson3 {

    public static void main(String[] args) {
        System.out.println("введите ваш текст");
        String str = new Scanner(System.in).nextLine();
        System.out.println("введите ваше число N");
        int N = new Scanner(System.in).nextInt();
        System.out.println("количество символов " + str.length());
     //   System.out.println(str.replace(" ", ""));
        System.out.println(isEven(str));
        System.out.println("количество символов без учета пробелов " + getSize(str, N));

    }

    

    public static int getSize(String text, int max)
    {
        if(text.length()>max){
System.out.println("длина текста превышает длину "+max+" символов");
        }
    return text.replace(" ", "").length();
    }


    public static String isEven(String text) {
        String is_even = "";
        if (text.length() % 2 == 0) {
            is_even = "четное количество символов";
        } else {
            is_even = "нечетное количество символов";
        }
        return is_even;
    }




}
