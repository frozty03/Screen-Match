import br.com.froza.screenmatch.calculo.TimeCalculator;
import br.com.froza.screenmatch.models.Movie;
import br.com.froza.screenmatch.models.Serie;

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

        Serie serie1 = new Serie();
        serie1.setName("Serie 1");
        serie1.setEpisodiosPorTemporada(12);
        serie1.setTemporadas(2);
        serie1.setMinutosPorEpisodio(40);
        System.out.println(serie1.getEpisodiosPorTemporada());

        TimeCalculator calc = new TimeCalculator();
        calc.include(serie1);
        calc.include(myMovie);
        System.out.println(calc.getTotalTime());
    }
}