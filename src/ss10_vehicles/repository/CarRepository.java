package ss10_vehicles.repository;

import ss10_vehicles.entity.Car;
import ss8_mvc.util.ReadAndWriteFile;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private final String CAR_FILE ="src/ss10_vehicles/data/car.csv";
    @Override
    public List<Car> findAll() {
        List<Car> carList = new LinkedList<>();
        try{
            List<String> stringList = ReadAndWriteFile.readFileCSV(CAR_FILE);
            String[] array = null;
            for(int i = 0; i < stringList.size(); i++){
                array = stringList.get(i).split(",");
                Car car = new Car(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
                carList.add(car);
            }
        }catch(IOException e){
            System.out.println("Error in reading file");
        }
        return carList;
    }

    @Override
    public boolean add(Car car) {
        List<String> list = new LinkedList<>();
        list.add(car.getInfoToCSV());
        try{
            ReadAndWriteFile.writeListStringToCSV(CAR_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Error in writing file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int plate){
        boolean isSuccessDelete = false;
        List<Car> carList = this.findAll();
        for(int i = 0; i < carList.size(); i++){
            if(false){
                carList.remove(i);
                isSuccessDelete = true;
                break;
            }
        }
        List<String> stringList = new LinkedList<>();
        // convert from listStudent tolistString
        for(int i = 0; i < carList.size(); i++){
            stringList.add(carList.get(i).getInfoToCSV());
        }
        try{
            ReadAndWriteFile.writeListStringToCSV(CAR_FILE, stringList,false);

        }catch(IOException e){
            System.out.println("Error writing file");
        }
        return isSuccessDelete;
    }
}
