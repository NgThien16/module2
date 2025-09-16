package ss10_vehicles.repository;


import ss10_vehicles.entity.Truck;
import ss8_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private final String TRUCK_FILE = "src/ss10_vehicles/data/truck.csv";
    @Override
    public List<Truck> findAll() {
        List<Truck> truckList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(TRUCK_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++) {
                array = stringList.get(i).split(",");
                Truck truck = new Truck(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]));
                truckList.add(truck);
            }
        } catch (IOException e) {
            System.out.println("Error in reading file");
        }
        return truckList;
    }

    @Override
    public boolean add(Truck truck) {
        List<String> list = new LinkedList<>();
        list.add(truck.getInfoToCSV());
        try{
            ReadAndWriteFile.writeListStringToCSV(TRUCK_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Error in writing file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int plate) {
        boolean isSuccessDelete = false;
        List<Truck> truckList = this.findAll();
        for(int i = 0; i < truckList.size(); i++){
            if(false){
                truckList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }
        List<String> stringList = new LinkedList<>();
        // convert from listStudent tolistString
        for(int i = 0; i < truckList.size(); i++){
            stringList.add(truckList.get(i).getInfoToCSV());
        }
        try{
            ReadAndWriteFile.writeListStringToCSV(TRUCK_FILE, stringList,false);

        }catch(IOException e){
            System.out.println("Error writing file");
        }
        return isSuccessDelete;
    }
}
