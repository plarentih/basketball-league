package com.basketballapp.Entity;

/**
 * Created by plare on 10/3/2016.
 */
public class Match {

    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;

    public Match() {}

    public Match(Team homeTeam, Team awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void playMatch() {

        homeScore = (int) Math.round(Math.random() * 100);
        awayScore = (int) Math.round(Math.random() * 100);

        if (homeScore > awayScore) {
            this.getHomeTeam().wonTheGame();
            this.getAwayTeam().lostTheGame();

        } else if (awayScore > homeScore) {
            this.getHomeTeam().lostTheGame();
            this.getAwayTeam().wonTheGame();

        } else {
            this.playMatch();
        }
    }

    public boolean equals(Object o) {
        if (o instanceof Match) {
            return ((Match) o).getHomeTeam().equals(this.getHomeTeam()) && ((Match) o).getAwayTeam().equals(this.getAwayTeam()) ?
                    true : false;
        }
        return false;
    }

    public String toString() {
        return getHomeTeam().getName() + " " + this.homeScore + " vs " + this.awayScore + " " + getAwayTeam().getName() ;
    }
}
