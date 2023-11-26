import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class SellTickets {
    private Map<UUID, Ticket> ticketsRepo;

    public SellTickets() {
        this.ticketsRepo = new HashMap<>();
    }

    public void sellTicket(Person person, BigDecimal price, LocalDateTime date, TransportZone startZone, TransportZone finishZone, boolean isLuggage, int place, int roadNumber, BusRoute routeId) {
        this.ticketsRepo.put(person.getId(), new Ticket(price, date, startZone, finishZone, isLuggage, place, roadNumber, routeId));
    }

    public Ticket getPersonTickets(Person person) {
        return ticketsRepo.get(person.getId());
    }

    public Set<UUID> getAllBuyersUUID() {
        return ticketsRepo.keySet();
    }

    public Collection<Ticket> getAllTickets() {
        return ticketsRepo.values();
    }
}
