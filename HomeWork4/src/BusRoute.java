import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BusRoute {
    private UUID id;
    private String remark;
    private int capacity;
    private List<BusStop> busStops;

    public BusRoute(String remark, int capacity) {
        this.id = UUID.randomUUID();
        this.remark = remark;
        this.capacity = capacity;
        this.busStops = new ArrayList<BusStop>();
    }

    public UUID getId() {
        return id;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addBusStop(BusStop busStop) {
        busStops.add(busStop);
    }

    @Override
    public String toString() {
        StringBuilder resString = new StringBuilder();
        for (BusStop busStop :
                busStops) {
            resString.append(busStop.getName()).append("\n");
        }
        return resString.toString();
    }
}
