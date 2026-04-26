import java.util.ArrayList;
import java.util.List;

class Library {
    private String name;
    private String address;
    private int foundedYear;
    private List<Department> departments;

    public Library(String name, String address, int foundedYear) {
        this.name = name;
        this.address = address;
        this.foundedYear = foundedYear;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void removeDepartment(Department dept) {
        departments.remove(dept);
    }

    public void addBookToDepartment(Book book, Department dept) {
        dept.addBook(book);
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Бібліотека: ").append(name)
                .append("\nАдреса: ").append(address)
                .append("\nРік заснування: ").append(foundedYear)
                .append("\n\n");

        for (Department dept : departments) {
            sb.append(dept.getInfo()).append("\n");
        }

        return sb.toString();
    }
}