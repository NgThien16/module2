package ss10_vehicles.repository;


import ss10_vehicles.entity.Car;
import ss10_vehicles.entity.Motobike;
import ss10_vehicles.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MotobikeRepository implements IMotobikeRepository {
    private final String MOTORBIKE_FILE = "src/ss10_vehicles/data/motobike.csv";


    @Override
    public List<Motobike> findAll() {
        List<Motobike> motobikeList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(MOTORBIKE_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                Motobike motobike = new Motobike(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
                motobikeList.add(motobike);
            }
        } catch (IOException e) {
            System.out.println("Error in reading file");
        }
        return motobikeList;
    }

    @Override
    public boolean add(Motobike motobike) {
        List<String> list = new LinkedList<>();
        list.add(motobike.getInfoToCSV());
        try{
            ReadAndWriteFile.writeListStringToCSV(MOTORBIKE_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Error in writing file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String plate) {
        boolean isSuccessDelete = false;
        List<Motobike> motobikeList = this.findAll();
        for(int i = 0; i < motobikeList.size(); i++){
            if(motobikeList.get(i).getPlate().equals(plate)){
                motobikeList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }
        List<String> stringList = new LinkedList<>();
        // convert from listStudent tolistString
        for(Motobike motobike : motobikeList){
            stringList.add(motobike.getInfoToCSV());
        }
        try{
            ReadAndWriteFile.writeListStringToCSV(MOTORBIKE_FILE, stringList,false);

        }catch(IOException e){
            System.out.println("Error writing file");
        }
        return isSuccessDelete;
    }

    @Override
    public Motobike findMotobikeByPlate(String plate) {
        List<Motobike> motobikeList = findAll();
        for (Motobike motobike : motobikeList) {
            if (motobike.getPlate().equals(plate)) {
                return motobike;
            }
        }
        return null;
    }

}

