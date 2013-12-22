package org.battlenight.api.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;

/**
 * Represents the manager for sub-commands of the BattleNight command.
 */
public interface CommandManager extends CommandExecutor, TabCompleter {

    /**
     * Gets the {@link BattleNightCommand} associated with the specified label
     * or alias. If there is no command matching registered with this manager,
     * it will return null.
     * 
     * @param label
     *            the command label or alias
     */
    public BattleNightCommand getCommand(String label);

    /**
     * Registers a {@link BattleNightCommand} with this manager.
     * 
     * @param command
     *            the command to register
     */
    public void register(BattleNightCommand command);

}
