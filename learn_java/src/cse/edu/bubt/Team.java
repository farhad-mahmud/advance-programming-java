package cse.edu.bubt ;
import java.util.*;


class Player {
    private String name;
    private String type;

    public Player(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return String.format("%-12s (%s)", name, type);
    }

}

public class Team {

    private static final String[] national_players = {
            "Nasir", "Shakib", "Tamim", "Mashrafe", "Mushfiq",
            "Liton", "Mehidy", "Taskin", "Sabbir", "Soumya"
    };

    private static final String[] foreign_players = {
            "Smith", "Warner", "Root", "Stokes", "Bumrah",
            "Kohli", "Rohit", "Afridi", "Babar", "Williamson",
            "Maxwell", "Rashid", "de Kock", "Miller", "Starc"
    };

    private List<List<Player>> teams;

    public Team() {

        List<String> national_list = new ArrayList<>(Arrays.asList(national_players));
        List<String> foreign_list = new ArrayList<>(Arrays.asList(foreign_players));

        Collections.shuffle(national_list);
        Collections.shuffle(foreign_list);

        teams = new ArrayList<>();

        int ni = 0;
        int fi = 0;


        for (int t = 0; t < 5; t++) {
            List<Player> team = new ArrayList<>();

            for (int i = 0; i < 2; i++) {
                team.add(new Player(national_list.get(ni++), "National"));
            }

            for (int i = 0; i < 3; i++) {
                team.add(new Player(foreign_list.get(fi++), "Foreign"));
            }
            teams.add(team);
        }
    }

    public void printTeams() {
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("\nTeam " + (i + 1) + ":");
            for (Player player : teams.get(i)) {
                System.out.println(player.toString());
            }
        }
    }

    public static void main(String[] args) {
        new Team().printTeams();
    }
}
