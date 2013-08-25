package me.limebyte.battlenight.api.event.lobby;

import me.limebyte.battlenight.api.battle.Lobby;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class LobbyLeaveEvent extends LobbyPlayerEvent {

    private static final HandlerList handlers = new HandlerList();

    public LobbyLeaveEvent(Lobby lobby, Player player) {
        super(lobby, player);
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
