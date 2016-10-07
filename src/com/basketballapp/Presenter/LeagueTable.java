package com.basketballapp.Presenter;

import com.basketballapp.Entity.League;
import com.basketballapp.Entity.Team;

import java.util.ArrayList;

/**
 * Created by plare on 10/3/2016.
 */
public class LeagueTable {

    private League league;

    public LeagueTable(League league) {
        this.league = league;
    }

    public LeagueTable() {

    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void startSeason() {

        int index = 1;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("| No ");
        stringBuilder.append("| Team ");
        stringBuilder.append("| Wins ");
        stringBuilder.append("| Loses ");
        stringBuilder.append("| Percentage |");

        ArrayList<Team> teams = this.league.sortTeamsByWinningPercentage();

        for (Team team : teams) {
            stringBuilder.append('\n');
            stringBuilder.append("| " + index++);
            stringBuilder.append(" | " + team.getName());
            stringBuilder.append("| " + team.getNumberOfWins());
            stringBuilder.append("| " + team.getNumberOfLoses());
            stringBuilder.append("| " + team.getWinningPercentage() + "%");
        }

        System.out.println(stringBuilder.toString());
        
    }
}
