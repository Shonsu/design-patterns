package pl.shonsu.patterns.behavioral.visitor;

public class HealthAndSafetyInspector implements Visitor{
    @Override
    public String visitSchool(School school) {
        return "Unannounced visit Health And Safety Inspector in " + school.getSchoolName() + " with concrete procedure for schools";
    }
    @Override
    public String visitMuseum(Museum museum) {
        return "Unannounced visit Health And Safety Inspector in " + museum.getMuseumName() + " with concrete procedure for museums";
    }

    @Override
    public String visitHospital(Hospital hospital) {
        return "Unannounced visit Health And Safety Inspector in " + hospital.getHospitalName() + " with concrete procedure for hospitals";
    }
}
