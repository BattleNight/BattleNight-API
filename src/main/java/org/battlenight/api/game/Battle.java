package org.battlenight.api.game;

import java.util.List;

import org.battlenight.api.game.type.GameType;
import org.bukkit.entity.Player;

public interface Battle {

    public void addPlayer(Player player);

    public void removePlayer(Player player);

    public List<String> getPlayers();

    public GameType getGameType();

}
