package pl.shonsu.patterns.behavioral.visitor;

public interface Visitor {
    String visitSchool(School school);
    String visitMuseum(Museum museum);
    String visitHospital(Hospital hospital);
}
