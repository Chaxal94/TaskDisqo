public class Cartoon  extends  Movie{
    public Cartoon(String title, int ratings) {
        super(title, ratings);
    }

    @Override
    public void setRatings(int ratings) {
        super.setRatings(ratings);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }


    @Override
    public int getRatings() {
        return super.getRatings();
    }



    @Override
    public String toString() {
        return "Cartoon["+
                "Title =" + super.getTitle() +
                ", Rating =" + super.getRatings() +
                ']';
    }
}
