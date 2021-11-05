package io.javabrains.ipldashboard.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.zaxxer.hikari.HikariDataSource;
import io.javabrains.ipldashboard.model.Match;
import org.junit.jupiter.api.Test;

class BatchConfigTest {
    @Test
    void testReader() {
        assertTrue((new BatchConfig()).reader().isSaveState());
    }

    @Test
    void testProcessor() throws Exception {
        MatchDataProcessor actualProcessorResult = (new BatchConfig()).processor();
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
        Match actualProcessResult = actualProcessorResult.process(matchInput);
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
    void testWriter() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by writer(DataSource)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        BatchConfig batchConfig = new BatchConfig();
        assertNotNull(batchConfig.writer(new HikariDataSource()));
    }
}

