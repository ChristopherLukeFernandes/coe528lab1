package coe528.lab1;

public class Flight {

    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) throws IllegalArgumentException {
        this.flightNumber = flightNumber;
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("Origin cannot be the same as destination!");
        }
        this.origin = origin;
        this.departureTime = departureTime;
        this.destination = destination;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
    }

    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft -= 1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "FLIGHT #" + flightNumber + ", FROM '" + origin + '\'' + ", TO '" + destination + '\'' + ", DEPARTING ON " + departureTime + '\''
                + ", CAPACITY " + capacity + ", SEATS REMAINING " + numberOfSeatsLeft + ", ORIGINAL PRICE $" + originalPrice;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
