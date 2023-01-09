/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 08.01.23
 */
public class Kitten {
    private String name;
    private int appetite;
    private boolean satiety;

    public Kitten (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString (){
        return "\n" + name + ": Аппетит " + appetite + ". Сытость " + satiety;
    }

    void eat(Plate plate) {
         if ((this.satiety == false) && (this.appetite <= plate.getFood())) {
             plate.decreaseFood(appetite);
             this.satiety = true;
             System.out.println(this.name + " поел! Сытость " + this.satiety);
         } else {
             System.out.println(this.name + " не поел! Сытость " + this.satiety);
         }
    }
}
