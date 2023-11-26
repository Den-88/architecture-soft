import java.lang.System;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Добавим автовокзал (с которого будет отправляться пассажир)
        TransportZone volgograd = new TransportZone("Автовокзал г. Волгоград", 48.7533754, 44.4706892, "Какое-то описание Волгоградского автовокзала");
        // Добавим промежуточную остановку
        BusStop morozovsk = new BusStop("Морозовск", 48.3488512, 41.8069552);
        // Добавим ещё промежуточную остановку
        BusStop shahti = new BusStop("Шахты", 47.7439754, 40.0680288);
        // Добавим автовокзал (который будет конечной точкой следования)
        TransportZone rostov = new TransportZone("Автовокзал г. Ростов", 47.2232936, 39.6613665, "Какое-то описание Ростовского автовокзала");

        // Создаём маршрут следования
        BusRoute volgograd_rostov = new BusRoute("Маршрут Волгоград-Ростов", 4);
        volgograd_rostov.addBusStop(volgograd);
        volgograd_rostov.addBusStop(morozovsk);
        volgograd_rostov.addBusStop(shahti);
        volgograd_rostov.addBusStop(rostov);
        // Выводим на экран информацию о маршруте
        System.out.println("Маршрут:\n" + volgograd_rostov);

        // Регистрируем нового пользователя
        Person person = new Person("Иванов Иван Иванович", "PASSWORD".hashCode(), "IvanOff");
        // Выводим на экран информацию о пользователе (id, логин, ФИО)
        System.out.println("Пользователь: " + person);
        // Пользователь добавляет даннные банковской карты для покупки билета
        person.setCardNumber("1234 5678 8765 4321");

        // Пользователь приобретает билет
        SellTickets sellTickets = new SellTickets();
        sellTickets.sellTicket(person, BigDecimal.valueOf(2400.00), LocalDateTime.now(), volgograd, rostov, true, 12, 5, volgograd_rostov);
    }

}
