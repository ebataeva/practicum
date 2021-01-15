//
//       0. Создать пустой проект в IntelliJ IDEA и прописать метод main().
//       1. Создать переменные всех пройденных типов данных и инициализировать их значения.
//       2. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//        где a, b, c, d – аргументы этого метода, имеющие тип float.
//        3. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//        4. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
//        5.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//        6. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
//        7. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.


public class homework {

    //#0
    //  Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        System.out.println(calc(1, -2, 3, 4));
        System.out.println(isSumInInterval(51, 6));
        isPositive(1000000);
        isPositive(-3);
        greeting("vava");
        isLeap(-400);

    }

    //#1
    // Создать переменные всех пройденных типов данных и инициализировать их значения.
    static int a = 10;
    byte b = 7;
    static short s = -10;
    static long l = -192l;
    float f = 222.51f;
    double d = 13523.2222;
    char c = '?';
    boolean Boolean = true;

    //#2
    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //        где a, b, c, d – аргументы этого метода, имеющие тип float.
    // прошу заметить , что в задании не было сказано "вывести на экран". только вернуть результат.
    public static float calc(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }
    //#3
    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false

    public static boolean isSumInInterval(int a, int b) {
        int c = a + b;
        boolean Boolean = true;
        if (c >= 10 && c <= 20) {
            Boolean = true;
        } else {
            Boolean = false;
        }
        return Boolean;
    }
    //4
    //    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void isPositive(int a) {
        if (a < 0) {
            System.out.println("число отрицательное");
        } else {
            System.out.println("число положительное");
        }

    }
    //5
    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isPositiveBoolean(int a){
        boolean Boolean = true;
        if(a<0){
            Boolean = false;
        }else{
            Boolean = true;
        }
        return Boolean;
    }
    //#6.
    // Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void greeting(String name){
        System.out.println("Привет, "+ name + "!");
    }
    //#7.
    // *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void isLeap(int year){
        if(year>0 && year % 400 == 0 || year % 4 ==0 && year % 100 != 0){
            System.out.println("високосный");
        }else{
            System.out.println("невисокосный");
        }
    }
}


