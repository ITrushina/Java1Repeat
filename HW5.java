import java.util.Arrays;

/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 06.01.23
 */

public class HW5 {
    public static void main(String[] args) {
        Person[] personArr = new Person[5];
        personArr[0] = new Person ("Петров","Инженер", "petrov@mail.ru", 5552221, 50000, 40);
        personArr[1] = new Person ("Иванов","Инженер", "ivanov@mail.ru", 5552223, 50000, 35);
        personArr[2] = new Person ("Сидоров","Менеджер", "sidorov@mail.ru", 5552224, 40000, 30);
        personArr[3] = new Person ("Смирнов","Старший менеджер", "smirnov@mail.ru", 5552225, 45000, 41);
        personArr[4] = new Person ("Титов","Директор", "titov@mail.ru", 5552229, 70000, 45);

        System.out.println(Arrays.toString(personArr));
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        for (Person p : personArr) {
            if (p.getAge() > 40) {
                System.out.println(p);
            }
        }

        //for (int i = 0; i < personArr.length; i++) {          //тоже работает
        //    if (personArr[i].getAge() > 40) {
        //        System.out.println(personArr[i]);
        //    }
        //}
    }
}