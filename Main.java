import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Тарас", "Шевченко", LocalDate.of(1814, 3, 9));

        Book book1 = new Book("Кобзар", 1840, author1);
        book1.addRating(5, "Шедевр");
        book1.addRating(4, "Дуже добре");

        AudioBook audio = new AudioBook("Кобзар аудіо", 2020, author1, 120);

        Department dept = new Department("Література");
        dept.addBook(book1);
        dept.addBook(audio);

        Library lib = new Library("Бібліотека", "Київ", 1950);
        lib.addDepartment(dept);

        Reader student = new Student("Іван");
        Reader guest = new Guest("Петро");

        System.out.println(lib.getInfo());

        System.out.println("👤 Читачі:");
        System.out.println(student.getInfo());
        System.out.println(guest.getInfo());
    }
}