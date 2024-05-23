package Lap06.exs102;

public class Staff extends Person {
    protected String school;
    protected double pay;

    public Staff(String name, String address,String school, double pay) {
        super();
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
