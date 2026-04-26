abstract class Reader {
    protected String name;

    public Reader(String name) {
        this.name = name;
    }

    public abstract int getMaxBooks();
    public abstract int getBorrowDays();

    public String getInfo() {
        return name + " (може взяти " + getMaxBooks() +
                " книг на " + getBorrowDays() + " днів)";
    }
}