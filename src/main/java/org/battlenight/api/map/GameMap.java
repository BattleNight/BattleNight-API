package org.battlenight.api.map;

import java.util.List;

import org.battlenight.api.game.GameTeam;
import org.bukkit.Location;

public interface GameMap {

    public String getName();

    public String getDisplayName();

    public void setDisplayName(String name);

    public List<GameTeam> getTeams();

    public Location getSpawnLocation(GameTeam team);

    public void addSpawnLocation(GameTeam team, Location location);

    public boolean hasSpawnLocation(GameTeam team);

    public Location getObjectiveLocation(GameTeam team);

    public void setObjectiveLocation(GameTeam team, Location location);

    public boolean hasObjectiveLocation(GameTeam team);

    public void save();

}
