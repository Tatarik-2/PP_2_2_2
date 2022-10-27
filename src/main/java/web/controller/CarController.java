package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private final CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String getCars(@RequestParam(defaultValue = "5") int count,
                         Model model){
        model.addAttribute(carDAO.getCars(count));
        return "car/cars";
    }
}
