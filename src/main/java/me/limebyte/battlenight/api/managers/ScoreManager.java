package me.limebyte.battlenight.api.managers;

import java.util.List;

import me.limebyte.battlenight.api.battle.Arena;
import me.limebyte.battlenight.api.battle.Team;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public interface ScoreManager {

    public void addPlayer(Player player);

    public void addTeam(Team team);

    public List<String> getPlayers();

    public Scoreboard getScoreboard();

    public ScoreboardState getState();

    public List<Arena> getVotableArenas();

    public void removePlayer(Player player);

    public void setScoreboard(Scoreboard scoreboard);

    public void setState(ScoreboardState state);

    public void updateScore(Player player, int score);

    public void updateTime(long time);

    public void updateVotes();

    public enum ScoreboardState {
        VOTING("Arena Voting", "Voting (%1$TM:%1$TS)"),
        BATTLE("Battle Starting", "Battle (%1$TM:%1$TS)");

        private String title;
        private String countdown;

        private ScoreboardState(String title, String countdown) {
            this.title = title;
            this.countdown = countdown;
        }

        public String getCountdown() {
            return countdown;
        }

        public String getTitle() {
            return title;
        }
    }

}
