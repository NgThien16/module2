package case_study_1.entity;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private int area;
    private int cost;
    private int maximumPeople;
    private int type;

    public Facility(){

    }

    public Facility(String serviceCode, String serviceName, int area, int cost, int maximumPeople, int type) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.maximumPeople = maximumPeople;
        this.type = type;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maximumPeople=" + maximumPeople +
                ", type=" + type +
                '}';
    }
}
