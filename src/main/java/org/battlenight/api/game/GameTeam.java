package org.battlenight.api.game;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface GameTeam {

    public String getName();

    public String getDisplayName();

    public ChatColor getChatColour();

    public int getPlayers();

    public void addPlayer(Player player);

    public void removePlayer(Player player);

    public void reset();

}
