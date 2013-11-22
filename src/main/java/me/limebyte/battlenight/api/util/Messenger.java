package me.limebyte.battlenight.api.util;

import java.util.logging.Level;

import org.bukkit.Sound;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public interface Messenger {

    public String get(String name);

    public void debug(Level level, String message);

    public void debug(Level level, String message, Object... args);

    public String format(Message message, Object... args);

    public String format(String message, Object... args);

    public String getColouredName(Player player);

    public void log(Level level, String message);

    public void log(Level level, String message, Object... args);

    public void playSong(Song song);

    public void playSound(Sound sound, float pitch);

    public void tell(CommandSender sender, Message message);

    public void tell(CommandSender sender, Message message, Object... args);

    public void tell(CommandSender sender, Page page);

    public void tell(CommandSender sender, String message);

    public void tell(CommandSender sender, String message, Object... args);

    public void tellBattle(Message message);

    public void tellBattle(Message message, Object... args);

    public void tellBattle(Page page);

    public void tellBattle(String message);

    public void tellBattle(String message, Object... args);

    public void tellBattleExcept(Player player, Message message);

    public void tellBattleExcept(Player player, Message message, Object... args);

    public void tellBattleExcept(Player player, Page page);

    public void tellBattleExcept(Player player, String message);

    public void tellBattleExcept(Player player, String message, Object... args);

    public void tellLobby(Message message);

    public void tellLobby(Message message, Object... args);

    public void tellLobby(Page page);

    public void tellLobby(String message);

    public void tellLobby(String message, Object... args);

}
