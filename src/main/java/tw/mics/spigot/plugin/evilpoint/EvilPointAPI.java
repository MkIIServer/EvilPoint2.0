package tw.mics.spigot.plugin.evilpoint;

import org.bukkit.entity.Player;
import tw.mics.spigot.plugin.evilpoint.data.EvilPointData;

public class EvilPointAPI {
    public static int getEvilPoint(Player p){
        return EvilPoint.getInstance().evilpointdata.getEvil(p);
    }
    public static void minusEvil(Player player, int modify_point){
        EvilPoint.getInstance().evilpointdata.minusEvil(player, modify_point);
    }

    public static void plusEvil(Player player, int modify_point){
        EvilPoint.getInstance().evilpointdata.plusEvil(player, modify_point);
    }
}
