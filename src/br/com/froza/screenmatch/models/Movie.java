package br.com.froza.screenmatch.models;

import br.com.froza.screenmatch.calculo.Classifiable;

public class Movie extends  br.com.froza.screenmatch.models.Title implements Classifiable {
    private String diretor;

    // constructor
    public Movie(String nome) {
        this.setName(nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int) getRating()/2;
    }

    @Override
    public String toString() {
        return "Movie: " + getName() + " (" + getLaunchYear() + ")";
    }
}
