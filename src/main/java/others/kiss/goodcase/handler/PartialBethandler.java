package others.kiss.goodcase.handler;

import java.util.Map;

public class PartialBethandler implements BetHandler {

    @Override
    public void processBetResult(Map<String, Double> players, String line) {
        String [] playerSplit = null;
        String player = null;
        playerSplit = line.split(":");
        Double value = null;
        value = Double.valueOf(playerSplit[1]);
        player = playerSplit[0].substring(0, playerSplit[0].indexOf("partial") - 1);
        players.put(player,  (players.get(player) + (value* 0.6)));
    }
}
