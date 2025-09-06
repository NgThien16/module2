package ss10_vehicles.repository;

import ss10_vehicles.entity.Motobike;


import java.util.LinkedList;
import java.util.List;

public class MotobikeRepository implements IMotobikeRepository{
    private static List<Motobike> motobikes =new LinkedList<>();
    static{
        motobikes.add(new Motobike(11,"Honda",2020,"David",10));
        motobikes.add(new Motobike(12,"Yamaha",2024,"Frank",11));
        motobikes.add(new Motobike(13,"Suzuki",2015,"James",9));
    }
    @Override
    public List<Motobike> findAll() {
        return motobikes;
    }

    @Override
    public boolean add(Motobike motobike) {
        motobikes.add(motobike);
        return true;
    }

    @Override
    public boolean delete(Motobike motobike) {
        for (Motobike m : motobikes) {
            if (m.getPlate() == motobike.getPlate()) {
                motobikes.remove(m);
                return true;
            }
        }
        return false;
    }

    @Override
    public Motobike findById(int id) {
        return null;
    }

    @Override
    public List<Motobike> findByName(String name) {
        return List.of();
    }
}
