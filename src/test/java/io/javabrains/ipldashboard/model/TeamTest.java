package io.javabrains.ipldashboard.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TeamTest {
    @Test
    void testConstructor() {
        Team actualTeam = new Team();
        actualTeam.setId(123L);
        ArrayList<Match> matchList = new ArrayList<Match>();
        actualTeam.setMatches(matchList);
        actualTeam.setTeamName("Team Name");
        actualTeam.setTotalMatches(1L);
        actualTeam.setTotalWins(1L);
        assertEquals(123L, actualTeam.getId());
        assertSame(matchList, actualTeam.getMatches());
        assertEquals("Team Name", actualTeam.getTeamName());
        assertEquals(1L, actualTeam.getTotalMatches());
        assertEquals(1L, actualTeam.getTotalWins());
        assertEquals("Team [teamName=Team Name, totalMatches=1, totalWins=1]", actualTeam.toString());
    }

    @Test
    void testConstructor2() {
        Team actualTeam = new Team("Team Name", 1L);
        actualTeam.setId(123L);
        ArrayList<Match> matchList = new ArrayList<Match>();
        actualTeam.setMatches(matchList);
        actualTeam.setTeamName("Team Name");
        actualTeam.setTotalMatches(1L);
        actualTeam.setTotalWins(1L);
        assertEquals(123L, actualTeam.getId());
        assertSame(matchList, actualTeam.getMatches());
        assertEquals("Team Name", actualTeam.getTeamName());
        assertEquals(1L, actualTeam.getTotalMatches());
        assertEquals(1L, actualTeam.getTotalWins());
        assertEquals("Team [teamName=Team Name, totalMatches=1, totalWins=1]", actualTeam.toString());
    }
}

