package org.battlenight.api;

import org.battlenight.api.command.CommandManager;
import org.battlenight.api.configuration.Configuration;
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
     * Gets the current {@link Messenger} singleton.
     * 
     * @return Messenger instance being used
     */
    public Messenger getMessenger();

    /**
     * Soft reloads the BattleNight singletons.
     */
    public void reload();
}
