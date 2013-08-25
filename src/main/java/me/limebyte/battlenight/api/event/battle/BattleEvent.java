package me.limebyte.battlenight.api.event.battle;

import me.limebyte.battlenight.api.battle.Battle;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BattleEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private Battle battle;

    public BattleEvent(Battle battle) {
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
