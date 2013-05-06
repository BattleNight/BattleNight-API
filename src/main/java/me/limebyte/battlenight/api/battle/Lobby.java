package me.limebyte.battlenight.api.battle;

import java.util.Set;

import org.bukkit.entity.Player;

public interface Lobby {

    public void addPlayer(Player player);
    
    public void removePlayer(Player player);
    
    public Set<String> getPlayers();
    
    public void startBattle();
    
    public ScorePane getScoreboard();
}
