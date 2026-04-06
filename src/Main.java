import br.com.froza.screenmatch.models.Movie;

public class Main {
    static void main() {
        Movie myMovie = new Movie();
        myMovie.setName("Spider-Man");
        myMovie.setDurationInMinutes(150);
        myMovie.setLaunchYear(2018);
        myMovie.setIncludedInSubscription(true);

        myMovie.rate(8);
        myMovie.rate(9);
        myMovie.rate(10);

        myMovie.showDetails();
        System.out.println();
    }
}