import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cinema> cinemas = new ArrayList<>();
        String[] titleMovie = new String[]{"Spider Man", "Venom", "Hulk", "Parallel Worlds", "Dumb and Dumber"};
        for (int i = 0; i < 5; i++) {
            int rating = (int) ((Math.random() * 10) + 1);
            String title = titleMovie[i];
            Movie movie = new Movie(title, rating);
            cinemas.add(movie);
        }

        String[] titleCartoon = new String[]{"Chip and Dall", "Ferdinand", "Tom and Jerry", "Frozen", "Donald Dak", "Just you wait"};
        for (int j = 0; j < 6; j++) {
            int rating = (int) ((Math.random() * 10) + 1);
            String title = titleCartoon[j];
            Cartoon cartons = new Cartoon(title, rating);
            cinemas.add(cartons);

        }
        for (int i = 0;i< cinemas.size();i++)
            System.out.println(cinemas.get(i));
        System.out.println(" ");
        System.out.println(" ");


        cinemas.sort(((o1, o2) -> o2.getRating() - o1.getRating()));

        for (int i = 0;i< cinemas.size();i++) {
            System.out.println(cinemas.get(i));
        }
        System.out.println();
        System.out.println("Higher rated movie" );
        System.out.println();

        for (int i = 0;i< cinemas.size();i++)
            if(!(cinemas.get(i) instanceof Cartoon)){   //Exclude cartoons!!!!!
                System.out.println(cinemas.get(i));
                break;

            }

        }
    }



































































