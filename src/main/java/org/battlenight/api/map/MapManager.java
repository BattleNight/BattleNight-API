package org.battlenight.api.map;


/**
 * Represents the manager for Battle maps.
 */
public interface MapManager {

    /**
     * Returns a new instance of the {@link GameMap} associated with the
     * specified name. If there is no map matching registered with this manager,
     * it will return null.
     * 
     * @param name
     *            the map name
     * @return the related map if it exists
     */
    public GameMap getMap(String name);

    /**
     * Returns a new instance of a random {@link GameMap}.
     * 
     * @return the random map
     */
    public GameMap getRandomMap();

}
