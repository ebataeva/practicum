import java.util.Date;
import java.util.Scanner;
//
//C 00 часов до 04 часов включительно программа при запуске пишет - "Доброй ночи, {username}"
//        С 05 часов до 09 часов включительно программа при запуске пишет - "Доброе утро, {username}"
//        С 10 часов до 16 часов включительно программа при запуске пишет - "Добрый день, {username}"
//        С 17 часов до 23 часов включительно программа при запуске пишет - "Добрый вечер, {username}"

public class Lesson1 {

      public static void main(String[] args){
        Date date = new Date();
        date = date.before();
        System.out.println("введите свое имя"+date);
        Scanner in = new Scanner(System.in);
     //   String name =  in.next();
        //System.out.println( "приветствую, " + name+date);

    }
}
