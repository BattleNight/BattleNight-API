package me.limebyte.battlenight.api.event.battle;

import me.limebyte.battlenight.api.battle.Battle;
import me.limebyte.battlenight.api.battle.Waypoint;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class BattleRespawnEvent extends BattlePlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private Waypoint waypoint;

    public BattleRespawnEvent(Battle battle, Player player, Waypoint waypoint) {
        super(battle, player);
        this.waypoint = waypoint;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Waypoint getWaypoint() {
        return waypoint;
    }

}
