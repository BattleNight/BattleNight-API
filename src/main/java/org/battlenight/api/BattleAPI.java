package org.battlenight.api;

import org.battlenight.api.configuration.Configuration;
import org.battlenight.api.message.Messenger;

/**
 * Represents the API for accessing BattleNight singletons.
 */
public interface BattleAPI {

    /**
     * Gets the current {@link Configuration} singleton.
     * 
     * @return ConfigManager instance being used
     */
    public Configuration getConfigManager();

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
