/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 08.01.23
 */

abstract class Animal implements IAnimal{
    protected int canRun;
    protected int canSwim;
    private String className;

    Animal (String className, int canRun, int canSwim) {
        this.canRun = canRun;
        this.canSwim = canSwim;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public void run (int distance) {
       if (distance <= canRun) {
           System.out.println(getClassName() + " пробежал " + distance + " метров");
       } else {
           System.out.println(getClassName() + " не смог пробежать " + distance + " метров");
       }
   }

    @Override
    public void swim (int distance) {
        if (distance <= canSwim) {
            System.out.println(getClassName() + " проплыл " + distance + " метров");
        } else {
            System.out.println(getClassName() + " не смог проплыть " + distance + " метров");
        }
    }


}
