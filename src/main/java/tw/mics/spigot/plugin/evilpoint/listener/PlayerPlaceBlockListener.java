package tw.mics.spigot.plugin.evilpoint.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import tw.mics.spigot.plugin.evilpoint.EvilPoint;
import tw.mics.spigot.plugin.evilpoint.data.EvilPointData;

public class PlayerPlaceBlockListener extends MyListener {
    EvilPointData evilpointdata;
    public PlayerPlaceBlockListener(EvilPoint instance){
        super(instance);
        evilpointdata = EvilPoint.getInstance().evilpointdata;
    }
    @EventHandler
    /*public void OnPlayerPlaceBlock(BlockPlaceEvent event){
        Player player = event.getPlayer();
        Material place = event.getBlock().getType();
        if (place == Material.END_CRYSTAL ){
            evilpointdata.plusEvil(player,60);
        }
    }*/
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (Action.RIGHT_CLICK_BLOCK == event.getAction()) {
            if (Material.OBSIDIAN == event.getClickedBlock().getType()) {
                if (Material.END_CRYSTAL == event.getMaterial()) {
                    Player player = event.getPlayer();
                    evilpointdata.plusEvil(player,60);
                }
            }
        }
    }
}
