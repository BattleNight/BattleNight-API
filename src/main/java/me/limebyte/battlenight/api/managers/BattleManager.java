package me.limebyte.battlenight.api.managers;

import java.util.List;

import me.limebyte.battlenight.api.battle.Battle;

public interface BattleManager {

    public Battle getBattle();
    
    public void setBattle(Battle battle) throws IllegalStateException;
    
    public Battle getNewBattle();
    
    public Battle getNewBattle(String id);
    
    @Deprecated
    public boolean deregister(String id) throws IllegalStateException;
    
    @Deprecated
    public Battle getActiveBattle();

    @Deprecated
    public Battle getBattle(String id);
    
    @Deprecated
    public List<Battle> getBattles();
    
    @Deprecated
    public void register(Battle battle, String id) throws IllegalArgumentException;
    
    @Deprecated
    public void reloadBattles();
    
    @Deprecated
    public boolean setActiveBattle(String id) throws IllegalStateException;
    
}
