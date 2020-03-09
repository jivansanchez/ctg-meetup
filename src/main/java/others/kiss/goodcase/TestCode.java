package others.kiss.goodcase;

import others.kiss.goodcase.handler.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestCode {

    public static void main(String[] args) {
        Map<String, Double> players = initPlayers();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/opt/java/ctg-meetup/src/main/java/others/kiss/results-win.txt"));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                if (line == null || line.contains("##")) {
                    continue;
                }
                BetHandler betHandler = getHandlerForBetResult(line);
                betHandler.processBetResult(players, line);
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

    public static BetHandler getHandlerForBetResult(String line) {
        String handlerFor = line.substring(line.indexOf("-") +1, line.indexOf(":"));
        Map<String, BetHandler> betHandlers = initHandlers();
        Optional<Map.Entry<String, BetHandler>> optionalBetHandler = betHandlers.entrySet().stream().filter(stringBetHandlerEntry
                -> stringBetHandlerEntry.getKey().equals(handlerFor)).findFirst();

        if (optionalBetHandler.isPresent()) {
            return optionalBetHandler.get().getValue();
        }

        return null;
    }

    public static Map<String, BetHandler> initHandlers(){
        Map<String, BetHandler> handlers = new HashMap<>();
        handlers.put("win", new WinBethandler());
        handlers.put("loss", new LossBethandler());
        handlers.put("withdraw", new WithDrawBethandler());
        handlers.put("back", new BackBethandler());
        handlers.put("new", new NewBethandler());
        handlers.put("tie", new TieBethandler());
        handlers.put("leave", new LeaveBethandler());
        handlers.put("partial", new PartialBethandler());

        return handlers;
    }

}
