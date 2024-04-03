package immutable.domain;

public class ImmutablePerson {
    private final int id;

    private final String name;

    private final MutableDateOfBirth dateOfBirth;

    public ImmutablePerson(int id, String name, MutableDateOfBirth dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MutableDateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Immutable person: id = " + id +
                ", name = " + name +
                ", birthday = " + dateOfBirth;
    }
}
