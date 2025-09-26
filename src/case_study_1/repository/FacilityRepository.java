package case_study_1.repository;

import case_study_1.entity.Facility;
import case_study_1.entity.House;
import case_study_1.entity.Room;
import case_study_1.entity.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {

    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();

    static {
        facilityList.put(new Villa("SVVL-0001", "LuxuryVilla", 50, 200, 10, "Day", "Deluxe", 35, 2), 0);
        facilityList.put(new House("SVHO-0001", "GreenHouse", 45, 150, 8, "Month", "Standard", 3), 0);
        facilityList.put(new Room("SVRO-0001", "BasicRoom", 35, 80, 4, "Hour", "FreeDrink"), 0);
    }

    @Override
    public Map<Facility, Integer> findAllFacilities() {
        return facilityList;
    }

    @Override
    public boolean add(Facility facility) {
        facilityList.put(facility, 0);
        return true;
    }

    public Map<Facility, Integer> findMaintenanceList() {
        Map<Facility, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            if (entry.getValue() >= 5) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
