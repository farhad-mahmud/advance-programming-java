package cse.edu.bubt;

import java.util.*;

class Player {

    private String name;
    private String country;
    private String player_no;

    public Player(String in_name, String in_country, String in_player_no) {
        name = in_name;
        country = in_country;
        player_no = in_player_no;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getPlayer_no() {
        return player_no;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer(name + " " + country + " " + player_no);
        buffer.setLength(16);
        return buffer.toString();
    }
}

public class Players {

    private static final String names[] = {
            "Shamim", "Farhad", "Dipu", "Ratul", "Rahim", "Karim", "rafik", "jabbar", "salam", "barkat",
            "rixon", "aliur", "kowhsik", "shopnil", "mahim", "mahadi", "joy", "kalam", "solim", "bijoy"
    };

    private static final String countries[] = {
            "Spain", "Japan", "Canada", "Bangladesh", "usa", "finland"
    };

    private static final String player_noo[] = {
            "5", "6", "8", "9"
    };

    private List<Player> list;



    public Players() {
        Player[] player = new Player[20];
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            String name = names[i];
            String country = countries[rand.nextInt(countries.length)];
            String playerNo = player_noo[rand.nextInt(player_noo.length)];

            player[i] = new Player(name, country, playerNo);

        }

        list = Arrays.asList(player);

        Collections.shuffle(list);
    }

    //Collections.shuffle(list);

    public void printPlayers() {
        int half = list.size() / 2;

        for (int i = 0, j = half; i < half; i++, j++) {
            System.out.println(list.get(i).toString());
            System.out.println(list.get(j).toString());
        }
    }



    public static void main(String[] args) {
        new Players().printPlayers();
    }
}
