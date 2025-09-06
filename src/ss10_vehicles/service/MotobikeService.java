package ss10_vehicles.service;

import ss10_vehicles.entity.Motobike;
import ss10_vehicles.repository.IMotobikeRepository;
import ss10_vehicles.repository.MotobikeRepository;

import java.util.List;

public class MotobikeService implements IMotobikeService {
    private IMotobikeRepository  motobikeRepository = new MotobikeRepository();
    @Override
    public List<Motobike> findAll() {
        return motobikeRepository.findAll();
    }

    @Override
    public boolean add(Motobike motobike) {
        return motobikeRepository.add(motobike);
    }

    @Override
    public boolean delete(Motobike motobike) {
        return motobikeRepository.delete(motobike);
    }

    @Override
    public Motobike findById(int id) {
        return motobikeRepository.findById(id);
    }

    @Override
    public List<Motobike> findByName(String name) {
        return motobikeRepository.findByName(name);
    }
}
