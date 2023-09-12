package pl.shonsu.patterns.structural.visitor;

public interface Visitor {
    String visitSchool(School school);
    String visitMuseum(Museum museum);
    String visitHospital(Hospital hospital);
}
