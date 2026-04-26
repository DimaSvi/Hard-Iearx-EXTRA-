class DVD extends Book {
    private String format;

    public DVD(String title, int year, Author author, String format) {
        super(title, year, author);
        this.format = format;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Формат: " + format;
    }
}