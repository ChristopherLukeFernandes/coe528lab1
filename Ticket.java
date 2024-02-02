package coe528.lab1;

public class Ticket {

    private Passenger p;
    private Flight flight;
    private double price;
    private static int number = 0;

    public Ticket(Passenger p, Flight flight, double price) {
        this.p = p;
        this.flight = flight;
        this.price = price;
        this.number += 1;
    }

    public Passenger getPassenger() {
        return p;
    }

    public static int getNumber() {
        return number;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPassenger(Passenger p) {
        this.p = p;
    }

    public static void setNumber(int number) {
        Ticket.number = number;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket Info: " + p.name + " " + flight + ", DISCOUNTED PRICE " + price;
    }
}
