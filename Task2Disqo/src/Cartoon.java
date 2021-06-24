public class Cartoon implements Cinema {
    private String title;
    private int rating;
    public Cartoon(String title, int rating){
        this.title = title;
        this.rating = rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Carton[" +
                "Title=" + title +
                ", Rating=" + rating +
                ']';
    }

    @Override
    public String getTitle() {
        return this.title ;
    }

    @Override
    public int getRating() {
        return this.rating ;
    }




}
