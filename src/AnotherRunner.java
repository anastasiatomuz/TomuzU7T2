import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args){
        Car[] carsArray = {new Car("Explorer", 22000),
                new Car("Model X", 12000), new Car("Prius", 2500)};
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(carsArray));
        System.out.println(cars);
    }
}
// 9.84, 8.93, 7.63,