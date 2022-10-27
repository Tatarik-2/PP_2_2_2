package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("R-100", "Black", 2005));
        carList.add(new Car("R-200", "Green", 2008));
        carList.add(new Car("R-300", "Yellow", 2011));
        carList.add(new Car("R-400", "Green", 2015));
        carList.add(new Car("R-500", "Orange", 2020));
    }

    public List<Car> getCars (int a){
        return  carList.stream().limit(a).toList();
    }
}
