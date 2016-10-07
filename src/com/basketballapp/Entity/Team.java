package com.basketballapp.Entity;

/**
 * Created by plare on 10/3/2016.
 */
public class Team {
    private String name;
    private int numberOfWins;
    private int numberOfLoses;

    public Team() {
    }

    public Team(String name, int numberOfWins, int numberOfLoses) {
        this.name = name;
        this.numberOfWins = numberOfWins;
        this.numberOfLoses = numberOfLoses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfWins() {
        return this.numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfLoses() {
        return this.numberOfLoses;
    }

    public void setNumberOfLoses(int numberOfLoses) {
        this.numberOfLoses = numberOfLoses;
    }

    public double getWinningPercentage() {

        double totalGames = this.getNumberOfWins() + this.getNumberOfLoses();
        double percentage = (this.getNumberOfWins() / totalGames) * 100;
        return (double) Math.round(percentage * 100.0) / 100.0;
    }

    public void wonTheGame() {
        this.setNumberOfWins(this.getNumberOfWins() + 1);
    }

    public void lostTheGame() {
        this.setNumberOfLoses(this.getNumberOfLoses() + 1);
    }

    public boolean equals(Object o) {
        if (o instanceof Team) {
            return ((Team) o).getName().equals(this.getName());
        }
        return false;
    }

    public String toString() {
        return "Team: " + this.name + " Wins: " + this.numberOfWins + " Loses: " + this.numberOfLoses;
    }
}
