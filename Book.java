class Book {
    private String title;
    private int year;
    private Author author;
    private Rating rating = new Rating(); // 🔥 нове

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public void addRating(int score, String review) {
        rating.addReview(score, review);
    }

    public String getInfo() {
        return "Книга: " + title +
                ", Рік: " + year +
                ", Автор: " + author.getFullName() +
                ", Рейтинг: " + rating.getAverage();
    }
}