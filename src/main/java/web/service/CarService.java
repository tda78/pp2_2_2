package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "izh", "412"));
        cars.add(new Car(2, "toyota ", "4"));
        cars.add(new Car(3, "zhuk", "412"));
        cars.add(new Car(4, "ford", "22"));
        cars.add(new Car(5, "ferrary", "testarossa"));
    }

    public List<Car> getCars(int count) {
        List<Car> result = new ArrayList<>() {
        };
        for (int i = 0; i < count; i++)
            result.add(cars.get(i));
        return result;
    }
}
