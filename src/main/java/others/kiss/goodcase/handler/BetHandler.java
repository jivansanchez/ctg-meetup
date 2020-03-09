package others.kiss.goodcase.handler;

import java.util.Map;

/**
 *
 */
public interface BetHandler {

    /**
     *
     * @param players
     * @param line
     */
    void processBetResult(Map<String, Double> players, String line);
}
