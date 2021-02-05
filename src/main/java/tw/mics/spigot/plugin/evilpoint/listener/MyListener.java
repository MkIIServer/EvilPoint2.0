package tw.mics.spigot.plugin.evilpoint.listener;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import tw.mics.spigot.plugin.evilpoint.EvilPoint;


public abstract class MyListener implements Listener {
	protected EvilPoint plugin;
	public MyListener(EvilPoint instance){
		this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	    this.plugin.logDebug(this.getClass().getSimpleName() + " Registed.");
	}
	
	public void unregisterListener(){
		HandlerList.unregisterAll(this);
	    this.plugin.logDebug(this.getClass().getSimpleName() + " Unregisted.");
	}
	
	protected void showEventFired(Event e){
		this.plugin.logDebug("[EVENT] " + this.getClass().getSimpleName() + " " + e.getEventName());
	}
}
