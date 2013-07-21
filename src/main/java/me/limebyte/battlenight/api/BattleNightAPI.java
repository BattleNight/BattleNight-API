package me.limebyte.battlenight.api;

import me.limebyte.battlenight.api.battle.Lobby;
import me.limebyte.battlenight.api.managers.ArenaManager;
import me.limebyte.battlenight.api.managers.BattleManager;
import me.limebyte.battlenight.api.managers.ClassManager;
import me.limebyte.battlenight.api.managers.MusicManager;
import me.limebyte.battlenight.api.util.Messenger;
import me.limebyte.battlenight.api.util.PlayerClass;

import org.bukkit.entity.Player;

public interface BattleNightAPI {

    public ArenaManager getArenaManager();

    public BattleManager getBattleManager();

    public ClassManager getClassManager();

    public Lobby getLobby();

    public Messenger getMessenger();

    public MusicManager getMusicManager();

    public PlayerClass getPlayerClass(Player player);

    public void setPlayerClass(Player player, PlayerClass playerClass);

}
