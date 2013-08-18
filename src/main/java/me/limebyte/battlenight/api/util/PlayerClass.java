package me.limebyte.battlenight.api.util;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.potion.PotionEffect;

public interface PlayerClass {

    public void equip(Player player);

    public List<ItemStack> getArmour();

    public List<PotionEffect> getEffects();

    public List<ItemStack> getItems();

    public double getMaxHealth();

    public String getName();

    public Permission getPermission();

    public HashMap<String, Boolean> getPermissions();

}
