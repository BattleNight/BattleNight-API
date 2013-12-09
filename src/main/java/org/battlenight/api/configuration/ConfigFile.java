package org.battlenight.api.configuration;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * Represents all configuration files used by the core plugin. These files
 * should be handled as read only. Any modifications to these files should be
 * avoided if possible to prevent any conflicts.
 */
public enum ConfigFile {
    /**
     * Main configuration file
     */
    OPTIONS("options"),
    /**
     * Loadout configuration file
     */
    LOADOUTS("loadouts"),
    /**
     * Arena storage file
     */
    ARENAS("arenas"),
    /**
     * English message file
     */
    MSG_ENGLISH("english"),
    /**
     * Custom message file
     */
    MSG_CUSTOM("custom");

    private final String name;
    private static final Map<String, ConfigFile> BY_NAME = Maps.newHashMap();

    private ConfigFile(String name) {
        this.name = name;
    }

    /**
     * Gets the name of this ConfigFile. ConfigFile names do not include file
     * extensions.
     * 
     * @return the name of this ConfigFile
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the configuration file based off the specified name. ConfigFile
     * names do not include file extensions.
     * 
     * @param name
     *            the file name
     * @return the corresponding ConfigFile, null if not found
     */
    public static ConfigFile getByName(String name) {
        return BY_NAME.get(name);
    }

}
