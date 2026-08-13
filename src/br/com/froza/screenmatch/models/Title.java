package br.com.froza.screenmatch.models;

public class Title {
    private String name;
    private int launchYear;
    private boolean includedInSubscription;
    private double ratingSum; // private to the class, cannot be accessed out of the class
    private double rating;
    private int rates;
    private int durationInMinutes;

    public int getRates() {
        return rates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public void setIncludedInSubscription(boolean includedInSubscription) {
        this.includedInSubscription = includedInSubscription;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public boolean isIncludedInSubscription() {
        return includedInSubscription;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getRating() {
        return rating;
    }

    public void showDetails(){
        System.out.println("name: " + name);
        System.out.println("launch year: " + launchYear);
        System.out.println("included in subscription: " + includedInSubscription);
        System.out.println("rating: " + rating);
        System.out.println("rates: " + getRates());
        System.out.println("duration in minutes: " + durationInMinutes);
    }

    public void rate(double score){
        ratingSum += score;
        rates++;
        rating = ratingSum/rates;
    }
}