public class TransportZone extends BusStop {
    private String remark;

    public TransportZone(String name, double attitude, double latitude, String remark) {
        super(name, attitude, latitude);
        this.remark = remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }
}
