class EBook extends Book {
    private String fileFormat;
    private double fileSize;

    public EBook(String title, int year, Author author, String fileFormat, double fileSize) {
        super(title, year, author);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", Формат: " + fileFormat +
                ", Розмір: " + fileSize + "MB";
    }
}