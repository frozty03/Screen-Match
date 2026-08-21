import br.com.froza.screenmatch.calculo.FiltroRecomendacao;
import br.com.froza.screenmatch.calculo.TimeCalculator;
import br.com.froza.screenmatch.models.Movie;
import br.com.froza.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    static void main() {
        Movie myMovie = new Movie("Spider-Man");
//        myMovie.setName("Spider-Man");
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
        serie1.setVisualizacoes(120);
        System.out.println(serie1.getEpisodiosPorTemporada());

        TimeCalculator calc = new TimeCalculator();
        calc.include(serie1);
        calc.include(myMovie);
        System.out.println(calc.getTotalTime());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(myMovie);
        filtro.filtro(serie1);

        var newMovie = new Movie("Iron man");
//        newMovie.setName("Iron man");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(myMovie);
        movies.add(newMovie);

        System.out.println(movies.size());
        System.out.println(movies.getFirst().getName());
        System.out.println(movies.get(1).getName());

        // toString override
        System.out.println(movies);
        System.out.println(movies.getFirst().toString());
    }
}