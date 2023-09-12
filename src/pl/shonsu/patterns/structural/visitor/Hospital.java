package pl.shonsu.patterns.structural.visitor;

public class Hospital implements Building {
    private final String hospitalName;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitHospital(this);
    }
}
