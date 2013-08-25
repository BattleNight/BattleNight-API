package me.limebyte.battlenight.api.event.lobby;

import me.limebyte.battlenight.api.battle.Lobby;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class LobbyPlayerEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private Lobby lobby;

    public LobbyPlayerEvent(Lobby lobby, Player player) {
        super(player);
        this.lobby = lobby;
    }

    public Lobby getLobby() {
        return lobby;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
