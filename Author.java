import java.time.LocalDate;

class Author {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Author(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getInfo() {
        return "Автор: " + getFullName() + ", Дата народження: " + birthDate;
    }
}