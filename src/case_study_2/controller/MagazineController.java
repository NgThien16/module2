package case_study_2.controller;

import case_study_2.entity.Magazine;
import case_study_2.service.MagazineService;
import case_study_2.view.MagazineView;

import java.util.List;

public class MagazineController {
    private MagazineService magazineService = new MagazineService();

    public void addMagazine() {
        System.out.println("Add new magazine");
        Magazine magazine = MagazineView.inputDataForNewMagazine();
        boolean isAddSuccess = magazineService.add(magazine);
        if (isAddSuccess) {
            System.out.println("successfully add magazine");
        } else {
            System.out.println("can not add magazine");
        }

    }


    public void displayMagazine() {
        List<Magazine> magazineList = magazineService.findAll();
        MagazineView.displayMagazine(magazineList);
    }

    public void deleteMagazine() {
        System.out.println("Delete magazine");
        String deleteMagazine = MagazineView.deleteMagazine();
        boolean isDeleteSuccess = magazineService.delete(deleteMagazine);
        if (isDeleteSuccess) {
            System.out.println("successfully delete magazine");
            
        }else{
            System.out.println("can not delete magazine");
        }
        
    }
    public void searchMagazine() {
        System.out.println("Search magazine");
        MagazineView.searchMagazine();
    }
}
