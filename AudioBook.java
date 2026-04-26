class AudioBook extends Book {
    private int duration; // хвилини

    public AudioBook(String title, int year, Author author, int duration) {
        super(title, year, author);
        this.duration = duration;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Тривалість: " + duration + " хв";
    }
}