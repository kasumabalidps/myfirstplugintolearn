package com.mrcowsvplugin;

import com.mrcowsvplugin.listeners.JoinandLeftListener;
import com.mrcowsvplugin.listeners.ShearSheepListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class myfirstpluginstolearn extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("§7[§6mrcowsvpl§7] §aPlugins First Started");

        getServer().getPluginManager().registerEvents(new JoinandLeftListener(), this);
        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("§7[§6mrcowsvpl§7] §cPlugins First Stopped");
    }
}
