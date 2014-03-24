package org.battlenight.api.game.type;

import org.battlenight.api.game.GameTeam;
import org.battlenight.api.map.GameMap;

public abstract class GameType {

    public abstract String getDisplayName();

    public boolean isSetup(GameMap map) {
        int teams = 0;

        for (GameTeam team : map.getTeams()) {
            if (hasObjective() && !map.hasObjectiveLocation(team)) continue;
            if (map.hasSpawnLocation(team)) teams++;
        }

        return teams >= getMinPlayers() && teams <= getMaxPlayers();
    }

    public int getMinPlayers() {
        return 2;
    }

    public int getMaxPlayers() {
        return Integer.MAX_VALUE;
    }

    public abstract boolean hasObjective();

    public abstract boolean onDamage();

    public abstract void onKill();

    public abstract boolean onDeath();

    public abstract void onRespawn();

}
