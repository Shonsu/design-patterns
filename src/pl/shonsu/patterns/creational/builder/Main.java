package pl.shonsu.patterns.creational.builder;

class Main {
    public static void main(String[] args) {

        PersonalInformation pi = PersonalInformation.builder()
                .firstname("Shonsu")
                .lastName("Kowalski")
                .city("Warsaw")
                .build();
        System.out.println(pi);

    }
}
