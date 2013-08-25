package me.limebyte.battlenight.api.event.battle;

import me.limebyte.battlenight.api.battle.Battle;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class BattleDeathEvent extends BattlePlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private Player killer;

    public BattleDeathEvent(Battle battle, Player player, Player killer) {
        super(battle, player);
        this.killer = killer;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getKiller() {
        return killer;
    }

}
