package case_study_1.service;

import case_study_1.entity.Facility;
import case_study_1.repository.FacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public Map<Facility, Integer> findAllFacilities() {
        Map<Facility, Integer> facilities = facilityRepository.findAllFacilities();
        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            System.out.println(entry.getKey() + " | Used: " + entry.getValue());
        }
        return facilities;
    }

    @Override
    public void add(Facility facility) {
        if (facilityRepository.add(facility)) {
            System.out.println("Add successfully!");
        } else {
            System.out.println("Facility already exists!");
        }
    }

    @Override
    public Map<Facility, Integer> findMaintenanceList() {
        Map<Facility, Integer> facilities = facilityRepository.findAllFacilities();
        Map<Facility, Integer> maintenanceList = new LinkedHashMap<>();

        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            if (entry.getValue() >= 5) { // quy định: facility dùng >=5 lần thì bảo trì
                maintenanceList.put(entry.getKey(), entry.getValue());
            }
        }

        if (maintenanceList.isEmpty()) {
            System.out.println("No facility needs maintenance!");
        } else {
            for (Map.Entry<Facility, Integer> entry : maintenanceList.entrySet()) {
                System.out.println("Maintenance: " + entry.getKey() + " | Used: " + entry.getValue());
            }
        }

        return maintenanceList;
    }
}
