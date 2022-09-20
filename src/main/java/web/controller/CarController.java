package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService service;

    public CarService getService() {
        return service;
    }

    @Autowired
    public void setService(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @Nullable @RequestParam("count") Integer count) {
        if (count == null) count = 5;
        if (count > 5) count = 5;
        List<Car> cars = service.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
