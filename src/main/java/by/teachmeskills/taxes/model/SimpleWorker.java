package by.teachmeskills.taxes.model;

public class SimpleWorker implements Worker {

    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final String region;


    public SimpleWorker(String firstName, String lastName, Gender gender, String region) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.region = region;
    }


    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    @Override
    public String region() {
        return region;
    }
}
