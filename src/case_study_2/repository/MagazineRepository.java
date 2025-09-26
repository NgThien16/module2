package case_study_2.repository;

import case_study_2.entity.Magazine;
import case_study_2.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MagazineRepository implements IMagazineRepository {
    private final String MAGAZINE_FILE = "src/case_study_2/data/magazine.csv";

    @Override
    public List<Magazine> findAll() {
        List<Magazine> magazineList = new ArrayList<>();
        try {
            List<String> stringList = case_study_2.util.ReadAndWriteFile.readFileCSV(MAGAZINE_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                Magazine magazine = new Magazine(array[0], array[1],array[2],array[3],array[4],array[5]);
                magazineList.add(magazine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        return magazineList;
    }

    @Override
    public boolean add(Magazine magazine) {
        List<String> list = new ArrayList<>();
        list.add(magazine.getInfoToCSV());
        try {
            case_study_2.util.ReadAndWriteFile.writeListStringToCSV(MAGAZINE_FILE, list, true);

        } catch (IOException e) {
            System.out.println("Error writing file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String documentId) {
        boolean isSuccessDelete = false;
        List<Magazine> magazineList = this.findAll();
        for (int i = 0; i <magazineList.size() ; i++) {
            if(magazineList.get(i).getDocumentId().equals(documentId)) {
                magazineList.remove(i);
                isSuccessDelete = true;
                break;
            }

        }
        List<String> stringList = new LinkedList<>();
        for (int i = 0; i < magazineList.size(); i++) {
            stringList.add(magazineList.get(i).getInfoToCSV());
        }
        try{
            ReadAndWriteFile.writeListStringToCSV(MAGAZINE_FILE, stringList,false);
        }catch (IOException e){
            System.out.println("Error writing file");
        }
        return isSuccessDelete;
    }

    @Override
    public Magazine findById(String documentId) {
        List<Magazine> magazineList = this.findAll();
        for (Magazine magazine : magazineList) {
            if (magazine.getDocumentId().equalsIgnoreCase(documentId)) {
                return magazine;
            }
        }
        return null;
    }

    @Override
    public List<Magazine> findByName(String name) {
        List<Magazine> result = new ArrayList<>();
        List<Magazine> magazineList = this.findAll();
        for (Magazine magazine : magazineList) {
            if (magazine.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(magazine);
            }
        }
        return result;
    }
}
