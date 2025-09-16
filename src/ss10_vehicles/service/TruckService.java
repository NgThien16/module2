package ss10_vehicles.service;

import ss10_vehicles.entity.Truck;
import ss10_vehicles.repository.ITruckRepository;
import ss10_vehicles.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {
    private ITruckRepository truckRepository =new TruckRepository();
    @Override
    public List<Truck> findAll() {
        return truckRepository.findAll();
    }

    @Override
    public boolean add(Truck truck) {
        return truckRepository.add(truck);
    }

    @Override
    public boolean delete(int plate) {
        return truckRepository.delete(plate);
    }
}
