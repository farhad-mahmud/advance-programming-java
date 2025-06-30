package cse.edu.bubt;
import java.util.*;

class Player {
    String name;
    String nationality;

    public Player(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return name + " (" + nationality + ")";
    }
}

class Team {
    String teamName;
    List<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void displayTeam() {
        System.out.println(teamName);
        for (Player p : players) {
            System.out.println(" - " + p);
        }
        System.out.println();
    }
}

public class BPLTeamBuilder {
    public static void main(String[] args) {
        List<Player> bangladeshiPlayers = new ArrayList<>();
        List<Player> foreignPlayers = new ArrayList<>();

        bangladeshiPlayers.add(new Player("Shakib Al Hasan", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Tamim Iqbal", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Mushfiqur Rahim", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Mustafizur Rahman", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Liton Das", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Taskin Ahmed", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Mehidy Hasan", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Afif Hossain", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Nasum Ahmed", "Bangladesh"));
        bangladeshiPlayers.add(new Player("Mahmudullah", "Bangladesh"));


        foreignPlayers.add(new Player("Chris Gayle", "West Indies"));
        foreignPlayers.add(new Player("AB de Villiers", "South Africa"));
        foreignPlayers.add(new Player("Steve Smith", "Australia"));
        foreignPlayers.add(new Player("Kieron Pollard", "West Indies"));
        foreignPlayers.add(new Player("Rashid Khan", "Afghanistan"));
        foreignPlayers.add(new Player("David Warner", "Australia"));
        foreignPlayers.add(new Player("Faf du Plessis", "South Africa"));
        foreignPlayers.add(new Player("Babar Azam", "Pakistan"));
        foreignPlayers.add(new Player("Andre Russell", "West Indies"));
        foreignPlayers.add(new Player("Kane Williamson", "New Zealand"));
        foreignPlayers.add(new Player("Mohammad Nabi", "Afghanistan"));
        foreignPlayers.add(new Player("Ben Stokes", "England"));
        foreignPlayers.add(new Player("Glenn Maxwell", "Australia"));
        foreignPlayers.add(new Player("Jos Buttler", "England"));
        foreignPlayers.add(new Player("Trent Boult", "New Zealand"));



        List<Team> teams = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            Collections.shuffle(bangladeshiPlayers);
            Collections.shuffle(foreignPlayers);

            Team team = new Team("Team " + (i+1)); // object of Team class

            for (int j = 0; j < 2; j++) {
                team.addPlayer(bangladeshiPlayers.removeFirst());
            }


            for (int j = 0; j < 3; j++) {
                team.addPlayer(foreignPlayers.removeFirst());
            }

            teams.add(team);
        }


        for (Team team : teams) {
            team.displayTeam();
        }
    }
}
