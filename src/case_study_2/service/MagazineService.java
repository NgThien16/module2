package case_study_2.service;

import case_study_2.entity.Magazine;
import case_study_2.repository.MagazineRepository;

import java.util.List;

public class MagazineService implements IMagazineSevice {
    MagazineRepository magazineRepository = new MagazineRepository();
    @Override
    public List<Magazine> findAll() {
        return magazineRepository.findAll();
    }

    @Override
    public boolean add(Magazine magazine) {
        return magazineRepository.add(magazine);
    }

    @Override
    public boolean delete(String documentId) {
        return magazineRepository.delete(documentId);
    }

    @Override
    public Magazine findById(String documentId) {
        return magazineRepository.findById(documentId);
    }

    @Override
    public List<Magazine> findByName(String name) {
        return magazineRepository.findByName(name);
    }
}
