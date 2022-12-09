package com.mrcowsvplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class myfirstpluginstolearn extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("§7[§6mrcowsvpl§7] §aPlugins First Started");

        getServer().getPluginManager().registerEvents(this, this);
    }

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

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("§7[§6mrcowsvpl§7] §cPlugins First Stopped");
    }
}
