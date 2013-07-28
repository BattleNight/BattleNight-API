package me.limebyte.battlenight.api.managers;

import java.util.List;

import me.limebyte.battlenight.api.battle.Team;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public interface ScoreManager {

    public void addPlayer(Player player);

    public void removePlayer(Player player);

    public void addTeam(Team team);

    public Scoreboard getScoreboard();

    public ScoreboardState getState();

    public List<String> getPlayers();

    public void setState(ScoreboardState state);

    public void setScoreboard(Scoreboard scoreboard);

    public void updateScore(Player player, int score);

    public void updateTime(long time);

    public enum ScoreboardState {
        VOTING(ChatColor.GRAY + "Arena Voting"),
        BATTLE(ChatColor.GRAY + "Battle (%1$TM:%1$TS)");

        private String title;

        private ScoreboardState(String title) {
            this.title = title;
        }

        public String getTitle() {
            return ChatColor.BOLD + title;
        }
    }

}
