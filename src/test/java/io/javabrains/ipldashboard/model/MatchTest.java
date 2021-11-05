package io.javabrains.ipldashboard.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class MatchTest {
    @Test
    void testConstructor() {
        Match actualMatch = new Match();
        actualMatch.setCity("Oxford");
        LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
        actualMatch.setDate(ofEpochDayResult);
        actualMatch.setId(123L);
        actualMatch.setMatchWinner("Match Winner");
        actualMatch.setPlayerOfMatch("Player Of Match");
        actualMatch.setResult("Result");
        actualMatch.setResultMargin("Result Margin");
        actualMatch.setTeam1("Team1");
        actualMatch.setTeam2("Team2");
        actualMatch.setTossDecision("Toss Decision");
        actualMatch.setTossWinner("Toss Winner");
        actualMatch.setUmpire1("Umpire1");
        actualMatch.setUmpire2("Umpire2");
        actualMatch.setVenue("Venue");
        assertEquals("Oxford", actualMatch.getCity());
        assertSame(ofEpochDayResult, actualMatch.getDate());
        assertEquals(123L, actualMatch.getId());
        assertEquals("Match Winner", actualMatch.getMatchWinner());
        assertEquals("Player Of Match", actualMatch.getPlayerOfMatch());
        assertEquals("Result", actualMatch.getResult());
        assertEquals("Result Margin", actualMatch.getResultMargin());
        assertEquals("Team1", actualMatch.getTeam1());
        assertEquals("Team2", actualMatch.getTeam2());
        assertEquals("Toss Decision", actualMatch.getTossDecision());
        assertEquals("Toss Winner", actualMatch.getTossWinner());
        assertEquals("Umpire1", actualMatch.getUmpire1());
        assertEquals("Umpire2", actualMatch.getUmpire2());
        assertEquals("Venue", actualMatch.getVenue());
    }
}

