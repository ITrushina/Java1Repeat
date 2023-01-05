import java.util.Random;
import java.util.Scanner;

/**
 * Java1.HW3
 * @author Trusina Irina
 * @version 05.01.23
 */

public class TicTacToe {                                            // класс
    final char SIGN_X = 'x';//человек                               // финализированное поле - изменить нельзя. имя всегда В ВЕРХНЕМ РЕГИСТРЕ
    final char SIGN_O = 'o';//комрьютер                             // символы char всегда в одинарных кавычках
    final char SIGN_EMPTY = '.';                                    // нет слова static, поле не статическое, нельзя просто распечатать в статическом
                                                                    // контексте (в статическом классе мейн): sout(SIGN_O);
                                                                    // чтобы из статического класса Мэйн вызвать нестатическое поле нужно
                                                                    // сначала создать объект того класса в котором находится поле
    char[][] table;                                                 // переменная внутри класса называется полем. создаем игровое поле
    Random random;                                                  // опишем поля random и scanner. создание объектов будет ниже по коду
    Scanner scanner;

    TicTacToe () {                                                  // конструктор в котором инициализируем поля
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char [3][3];

    }
    public static void main(String[] args) {                        // статический метод
        TicTacToe t = new TicTacToe();                              // создали объект на основе класса TicTacToe: (тип) имя переменной = new (вызываем конструктор)
        //System.out.println(t.SIGN_O);                             // можем распечатать значение поля обратившись к нему через точку по имени переменной объекта
        t.game();
    }

    void game () {                                                  // метод класса ТикТакТое с основной игровой логикой
        initTable ();
        System.out.println("Игра началась");
        while (true) {
            printTable ();
            turnHuman ();
            if (checkWin (SIGN_X)) {
                System.out.println("Поздравляю! Вы выиграли!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Ничья!");
                break;
            }
            turnAi ();
            if (checkWin (SIGN_O)) {
                System.out.println("Вы проиграли...");
                break;
            }
            if (isTableFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    void initTable () {                                             // инициализация игровового поля - заполнение "пустыми" элементами (символами точки)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable () {                                            // печать игровового поляв консоль
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
    }

    boolean isTableFull () {                                             // инициализация игровового поля - заполнение "пустыми" элементами (символами точки)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    void turnHuman () {
        int x, y;
        do {
            System.out.println("Ваш ход: введите координаты ячейки от 1 до 3");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table [y][x] = SIGN_X;
    }

    void turnAi () {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table [y][x] = SIGN_O;
    }

    boolean checkWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) || (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)) {
                return true;
            }
        }
        if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) || (table[0][2] == ch && table[1][1] == ch && table[2][0] == ch)) {
            return true;
        }
        return false;
    }


    boolean isCellValid (int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }
}
