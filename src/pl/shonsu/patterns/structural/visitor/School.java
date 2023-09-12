package pl.shonsu.patterns.structural.visitor;

public class School implements Building {
    private final String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitSchool(this);
    }
}
