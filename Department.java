import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Book> books;

    public Department(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder("Відділ: " + name + "\n");

        for (Book book : books) {
            sb.append("  - ").append(book.getInfo()).append("\n");
        }

        return sb.toString();
    }
}