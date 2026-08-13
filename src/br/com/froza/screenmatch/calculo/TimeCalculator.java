package br.com.froza.screenmatch.calculo;

import br.com.froza.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include (Title title) {
        totalTime += title.getDurationInMinutes();
    }
}
