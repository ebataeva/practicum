import org.joda.time.DateTime;

import java.util.Date;
import java.util.Scanner;
//
//C 00 часов до 04 часов включительно программа при запуске пишет - "Доброй ночи, {username}"
//        С 05 часов до 09 часов включительно программа при запуске пишет - "Доброе утро, {username}"
//        С 10 часов до 16 часов включительно программа при запуске пишет - "Добрый день, {username}"
//        С 17 часов до 23 часов включительно программа при запуске пишет - "Добрый вечер, {username}"

public class Lesson1 {

      public static void main(String[] args){
        DateTime date = new DateTime();
        int hour = date.getHourOfDay();
        System.out.println("введите свое имя  "+hour);
        Scanner in = new Scanner(System.in);
        String name =  in.next();
        System.out.println( greeting(hour)+ name);

    }

    public static String greeting(int h){
          String s = "";
        if(h >= 5 && h <=9){
           s = "Доброе утро, ";
        }
        if (h >= 10 && h <= 16){
            s = "Добрый день, ";
        }
          if (h >= 17 && h <=23){
              s =  "Добрый вечер, ";
          }
          if (h >= 0 && h <=4){
              s =  "Доброй ночи, ";
          }
          return s;
    }
}

