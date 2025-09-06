package ss10_vehicles.repository;

import ss10_vehicles.entity.Car;


import java.util.LinkedList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static List<Car> cars = new LinkedList<>();
    static{
        cars.add(new Car(21,"Mazda",2020,"Tom",4,"Sedal"));
        cars.add(new Car(22,"Mercedes",2011,"Benjamin",16,"Passenger"));
        cars.add(new Car(23,"Toyota",2009,"Marry",7,"SUV"));
    }
    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public boolean add(Car car) {
        cars.add(car);
        return true;
    }

    @Override
    public boolean delete(Car car) {
        for(Car c:cars){
            if(c.getPlate()==car.getPlate()){
                cars.remove(c);
                return true;
            }
        }
        return false;
    }

    @Override
    public Car findById(int id) {
        return null;
    }

    @Override
    public List<Car> findByName(String name) {
        return List.of();
    }
}
