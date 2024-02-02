package coe528.lab1;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private List<Flight> flights = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();

    public Manager() {
        createFlights();
    }

    public void createFlights() {
        flights.add(new Flight(1, "Toronto", "Kolkata", "02/10/24 7:00 pm", 300, 100));
        flights.add(new Flight(2, "Toronto", "Montreal", "02/09/24 3:00 pm", 100, 200));
        flights.add(new Flight(3, "Toronto", "Ottawa", "02/28/24 10:00 pm", 400, 500));
        flights.add(new Flight(4, "Toronto", "Vancouver", "02/17/24 5:00 am", 250, 450));
        flights.add(new Flight(5, "Toronto", "Calgary", "02/21/24 2:00 am", 50, 250));
        flights.add(new Flight(6, "Toronto", "Kolkata", "02/15/24 10:00 pm", 300, 300));
        flights.add(new Flight(7, "Toronto", "Kolkata", "02/19/24 5:00 am", 300, 100));
        flights.add(new Flight(8, "Toronto", "Kolkata", "02/15/24 6:30 pm", 300, 200));
        flights.add(new Flight(9, "Toronto", "Kolkata", "02/07/24 7:00 am", 300, 125));
    }

    public void displayAvailableFlights(String origin, String destination) {
        System.out.println("AVALIABLE FLIGHTS:");
        for (Flight flight : flights) {
            if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
                if (flight.getNumberOfSeatsLeft() > 0) {
                    System.out.println(flight.toString());
                }
            }
        }
        System.out.println("__________________________________________________");
    }

    public Flight getFlight(int flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }

        return null;
    }

    public void bookSeat(int flightNumber, Passenger p) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                if (flight.bookASeat()) {
                    Ticket ticket = new Ticket(p, flight, p.applyDiscount(flight.getOriginalPrice()));
                    System.out.println(ticket.toString());
                    tickets.add(ticket);
                }
            }
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.displayAvailableFlights("Toronto", "Kolkata");
        Flight flight = manager.getFlight(1);
        System.out.println(flight.toString());
        manager.bookSeat(1, new Member("Chris", 20, 6));
        manager.bookSeat(1, new Member("Adam", 27, 3));
        manager.bookSeat(1, new NonMember("Nick", 74));
    }
}
