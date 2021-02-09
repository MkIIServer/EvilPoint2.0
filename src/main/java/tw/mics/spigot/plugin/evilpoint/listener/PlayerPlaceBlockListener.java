package tw.mics.spigot.plugin.evilpoint.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockPlaceEvent;
import tw.mics.spigot.plugin.evilpoint.EvilPoint;
import tw.mics.spigot.plugin.evilpoint.data.EvilPointData;

public class PlayerPlaceBlockListener extends MyListener {
    EvilPointData evilpointdata;
    public PlayerPlaceBlockListener(EvilPoint instance){
        super(instance);
        evilpointdata = EvilPoint.getInstance().evilpointdata;
    }
    @EventHandler
    public void OnPlayerPlaceBlock(BlockPlaceEvent event){
        Player player = event.getPlayer();
        Block block = event.getBlockPlaced();
        if (block.equals( Material.END_CRYSTAL )){
            evilpointdata.plusEvil(player,60);
        }
    }
}
