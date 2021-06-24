public class Movie implements Cinema{
    private String title;
    private int rating;
    public Movie(String title,int rating){
        this.title = title;
        this.rating = rating;
    }

    public void setRating(int rating) {
        this.rating =rating;
    }



    @Override
    public String toString() {
        return "Movie[" +
                "Title=" + title +
                ", Rating=" + rating +
                ']';
    }

    @Override
    public String getTitle() {
        return this.title;


    }

    @Override
    public int getRating() {
        return this.rating;

    }


}

