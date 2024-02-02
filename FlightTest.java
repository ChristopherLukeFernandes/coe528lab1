package coe528.lab1;

import static org.junit.Assert.*;

public class FlightTest {

    @org.junit.Test
    public void testConstructor() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals("Toronto", flight.getOrigin());
        assertEquals("Kolkata", flight.getDestination());
        assertEquals("03/02/99 7:50 pm", flight.getDepartureTime());
        assertEquals(100, flight.getCapacity());
        assertEquals(100, flight.getNumberOfSeatsLeft());
        assertEquals(1000, flight.getOriginalPrice(), 0);
        flight.bookASeat();
        assertEquals(99, flight.getNumberOfSeatsLeft());
    }

    @org.junit.Test
    public void testInvalidConstructor() {
        Flight flight = new Flight(1030, "Toronto", "Toronto", "03/02/99 7:50 pm", 100, 1000);
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @org.junit.Test
    public void testBookASeat() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.bookASeat();
        assertEquals(99, flight.getNumberOfSeatsLeft());
    }

    /**
     * Test of toString method, of class Flight.
     */
    @org.junit.Test
    public void testToString() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals("FLIGHT #1030, FROM 'Toronto', TO 'Kolkata', DEPARTING ON 03/02/99 7:50 pm', CAPACITY 100, SEATS REMAINING 100, ORIGINAL PRICE $1000.0", flight.toString());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @org.junit.Test
    public void testGetDestination() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals("Kolkata", flight.getDestination());
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @org.junit.Test
    public void testGetFlightNumber() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals(1030, flight.getFlightNumber());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @org.junit.Test
    public void testGetOrigin() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals("Toronto", flight.getOrigin());
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @org.junit.Test
    public void testGetOriginalPrice() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals(1000, flight.getOriginalPrice(), 0);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @org.junit.Test
    public void testGetCapacity() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals(100, flight.getCapacity());

    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @org.junit.Test
    public void testGetNumberOfSeatsLeft() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals(100, flight.getNumberOfSeatsLeft());
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @org.junit.Test
    public void testGetDepartureTime() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        assertEquals("03/02/99 7:50 pm", flight.getDepartureTime());
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @org.junit.Test
    public void testSetOriginalPrice() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.setOriginalPrice(950);
        assertEquals(950, flight.getOriginalPrice(), 0);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @org.junit.Test
    public void testSetOrigin() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.setOrigin("Ottawa");
        assertEquals("Ottawa", flight.getOrigin());
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @org.junit.Test
    public void testSetNumberOfSeatsLeft() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.setNumberOfSeatsLeft(150);
        assertEquals(150, flight.getNumberOfSeatsLeft());
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @org.junit.Test
    public void testSetFlightNumber() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.setFlightNumber(1000);
        assertEquals(1000, flight.getFlightNumber());
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @org.junit.Test
    public void testSetDestination() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.setDestination("Montreal");
        assertEquals("Montreal", flight.getDestination());
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @org.junit.Test
    public void testSetDepartureTime() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.setDepartureTime("03/02/99 8:00 pm");
        assertEquals("03/02/99 8:00 pm", flight.getDepartureTime());
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @org.junit.Test
    public void testSetCapacity() {
        Flight flight = new Flight(1030, "Toronto", "Kolkata", "03/02/99 7:50 pm", 100, 1000);
        flight.setCapacity(110);
        assertEquals(110, flight.getCapacity());
    }

}
