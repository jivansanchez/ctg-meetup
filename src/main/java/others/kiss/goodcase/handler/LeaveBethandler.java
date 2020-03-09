package others.kiss.goodcase.handler;

import java.util.Map;

public class LeaveBethandler implements BetHandler {

    @Override
    public void processBetResult(Map<String, Double> players, String line) {
        String [] playerSplit = null;
        String player = null;
        playerSplit = line.split(":");
        player = playerSplit[0].substring(0, playerSplit[0].indexOf("leave") - 1);
        players.put(player, players.get(player));
    }
}
