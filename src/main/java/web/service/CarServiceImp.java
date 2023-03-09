package web.service;

import org.springframework.stereotype.Controller;
import web.model.Car;


import java.util.Arrays;
import java.util.List;

@Controller
public class CarServiceImp implements CarService {

    private final List<Car> cars;
    private int countCars;

    public CarServiceImp() {
        cars = Arrays.asList(
                new Car(++countCars, "Car1", 111),
                new Car(++countCars, "Car2", 222),
                new Car(++countCars, "Car3", 333),
                new Car(++countCars, "Car4", 444),
                new Car(++countCars, "Car5", 555)
        );
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count >= 5 ? cars.size() : count).toList();
    }
}
