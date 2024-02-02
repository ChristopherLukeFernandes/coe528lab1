package coe528.lab1;

public class NonMember extends Passenger {

    public NonMember(String name, int age) {
        super(name, age);
    }

    @Override
    protected double applyDiscount(double p) {
        if (getAge() > 65) {
            return p * 0.9;
        }
        return p;
    }
}
