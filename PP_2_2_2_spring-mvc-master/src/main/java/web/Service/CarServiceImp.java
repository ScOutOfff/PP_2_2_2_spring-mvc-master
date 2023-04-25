package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getCarList(String countString) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 630, 4123));
        cars.add(new Car("BMW", 512, 1242));
        cars.add(new Car("MERS", 523, 5132));
        cars.add(new Car("Lada", 2, 4623));
        cars.add(new Car("Toyota", 562, 5134));
        if (countString == null) return cars;
        else {
            int count = Integer.parseInt(countString);
            if(count > 5) count = 5;
            if(count < 0) count = 0;
            List<Car> carList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                carList.add(cars.get(i));
            }
            return carList;
        }
    }
}
