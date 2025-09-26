package case_study_1.entity;

public class Room extends Facility {
    private String freeService;
    public Room(){

    }

    public Room(String serviceCode, String serviceName, int area, int cost, int maximumPeople, String type, String freeService) {
        super(serviceCode, serviceName, area, cost, maximumPeople, type);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
