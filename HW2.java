/**
 * Java1.HW2
 * @author Trusina Irina
 * @version 01.01.23
 */
public class HW2 {
    public static void main(String[] args) {
        System.out.println(checkSum (1, 5));
        System.out.println(checkSum (5, 5));
        System.out.println(checkSum (7, 5));
        System.out.println(checkSum (10, 10));
        System.out.println(checkSum (1, 30));
        System.out.println("---------------------");

        positiveOrNegative (-5);
        positiveOrNegative (0);
        positiveOrNegative (35);
        System.out.println("---------------------");

        System.out.println(trueOrFalse (-23));
        System.out.println(trueOrFalse (0));
        System.out.println(trueOrFalse (45));
        System.out.println("---------------------");

        printText("win", 3);
        System.out.println("---------------------");

        System.out.println(leapYear (2100));
        System.out.println(leapYear (2000));
        System.out.println(leapYear (1700));
        System.out.println(leapYear (2107));
    }

    static boolean checkSum(int a, int b) {
        return (a + b >= 10) && (a +b <= 20);
    }

    static void positiveOrNegative (int a) {
        System.out.println(a >= 0? "положительное" : "отрицательное");
    }

    static boolean trueOrFalse (int a) {
        return (a < 0);
    }

    static void printText (String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean leapYear (int a) {
        return (a % 4 == 0 && a % 100 != 0) || a % 400 == 0;
    }
}