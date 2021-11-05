package io.javabrains.ipldashboard.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.javabrains.ipldashboard.model.Match;
import io.javabrains.ipldashboard.model.Team;
import io.javabrains.ipldashboard.repository.MatchRepository;
import io.javabrains.ipldashboard.repository.TeamRepository;

import java.util.ArrayList;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {TeamController.class})
@ExtendWith(SpringExtension.class)
class TeamControllerTest {
    @MockBean
    private MatchRepository matchRepository;

    @Autowired
    private TeamController teamController;

    @MockBean
    private TeamRepository teamRepository;

    @Test
    void testConstructor() {
        assertTrue(
                ((Collection<Team>) (new TeamController(mock(TeamRepository.class), mock(MatchRepository.class))).getAllTeam())
                        .isEmpty());
    }

    @Test
    void testGetMatchesForTeam() throws Exception {
        when(this.matchRepository.getMatchesByTeamBetweenDates((String) any(), (java.time.LocalDate) any(),
                (java.time.LocalDate) any())).thenReturn(new ArrayList<Match>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/team/{teamName}/matches", "Team Name");
        MockHttpServletRequestBuilder requestBuilder = getResult.param("year", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }

    @Test
    void testGetTeam() throws Exception {
        Team team = new Team();
        team.setTotalWins(1L);
        team.setTotalMatches(1L);
        team.setTeamName("Team Name");
        team.setId(123L);
        team.setMatches(new ArrayList<Match>());
        when(this.teamRepository.findByTeamName((String) any())).thenReturn(team);
        when(this.matchRepository.findLatestMatchesbyTeam((String) any(), anyInt())).thenReturn(new ArrayList<Match>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/team/{teamName}", "Team Name");
        MockMvcBuilders.standaloneSetup(this.teamController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content()
                        .string("{\"id\":123,\"teamName\":\"Team Name\",\"totalMatches\":1,\"totalWins\":1,\"matches\":[]}"));
    }
}

