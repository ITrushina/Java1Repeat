/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 08.01.23
 */

class Cat extends Animal {
    public Cat (String className, int canRun, int canSwim) {
        super (className, canRun, canSwim);
    }

    @Override
    public void swim (int distance) {
        System.out.println("Коты не плавают");
    }

    @Override
    public String toString() {
        return getClassName() + " может пробежать " + canRun + " метров и не умеет плавать.";
    }
}
