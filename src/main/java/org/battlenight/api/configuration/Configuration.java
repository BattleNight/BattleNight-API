package org.battlenight.api.configuration;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * Represents the manager for all configuration, storage and message files used
 * by the core plugin.
 */
public interface Configuration {

    /**
     * Gets the requested {@link FileConfiguration} by {@link ConfigFile}
     * 
     * @param file
     *            the file to get
     * @return the requested file configuration, null if not found
     */
    public FileConfiguration get(ConfigFile file);

    /**
     * Reloads all configuration files.
     */
    public void reload();

    /**
     * Loads the specified {@link ConfigFile} from it's file location
     * 
     * @param file
     *            the file to reload
     */
    public void reload(ConfigFile file);

    /**
     * Saves the specified {@link ConfigFile} to it's file location
     * 
     * @param file
     *            the file to save
     */
    public void save(ConfigFile file);

}
