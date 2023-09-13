package pl.shonsu.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        HealthAndSafetyInspector inspector = new HealthAndSafetyInspector();
        List<Building> buildingsToVisit = new ArrayList<>();

        buildingsToVisit.add(new Hospital("Children's Memorial Health Institute"));
        buildingsToVisit.add(new School("Warsaw University of Technology"));
        buildingsToVisit.add(new Museum("Children's Memorial Health Institute"));

        StringBuilder sb = new StringBuilder();
        sb.append("Raport");
        sb.append(System.lineSeparator());
        for (Building building : buildingsToVisit) {
            sb.append(building.accept(inspector));
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
    }

}
