package org.battlenight.api;

import java.util.Random;

import org.battlenight.api.command.CommandManager;
import org.battlenight.api.configuration.Configuration;
import org.battlenight.api.game.Lobby;
import org.battlenight.api.game.type.GameTypeManager;
import org.battlenight.api.map.MapManager;
import org.battlenight.api.message.Messenger;

/**
 * Represents the API for accessing BattleNight singletons.
 */
public interface BattleAPI {

    /**
     * Gets the current {@link CommandManager} singleton.
     * 
     * @return CommandManager instance being used
     */
    public CommandManager getCommandManager();

    /**
     * Gets the current {@link Configuration} singleton.
     * 
     * @return Configuration instance being used
     */
    public Configuration getConfiguration();

    /**
     * Gets the current {@link GameTypeManager} singleton.
     * 
     * @return GameTypeManager instance being used
     */
    public GameTypeManager getGameTypeManager();

    /**
     * Gets the current {@link MapManager} singleton.
     * 
     * @return MapManager instance being used
     */
    public MapManager getMapManager();

    /**
     * Gets the current {@link Messenger} singleton.
     * 
     * @return Messenger instance being used
     */
    public Messenger getMessenger();

    /**
     * Gets the current {@link Lobby} singleton.
     * 
     * @return Lobby instance being used
     */
    public Lobby getLobby();

    public Random getRandom();

    /**
     * Soft reloads the BattleNight singletons.
     */
    public void reload();
}
