package br.com.froza.screenmatch.models;

public class Serie extends br.com.froza.screenmatch.models.Title {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;
    private double duracaoEmMinutos;

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // mesmo nome, mas se comporta de forma diferente de acordo com a necessidade
    @Override
    public int getDurationInMinutes() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
