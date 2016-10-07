package com.basketballapp;

import com.basketballapp.Entity.League;
import com.basketballapp.Entity.Team;
import com.basketballapp.Presenter.LeagueTable;

public class Main {

    public static void main(String[] args) {

        LeagueTable leagueTable = new LeagueTable();
        League league = new League();
        league.setLeagueName("             NBA League");

        System.out.println(league.getLeagueName());

        String[] teams = {"Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Bobcats", "Chicago Bulls",
                "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets", "Detroit Pistons", "Golden State Warriors",
                "Houston Rockets", "Indiana Pacers", "LA Clippers", "LA Lakers", "Memphis Grizzlies",
                "Miami Heat", "Milwaukee Bucks", "Minnesota Timberwolves", "New Orleans Hornets", "New York Knicks",
                "Oklahoma City Thunder", "Orlando Magic", "Philadelphia Sixers", "Phoenix Suns", "Portland Trail Blazers",
                "Sacramento Kings", "San Antonio Spurs", "Toronto Raptors", "Utah Jazz", "Washington Wizards"};

        for(String team : teams){
            league.addTeam(new Team(team, 0, 0));
        }

        leagueTable.setLeague(league);
        leagueTable.startSeason();
    }
}
