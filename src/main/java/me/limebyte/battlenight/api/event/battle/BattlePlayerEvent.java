package me.limebyte.battlenight.api.event.battle;

import me.limebyte.battlenight.api.battle.Battle;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class BattlePlayerEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private Battle battle;

    public BattlePlayerEvent(Battle battle, Player player) {
        super(player);
        this.battle = battle;
    }

    public Battle getBattle() {
        return battle;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
