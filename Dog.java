/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 08.01.23
 */

class Dog extends Animal {
    public Dog (String className, int canRun, int canSwim) {
        super(className, canRun, canSwim);
    }

    @Override
    public String toString() {
        return getClassName() + " может пробежать " + canRun + " метров и может проплыть " + canSwim + " метров";
    }
}
