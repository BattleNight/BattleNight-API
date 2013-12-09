package org.battlenight.api.message;

import org.bukkit.command.CommandSender;

/**
 * Represents the manager for messaging, both logging and player chat.
 */
public interface Messenger {

    /**
     * Prints a debug message with arguments to the console as long as debugging
     * is enabled.
     * 
     * @param message
     *            the path to the message
     * @param args
     *            arguments for the message
     */
    public void debug(String message, Object... args);

    /**
     * Formats a message with arguments, returning the formatted message.
     * 
     * @param message
     *            the message to format
     * @param args
     *            arguments for the message
     */
    public String format(String message, Object... args);

    /**
     * Prints an error message with arguments to the console.
     * 
     * @param message
     *            the path to the message
     * @param args
     *            arguments for the message
     */
    public void logError(String message, Object... args);

    /**
     * Prints an info message with arguments to the console.
     * 
     * @param message
     *            the path to the message
     * @param args
     *            arguments for the message
     */
    public void logInfo(String message, Object... args);

    /**
     * Prints a warning message with arguments to the console.
     * 
     * @param message
     *            the path to the message
     * @param args
     *            arguments for the message
     */
    public void logWarning(String message, Object... args);

    /**
     * Reloads the configured messages.
     */
    public void reload();

    /**
     * Sends a message with arguments to the specified {@link CommandSender}.
     * 
     * @param sender
     *            the sender to send the message to
     * @param message
     *            the path to the message
     * @param args
     *            arguments for the message
     */
    public void send(CommandSender sender, String message, Object... args);

}
