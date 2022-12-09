package com.mrcowsvplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinandLeftListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        event.setJoinMessage("§7[§a+§7]§f " + player.getDisplayName());
    }

    @EventHandler
    public void onPlayerLeft(PlayerQuitEvent event){

        Player player = event.getPlayer();
        event.setQuitMessage("§7[§c-§7]§f " + player.getDisplayName());
    }
}
