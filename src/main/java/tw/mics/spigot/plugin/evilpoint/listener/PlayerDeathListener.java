package tw.mics.spigot.plugin.evilpoint.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import tw.mics.spigot.plugin.evilpoint.EvilPoint;
import tw.mics.spigot.plugin.evilpoint.data.EvilPointData;

import java.util.List;

public class PlayerDeathListener extends MyListener{
    EvilPointData evilpointdata;
    public PlayerDeathListener(EvilPoint instance){
        super(instance);
        evilpointdata = EvilPoint.getInstance().evilpointdata;
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        Player p = event.getEntity();
        List<ItemStack> I = event.getDrops();
        int point = evilpointdata.getEvil(p);
        if ( point < 150){

            event.setKeepInventory(true);
            event.getDrops().clear();
        }

    }

}
