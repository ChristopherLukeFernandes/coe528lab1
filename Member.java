package coe528.lab1;

public class Member extends Passenger {

    private int yearsOfMembership;

    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        setYearsOfMembership(yearsOfMembership);
    }

    @Override
    protected double applyDiscount(double p) {
        if (getYearsOfMembership() > 5) {
            return p * 0.5;
        }
        if (getYearsOfMembership() > 1 && getYearsOfMembership() < 5) {
            return p * 0.9;
        }
        return p;
    }

    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }
}
