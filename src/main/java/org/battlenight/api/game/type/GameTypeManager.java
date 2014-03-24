package org.battlenight.api.game.type;


/**
 * Represents the manager for Battle game types.
 */
public interface GameTypeManager {

    /**
     * Returns a new instance of the {@link GameType} associated with the
     * specified name. If there is no game type matching registered with this
     * manager, it will return null.
     * 
     * @param name
     *            the game type name
     */
    public GameType getGameType(String name);

}
