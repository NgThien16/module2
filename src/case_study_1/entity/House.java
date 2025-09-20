package case_study_1.entity;

public class House extends Facility {
    private String roomStandard;
    private int floor;
    public House(){

    }

    public House(String serviceCode, String serviceName, int area, int cost, int maximumPeople, int type, String roomStandard, int floor) {
        super(serviceCode, serviceName, area, cost, maximumPeople, type);
        this.roomStandard = roomStandard;
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                '}';
    }
}
