package case_study_1.entity;

public class Contract {
    private String contractId;
    private String bookingId;
    private int prepay;
    private int pay;

    public Contract(){

    }

    public Contract(String contractId, String bookingId, int prepay, int pay) {
        this.contractId = contractId;
        this.bookingId = bookingId;
        this.prepay = prepay;
        this.pay = pay;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getPrepay() {
        return prepay;
    }

    public void setPrepay(int prepay) {
        this.prepay = prepay;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", prepay=" + prepay +
                ", pay=" + pay +
                '}';
    }
}
