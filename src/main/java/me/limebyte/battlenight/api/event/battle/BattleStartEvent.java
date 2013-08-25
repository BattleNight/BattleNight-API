package me.limebyte.battlenight.api.event.battle;

import me.limebyte.battlenight.api.battle.Battle;

import org.bukkit.event.HandlerList;

public class BattleStartEvent extends BattleEvent {

    private static final HandlerList handlers = new HandlerList();

    public BattleStartEvent(Battle battle) {
        super(battle);
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
