public class Movie implements Comparable <Movie>{
   private String title;
   private int rating;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setRatings(int ratings) {
        this.rating = rating;
    }

    public int getRatings() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie[" +
                "Title =" + title  +
                ", Rating =" + rating +
                ']';
    }

    @Override
    public int compareTo(Movie o) {

        return this.rating - o.rating;
    }
}
