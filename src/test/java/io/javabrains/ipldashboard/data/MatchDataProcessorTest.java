package io.javabrains.ipldashboard.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.javabrains.ipldashboard.model.Match;
import org.junit.jupiter.api.Test;

class MatchDataProcessorTest {
    @Test
    void testProcess() throws Exception {
        MatchDataProcessor matchDataProcessor = new MatchDataProcessor();

        MatchInput matchInput = new MatchInput();
        matchInput.setTeam1("Team1");
        matchInput.setTeam2("Team2");
        matchInput.setUmpire2("Umpire2");
        matchInput.setUmpire1("Umpire1");
        matchInput.setToss_winner("Toss winner");
        matchInput.setNeutral_venue("Neutral venue");
        matchInput.setToss_decision("Toss decision");
        matchInput.setVenue("Venue");
        matchInput.setResult_margin("Result margin");
        matchInput.setEliminator("Eliminator");
        matchInput.setId("42");
        matchInput.setPlayer_of_match("Player of match");
        matchInput.setCity("Oxford");
        matchInput.setWinner("Winner");
        matchInput.setMethod("Method");
        matchInput.setResult("Result");
        matchInput.setDate("2020-03-01");
        Match actualProcessResult = matchDataProcessor.process(matchInput);
        assertEquals("Oxford", actualProcessResult.getCity());
        assertEquals("Venue", actualProcessResult.getVenue());
        assertEquals("Umpire2", actualProcessResult.getUmpire2());
        assertEquals("Umpire1", actualProcessResult.getUmpire1());
        assertEquals("Toss winner", actualProcessResult.getTossWinner());
        assertEquals("Toss decision", actualProcessResult.getTossDecision());
        assertEquals("Toss winner", actualProcessResult.getTeam2());
        assertEquals("Team1", actualProcessResult.getTeam1());
        assertEquals("Result margin", actualProcessResult.getResultMargin());
        assertEquals("Result", actualProcessResult.getResult());
        assertEquals("Player of match", actualProcessResult.getPlayerOfMatch());
        assertEquals("Winner", actualProcessResult.getMatchWinner());
        assertEquals(42L, actualProcessResult.getId());
        assertEquals("2020-03-01", actualProcessResult.getDate().toString());
    }

    @Test
    void testProcess2() throws Exception {
        MatchDataProcessor matchDataProcessor = new MatchDataProcessor();

        MatchInput matchInput = new MatchInput();
        matchInput.setTeam1("Toss winner");
        matchInput.setTeam2("Team2");
        matchInput.setUmpire2("Umpire2");
        matchInput.setUmpire1("Umpire1");
        matchInput.setToss_winner("Toss winner");
        matchInput.setNeutral_venue("Neutral venue");
        matchInput.setToss_decision("Toss decision");
        matchInput.setVenue("Venue");
        matchInput.setResult_margin("Result margin");
        matchInput.setEliminator("Eliminator");
        matchInput.setId("42");
        matchInput.setPlayer_of_match("Player of match");
        matchInput.setCity("Oxford");
        matchInput.setWinner("Winner");
        matchInput.setMethod("Method");
        matchInput.setResult("Result");
        matchInput.setDate("2020-03-01");
        Match actualProcessResult = matchDataProcessor.process(matchInput);
        assertEquals("Oxford", actualProcessResult.getCity());
        assertEquals("Venue", actualProcessResult.getVenue());
        assertEquals("Umpire2", actualProcessResult.getUmpire2());
        assertEquals("Umpire1", actualProcessResult.getUmpire1());
        assertEquals("Toss winner", actualProcessResult.getTossWinner());
        assertEquals("Toss decision", actualProcessResult.getTossDecision());
        assertEquals("Toss winner", actualProcessResult.getTeam2());
        assertEquals("Team2", actualProcessResult.getTeam1());
        assertEquals("Result margin", actualProcessResult.getResultMargin());
        assertEquals("Result", actualProcessResult.getResult());
        assertEquals("Player of match", actualProcessResult.getPlayerOfMatch());
        assertEquals("Winner", actualProcessResult.getMatchWinner());
        assertEquals(42L, actualProcessResult.getId());
        assertEquals("2020-03-01", actualProcessResult.getDate().toString());
    }

    @Test
    void testProcess3() throws Exception {
        MatchDataProcessor matchDataProcessor = new MatchDataProcessor();

        MatchInput matchInput = new MatchInput();
        matchInput.setTeam1("Team1");
        matchInput.setTeam2("Team2");
        matchInput.setUmpire2("Umpire2");
        matchInput.setUmpire1("Umpire1");
        matchInput.setToss_winner("Toss winner");
        matchInput.setNeutral_venue("Neutral venue");
        matchInput.setToss_decision("bat");
        matchInput.setVenue("Venue");
        matchInput.setResult_margin("Result margin");
        matchInput.setEliminator("Eliminator");
        matchInput.setId("42");
        matchInput.setPlayer_of_match("Player of match");
        matchInput.setCity("Oxford");
        matchInput.setWinner("Winner");
        matchInput.setMethod("Method");
        matchInput.setResult("Result");
        matchInput.setDate("2020-03-01");
        Match actualProcessResult = matchDataProcessor.process(matchInput);
        assertEquals("Oxford", actualProcessResult.getCity());
        assertEquals("Venue", actualProcessResult.getVenue());
        assertEquals("Umpire2", actualProcessResult.getUmpire2());
        assertEquals("Umpire1", actualProcessResult.getUmpire1());
        assertEquals("Toss winner", actualProcessResult.getTossWinner());
        assertEquals("bat", actualProcessResult.getTossDecision());
        assertEquals("Team1", actualProcessResult.getTeam2());
        assertEquals("Toss winner", actualProcessResult.getTeam1());
        assertEquals("Result margin", actualProcessResult.getResultMargin());
        assertEquals("Result", actualProcessResult.getResult());
        assertEquals("Player of match", actualProcessResult.getPlayerOfMatch());
        assertEquals("Winner", actualProcessResult.getMatchWinner());
        assertEquals(42L, actualProcessResult.getId());
        assertEquals("2020-03-01", actualProcessResult.getDate().toString());
    }
}

