package me.limebyte.battlenight.api.battle;

import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface Team {

    public String getName();

    public ChatColor getColour();

    public String getDisplayName();

    public int getScore();

    public Set<String> getPlayers();

    public void addPlayer(Player player);

    public void removePlayer(Player player);

    public boolean isReady();

    public void setColour(ChatColor colour);

    public void setDisplayName(String displayName);

    public void setReady(boolean ready);

}
