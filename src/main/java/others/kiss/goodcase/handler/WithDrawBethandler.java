package others.kiss.goodcase.handler;

import java.util.Map;

public class WithDrawBethandler implements BetHandler {

    @Override
    public void processBetResult(Map<String, Double> players, String line) {
        String [] playerSplit = null;
        String player = null;
        playerSplit = line.split(":");
        player = playerSplit[0].substring(0, playerSplit[0].indexOf("withdraw") - 1);
        players.put(player, 0.0);
    }
}
