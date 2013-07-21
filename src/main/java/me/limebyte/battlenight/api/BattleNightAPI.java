package me.limebyte.battlenight.api;

import me.limebyte.battlenight.api.battle.Battle;
import me.limebyte.battlenight.api.battle.Lobby;
import me.limebyte.battlenight.api.managers.ArenaManager;
import me.limebyte.battlenight.api.managers.ClassManager;
import me.limebyte.battlenight.api.managers.MusicManager;
import me.limebyte.battlenight.api.managers.ScoreManager;
import me.limebyte.battlenight.api.util.Messenger;
import me.limebyte.battlenight.api.util.PlayerClass;

import org.bukkit.entity.Player;

public interface BattleNightAPI {

    public ArenaManager getArenaManager();

    public ClassManager getClassManager();

    public Lobby getLobby();

    public Battle getBattle();

    public Messenger getMessenger();

    public MusicManager getMusicManager();

    public ScoreManager getScoreManager();

    public PlayerClass getPlayerClass(Player player);

    public void setBattle(Battle battle);

    public void setPlayerClass(Player player, PlayerClass playerClass);

}
