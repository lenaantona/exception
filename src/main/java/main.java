import java.util.Scanner;

public class main {


    public static void inputFloat() {//ввод вещественного числа задание №1
        Scanner scanner = new Scanner(System.in);
        float num = 0;
        while (true) {
            System.out.println("Введите вещественное число: ");
            try {
                num = Float.parseFloat(scanner.nextLine());
                System.out.println(num);
                break;
            } catch (Exception e) {
                System.out.println("это не вещественное число, введите вещественное число");
            }
        }
    }
// задание №2
    public static void division(double [] intArray) {

        try {
            int d = 0;
            if (d==0) throw new Exception("произошло деление на 0");
            else {double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);}
        } catch (Exception e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
    public static void inputString() {//ввод ненулевой строки задание №4(пробел не считается нулевой строкой)
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку: ");
            try {
                String s = scanner.nextLine();
                if (s.length()==0) throw new Exception("пустая строка, повторите ввод: ");
                else {
                    System.out.println("вы ввели - " + s);
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void printSum(Integer a, Integer b) { //задание № 3
        System.out.println(a + b);
    }



    public static void main(String[] args) throws Exception{
//        //inputFloat(); //ввод вещественного числа задание №1
//
//        //double [] arr = {1, 2, 3, 4, 5, 8, 6, 8, 5, 10};
//        //division(arr); //задание №2
//
//        inputString();//ввод не нулевой строки задание №4

        try { //задание №3
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Произошло деление на 0!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }

    }

}
