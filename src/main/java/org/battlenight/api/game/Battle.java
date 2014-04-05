package org.battlenight.api.game;

import java.util.List;
import java.util.UUID;

import org.battlenight.api.game.type.GameType;
import org.battlenight.api.map.GameMap;
import org.bukkit.entity.Player;

public interface Battle {

    public void addPlayer(Player player);

    public void removePlayer(Player player);

    public List<UUID> getPlayers();

    public GameType getGameType();

    public GameMap getGameMap();

    public boolean isInProgress();

}
