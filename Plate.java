/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 08.01.23
 */
public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    @Override
    public String toString (){
        return "В тарелке лежит " + food + " еды";
    }

    public void decreaseFood (int f) {
        this.food -= f;
    }

    public void addFood (int f) {
        this.food += f;
        System.out.println("\nВ тарелку добавили " + f + " еды");
        toString();
    }
}
