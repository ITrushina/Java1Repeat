/**
 * Java1.HW1
 * @author Trusina Irina
 * @version 28.12.22
 */
public class HW1 {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("-----------------------------");
        checkSumSign(2, 5);
        checkSumSign(-5, 1);
        checkSumSign(3, -3);
        System.out.println("-----------------------------");
        printColor(-200);
        printColor(0);
        printColor(20);
        printColor(100);
        printColor(300);
        System.out.println("-----------------------------");
        compareNumbers(100, 50);
        compareNumbers(20, 60);
        compareNumbers(70, 70);
        compareNumbers(-100, -50);
        System.out.println("-----------------------------");
    }

    static void printThreeWords () {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    static void checkSumSign (int a, int b) {
        int sum = a + b;
        System.out.println("a = " + a + ", b = " + b + ", сумма = " + sum);
        System.out.println(sum >= 0? "Сумма положительная" : "Сумма отрицательная");
    }

    static void printColor(int value) {
        if (value > 0) {
            if (value > 100) {
                System.out.println("Зеленый");
            } else {
                System.out.println("Желтый");
            }
        }
        else {
            System.out.println("Красный");
        }
    }

    static void compareNumbers(int a, int b) {
        System.out.println(a >= b? "a >= b" : "a < b");
    }
