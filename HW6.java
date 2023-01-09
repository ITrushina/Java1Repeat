/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 08.01.23
 */

public class HW6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот",200, 0);
        Dog dog = new Dog("Пес", 500, 10);
        System.out.println(cat);
        cat.run(100);
        cat.run(300);
        cat.swim(50);
        System.out.println(dog);
        dog.run(100);
        dog.run(700);
        dog.swim(50);
        dog.swim(10);
    }
}
