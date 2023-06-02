package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{
    private List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("bmw",231,"black"));
        carList.add(new Car("audi",125,"white"));
        carList.add(new Car("daewo",109,"blue"));
        carList.add(new Car("vaz",75,"red"));
        carList.add(new Car("nissan",98,"gold"));

    }
    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).toList();
    }
}
