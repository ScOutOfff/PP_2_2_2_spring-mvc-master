package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");
        System.out.println("count = " + count);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", 630, 4123));
        carList.add(new Car("BMW", 512, 1242));
        carList.add(new Car("MERS", 523, 5132));
        carList.add(new Car("Lada", 2, 4623));
        carList.add(new Car("Toyota", 562, 5134));

        if (!(count == null)) {
            int i = Integer.parseInt(count);
            if(i>5) i = 5;
            List<Car> cars = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                cars.add(carList.get(j));
            }
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", carList);
        }

        return "cars";
    }
}
