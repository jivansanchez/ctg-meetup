package others.kiss.goodcase.handler;

import java.util.Map;

public class WinBethandler implements BetHandler {

    @Override
    public void processBetResult(Map<String, Double> players, String line) {
        String [] playerSplit = null;
        String player = null;
        Double value = null;
        playerSplit = line.split(":");
        value = Double.valueOf(playerSplit[1]);
        player = playerSplit[0].substring(0, playerSplit[0].indexOf("win") - 1);
        players.put(player, players.get(player) + value);
    }
}
