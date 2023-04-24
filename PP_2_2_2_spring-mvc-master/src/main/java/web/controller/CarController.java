package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import web.CarService;
import web.CarServiceImp;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");
//        System.out.println("count = " + count);

        CarService carServiceImp = new CarServiceImp();

        model.addAttribute("cars", carServiceImp.getCarList(count));

        return "cars";
    }
}
