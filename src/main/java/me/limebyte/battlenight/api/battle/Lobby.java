package me.limebyte.battlenight.api.battle;

import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;

public interface Lobby {

    public void addPlayer(Player player);

    public boolean contains(Player player);

    public Set<UUID> getPlayers();

    public boolean isStarting();

    public void removePlayer(Player player);

    public void startBattle() throws IllegalStateException;

}
