package me.limebyte.battlenight.api.battle;

import java.util.Set;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface Team {

    public void addPlayer(Player player);

    public ChatColor getColour();

    public String getDisplayName();

    public String getName();

    public Set<UUID> getPlayers();

    public int getScore();

    public boolean isReady();

    public void removePlayer(Player player);

    public void setColour(ChatColor colour);

    public void setDisplayName(String displayName);

    public void setReady(boolean ready);

}
