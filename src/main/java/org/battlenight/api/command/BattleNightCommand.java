package org.battlenight.api.command;

import java.util.ArrayList;
import java.util.List;

import org.battlenight.api.BattleAPI;
import org.bukkit.command.CommandSender;

/**
 * Represents a BattleNight sub-command. For it to be effective it needs to be
 * registered with the {@link CommandManager}.
 */
public abstract class BattleNightCommand {

    private BattleAPI api;

    private String name;
    private String label;
    private String description;
    private String usage;
    private List<String> aliases;
    private String permission;
    private boolean playerOnly;

    public BattleNightCommand(String name) {
        this(name, "", "", new ArrayList<String>());
    }

    public BattleNightCommand(String name, String description, String usageMessage, List<String> aliases) {
        this.name = name;
        this.label = name.toLowerCase();
        this.description = description;
        this.usage = usageMessage;
        this.aliases = aliases;
        this.permission = "battlenight.command." + label;
        this.playerOnly = false;
    }

    /**
     * Returns the API instance this command is associated with. This will be
     * null if not registered.
     * 
     * @return the api instance
     */
    public BattleAPI getApi() {
        return api;
    }

    /**
     * Sets the API instance this command is associated with. This is used
     * internally and is called only on registration with a
     * {@link CommandManager}.
     * 
     * @param api
     *            the api instance
     */
    public void setApi(BattleAPI api) {
        this.api = api;
    }

    /**
     * Returns the name for this command.
     * 
     * @return command name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name for this command.
     * 
     * @param name
     *            the new name
     */
    public String setName(String name) {
        return name;
    }

    /**
     * Returns the label for this command.
     * 
     * @return command label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label of this command If the command is currently registered the
     * label change will only take effect after its been re-registered e.g.
     * after a /bn reload
     * 
     * @param name
     *            The command's name
     */
    public void setLabel(String name) {
        label = name;
    }

    /**
     * Returns a brief description of this command.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a brief description of this command
     * 
     * @param description
     *            new command description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the usage message of this command
     * 
     * @return usage message
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the example usage of this command
     * 
     * @param usage
     *            New example usage
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * Returns a list of aliases for this command.
     * 
     * @return list of aliases
     */
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Sets the list of aliases, effective on registration
     * 
     * @param aliases
     *            aliases to add to this command
     */
    public void setAliases(List<String> aliases) {
        this.aliases.clear();

        for (String alias : aliases) {
            addAlias(alias);
        }
    }

    /**
     * Adds and alias to this command, effective on registration
     * 
     * @param alias
     *            alias to add to this command
     */
    public void addAlias(String alias) {
        this.aliases.add(alias.toLowerCase());
    }

    /**
     * Returns the permission required by users to be able to perform this
     * command.
     * 
     * @return permission name
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Sets the permission required by users to be able to perform this command
     * 
     * @param permission
     *            Permission name or null
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Returns true if this command is player only.
     * 
     * @return true if player only
     */
    public boolean isPlayerOnly() {
        return playerOnly;
    }

    /**
     * Sets the command as a command that can only be executed by a player.
     * 
     * @param playerOnly
     */
    public void setPlayerOnly(boolean playerOnly) {
        this.playerOnly = playerOnly;
    }

    /**
     * Checks if the command label or any of it's aliases match this command.
     * 
     * @return true if matching
     */
    public boolean matches(String input) {
        return label.equalsIgnoreCase(input) || aliases.contains(input.toLowerCase());
    }

    /**
     * Executes the command, returning its success
     * 
     * @param sender
     *            Source object which is executing this command
     * @param args
     *            All arguments passed to the command, split via ' '
     * @return true if the command was successful, otherwise false
     */
    public boolean perform(CommandSender sender, String[] args) {
        if (api == null) return true;
        return onPerformed(sender, args);
    }

    public abstract boolean onPerformed(CommandSender sender, String[] args);

    public abstract List<String> onTabComplete(CommandSender sender, String[] args);

}
