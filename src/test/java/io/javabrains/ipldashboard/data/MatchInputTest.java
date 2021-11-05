package io.javabrains.ipldashboard.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MatchInputTest {
    @Test
    void testConstructor() {
        MatchInput actualMatchInput = new MatchInput();
        actualMatchInput.setCity("Oxford");
        actualMatchInput.setDate("2020-03-01");
        actualMatchInput.setEliminator("Eliminator");
        actualMatchInput.setId("42");
        actualMatchInput.setMethod("Method");
        actualMatchInput.setNeutral_venue("Neutral venue");
        actualMatchInput.setPlayer_of_match("Player of match");
        actualMatchInput.setResult("Result");
        actualMatchInput.setResult_margin("Result margin");
        actualMatchInput.setTeam1("Team1");
        actualMatchInput.setTeam2("Team2");
        actualMatchInput.setToss_decision("Toss decision");
        actualMatchInput.setToss_winner("Toss winner");
        actualMatchInput.setUmpire1("Umpire1");
        actualMatchInput.setUmpire2("Umpire2");
        actualMatchInput.setVenue("Venue");
        actualMatchInput.setWinner("Winner");
        assertEquals("Oxford", actualMatchInput.getCity());
        assertEquals("2020-03-01", actualMatchInput.getDate());
        assertEquals("Eliminator", actualMatchInput.getEliminator());
        assertEquals("42", actualMatchInput.getId());
        assertEquals("Method", actualMatchInput.getMethod());
        assertEquals("Neutral venue", actualMatchInput.getNeutral_venue());
        assertEquals("Player of match", actualMatchInput.getPlayer_of_match());
        assertEquals("Result", actualMatchInput.getResult());
        assertEquals("Result margin", actualMatchInput.getResult_margin());
        assertEquals("Team1", actualMatchInput.getTeam1());
        assertEquals("Team2", actualMatchInput.getTeam2());
        assertEquals("Toss decision", actualMatchInput.getToss_decision());
        assertEquals("Toss winner", actualMatchInput.getToss_winner());
        assertEquals("Umpire1", actualMatchInput.getUmpire1());
        assertEquals("Umpire2", actualMatchInput.getUmpire2());
        assertEquals("Venue", actualMatchInput.getVenue());
        assertEquals("Winner", actualMatchInput.getWinner());
    }
}

