package ss10_vehicles.repository;

import ss10_vehicles.entity.Truck;

import java.util.LinkedList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static List<Truck> trucks = new LinkedList<>();
    static{
        trucks.add(new Truck(1,"Hyundai",2022,"Trent",9));
        trucks.add(new Truck(2,"Suzuki",2014,"Harry",9));
        trucks.add(new Truck(3,"Ford",2010,"Young",9));
    }
    @Override
    public List<Truck> findAll() {
        return trucks;
    }

    @Override
    public boolean add(Truck truck) {
        trucks.add(truck);
        return true;
    }

    @Override
    public boolean delete(Truck truck) {
        for(Truck t:trucks){
            if(t.getPlate()==truck.getPlate()){
                trucks.remove(t);
                return true;
            }
        }
        return false;
    }

    @Override
    public Truck findById(int plate) {
        return null;
    }

    @Override
    public List<Truck> findByName(String name) {
        return List.of();
    }
}
