import java.util.*;

class Rating {
    private List<Integer> scores = new ArrayList<>();
    private List<String> reviews = new ArrayList<>();

    public void addReview(int score, String review) {
        scores.add(score);
        reviews.add(review);
    }

    public double getAverage() {
        if (scores.isEmpty()) return 0;

        int sum = 0;
        for (int s : scores) sum += s;

        return (double) sum / scores.size();
    }

    public String getReviews() {
        return reviews.toString();
    }
}