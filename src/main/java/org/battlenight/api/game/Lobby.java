package org.battlenight.api.game;

import java.util.List;
import java.util.Queue;

import org.bukkit.entity.Player;

public interface Lobby {

    public void addPlayer(Player player);

    public void removePlayer(Player player);

    public Queue<String> getPlayers();

    public List<Battle> getBattles();

    public void startBattle();

}
