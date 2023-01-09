import java.util.Arrays;
import java.util.Random;

/**
 * Java1.HW5
 * @author Trusina Irina
 * @version 08.01.23
 */
public class HW7 {
    public static void main(String[] args) {
        Random random = new Random();
        Kitten[] kittenArr = {
            new Kitten("Барсик", random.nextInt(10)),
            new Kitten("Марсик", random.nextInt(10))
        };
        Plate plate = new Plate(random.nextInt(20));
        System.out.println(plate);//инфо о тарелке

        System.out.println(Arrays.toString(kittenArr));

        for (Kitten k : kittenArr) {
            k.eat(plate);
            System.out.println(plate);
        }
        plate.addFood(random.nextInt(10));

        for (Kitten k : kittenArr) {
            k.eat(plate);
            System.out.println(plate);
        }
    }
}
