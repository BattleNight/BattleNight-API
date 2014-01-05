package org.battlenight.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class Util {

    private Util() {
    }

    public static String locationToString(Location location) {
        String world = location.getWorld().getName();
        double x = location.getBlockX() + 0.5;
        double y = location.getY();
        double z = location.getBlockZ() + 0.5;
        String direction = location.getYaw() + ", " + location.getPitch();

        return world + "(" + x + ", " + y + ", " + z + ", " + direction + ")";
    }

    public static Location locationFromString(String location) {
        String[] firstParts = location.substring(0, location.length() - 1).split("(");
        String[] secondParts = firstParts[1].split(", ");

        World world = Bukkit.getWorld(firstParts[0]);
        double x = Double.parseDouble(secondParts[0]);
        double y = Double.parseDouble(secondParts[1]);
        double z = Double.parseDouble(secondParts[2]);
        float yaw = Float.parseFloat(secondParts[3]);
        float pitch = Float.parseFloat(secondParts[4]);

        return new Location(world, x, y, z, yaw, pitch);
    }
}
