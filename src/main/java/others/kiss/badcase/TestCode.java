package others.kiss.badcase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestCode {

    public static void main(String[] args) {
        Map<String, Double> players = initPlayers();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/opt/java/ctg-meetup/src/main/java/others/kiss/results-win.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                String [] playerSplit = null;
                String player = null;
                Double value = null;
                if (line != null && line.contains("win")) {
                    playerSplit = line.split(":");
                    value = Double.valueOf(playerSplit[1]);
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("win") - 1);
                    players.put(player, players.get(player) + value);
                } else if (line != null && line.contains("loss")) {
                    playerSplit = line.split(":");
                    value = Double.valueOf(playerSplit[1]);
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("loss") - 1);
                    players.put(player, players.get(player) - value);
                } else if (line != null && line.contains("withdraw")) {
                    playerSplit = line.split(":");
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("withdraw") - 1);
                    players.put(player, 0.0);
                } else if (line != null && line.contains("back")) {
                    playerSplit = line.split(":");
                    value = Double.valueOf(playerSplit[1]);
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("back") - 1);
                    players.put(player, value);
                } else if (line != null && line.contains("new")) {
                    playerSplit = line.split(":");
                    value = Double.valueOf(playerSplit[1]);
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("new") - 1);
                    players.put(player, value);
                } else if (line != null && line.contains("tie")) {
                    playerSplit = line.split(":");
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("tie") - 1);
                    players.put(player, players.get(player));
                } else if (line != null && line.contains("leave")) {
                    playerSplit = line.split(":");
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("leave") - 1);
                    players.put(player, players.get(player));
                } else if (line != null && line.contains("partial")) {
                    playerSplit = line.split(":");
                    value = Double.valueOf(playerSplit[1]);
                    player = playerSplit[0].substring(0, playerSplit[0].indexOf("partial") - 1);
                    players.put(player,  (players.get(player) + (value* 0.6)));
                }
            }
            reader.close();

            players.forEach((k,v)->System.out.println("Player : " + k + " Total : " + v));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Double> initPlayers(){
        Map<String, Double> players = new HashMap<>();
        for (int i = 1; i < 11 ; i++) {
            players.put("Player"+i, 0.0);
        }
        return players;
    }
}
