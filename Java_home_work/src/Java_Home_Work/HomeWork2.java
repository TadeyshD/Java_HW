package Java_Home_Work;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sum_of_numbers(15, 4));
        System.out.println("**");
        positive_or_negative(0);
        System.out.println("**");
        System.out.println(positive_or_negative_vol_2(46));
        System.out.println("**");
        numbers("Hello my dear Java", 5);
        System.out.println("**");
        System.out.println(stellar_challenge(2012));
    }

    // Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean sum_of_numbers(int a, int b) {return a + b >= 10 && a + b <= 20;}

    //Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    public static void positive_or_negative(int a) {
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
    //Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean positive_or_negative_vol_2(int a) {return a < 0;}
    //Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void numbers(String w, int t) {
        for (int i = 0; i < t; i++) {
            System.out.print(w + ", ");
        }
        {
            System.out.println();
        }
    }
    //Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    public static boolean stellar_challenge(int y){return y % 4 == 0 && y % 100 > 0 || y % 400 == 0 && y % 100 == 0;}

}
