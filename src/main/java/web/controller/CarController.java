package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Service.CarService;
import web.Service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService;
    @Autowired
    public CarController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping
    public String printCars(Model model) {
        model.addAttribute("cars",carService.getCars(5));
        return "cars";
    }
    @GetMapping("/{count}")
    public String printCars(Model model, @PathVariable("count") int count) {
        model.addAttribute("cars",carService.getCars(count));
        return "cars";
    }
    


}
