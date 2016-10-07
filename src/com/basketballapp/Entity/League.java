package com.basketballapp.Entity;

import com.basketballapp.Exceptions.TeamNotValidException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by plare on 10/3/2016.
 */
public class League {

    private String leagueName;
    private ArrayList<Match> matches;
    private ArrayList<Team> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        matches = new ArrayList<>();
        teams = new ArrayList<>();
    }

    public League() {
        matches = new ArrayList<>();
        teams = new ArrayList<>();
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public boolean addTeam(Team team) {
        try {
            if (!teams.contains(team)) {
                this.checkIfTeamIsValid(team);
                teams.add(team);
            }
        } catch (TeamNotValidException e) {
            return false;
        }
        return true;
    }

    public void checkIfTeamIsValid(Team team) throws TeamNotValidException {
        if (team.getNumberOfWins() > 0 || team.getNumberOfLoses() > 0) {
            throw new TeamNotValidException("Number of wins and losses must be zero at the start of the season!");
        }
    }

    public boolean removeTeam(Team team) {
        return teams.remove(team);
    }

    private void generateMatches() {
        int count = 0;
        while(count < 2){
            this.generate();
            count++;
        }
    }

    private void generate(){
        for (int homeTeamIndex = 0; homeTeamIndex < teams.size(); homeTeamIndex++) {
            Team team = teams.get(homeTeamIndex);
            for (int awayTeamIndex = 0; awayTeamIndex < teams.size(); awayTeamIndex++) {
                if (homeTeamIndex != awayTeamIndex) {
                    Match match = new Match();
                    match.setHomeTeam(team);
                    match.setAwayTeam((teams.get(awayTeamIndex)));
                    matches.add(match);
                }
            }
        }
    }

    private void playAllMatches() {
        for (Match match : matches) {
            match.playMatch();
        }
    }

    public ArrayList<Team> sortTeamsByWinningPercentage() {

        this.generateMatches();
        this.playAllMatches();

        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                if (o1.getWinningPercentage() > o2.getWinningPercentage()) {
                    return -1;

                } else if (o2.getWinningPercentage() > o1.getWinningPercentage()) {
                    return 1;

                } else
                    return 0;
            }
        });
        return teams;
    }

    @Override
    public String toString() {
        return "League Name: " + this.getLeagueName() + " Number of teams: " + this.getTeams().size();
    }
}
