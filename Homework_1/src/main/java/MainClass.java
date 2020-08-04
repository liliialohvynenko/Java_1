//Создать пустой проект в IntelliJ IDEA и прописать метод main().
//Создать переменные всех пройденных типов данных и инициализировать их значения.
//Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.
//Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
//Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
// *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

public class MainClass {

    public static void main(String[] args) {
        byte bt = 2;
        short shr = 4;
        int nt = 6;
        long lng = 8;

        float flt = 4;
        double dbl = 2.5;

        boolean bl = false;
        char chr = 'c';

        System.out.println("Задание №1: ");
        float e = calculate(1, 2, 10, 5);
        System.out.println("e = " + e);
        System.out.println("______________________________________________");

        System.out.println("Задание №2: ");
        boolean result = check(2, 16);
        System.out.println("______________________________________________");

        System.out.println("Задание №3: ");
        boolean result2 = number(-99);
        System.out.println("______________________________________________");

        System.out.println("Задание №4: ");
        name("Лилия");
        System.out.println("______________________________________________");

        System.out.println("Задание №5: ");
        boolean year = year(2020);

    }

    public static float calculate(float a, float b,float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean check (int a, int b){
        int result = a + b;
        if( 10 <= result && result >= 20){
            System.out.println("Результат находится в промежутке между 10 и 20 включительно.");
            return true;

        } else {
            System.out.println("Результат находится не в промежутке между 10 и 20 включительно.");
            return false;
        }
    }

    public static boolean number(int a){
        if (a < 0){
            System.out.println("Число " + a + " отрицательное.");
            return true;
        } else {
            System.out.println("Число " + a + " положительное.");
            return false;
        }
    }

    public static void name(String name) {
        System.out. println("Привет, " + name + "!");
    }

    public static boolean year(int year){
        if (year / 4 == 0 && year / 100 != 0 ){
            System.out.println(year + " год " + "является високосным.");
            return true;
        } else {
            System.out.println(year+ " год " + "не является високосным.");
            return false;
        }
    }
}
