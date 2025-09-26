package case_study_1.service;

import case_study_1.entity.Facility;

import java.util.Map;

public interface IFacilityService {
    Map<Facility,Integer> findAllFacilities();
    void add(Facility facility);
    Map<Facility, Integer> findMaintenanceList();
}
