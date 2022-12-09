package com.mrcowsvplugin.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class ShearSheepListener implements Listener {
    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event) {
        Player player = event.getPlayer();
        Entity entity = event.getEntity();

        if (entity.getType() == EntityType.SHEEP){
            player.sendMessage("Itu bukan sheep pergi sanaaaa hushhh");
            event.setCancelled(true);
        }else {
            player.sendMessage("Itu baru sheep kawan kamu terbalik");
        }
    }
}
