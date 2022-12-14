package com.mrcowsvplugin;

import com.mrcowsvplugin.commands.Commandfeed;
import com.mrcowsvplugin.commands.Commandfly;
import com.mrcowsvplugin.commands.Commandheal;
import com.mrcowsvplugin.commands.Commandkillself;
import com.mrcowsvplugin.listeners.ShearSheepListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class myfirstpluginstolearn extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("§7[§6mrcowsvpl§7] §aPlugins First Started");

        getServer().getPluginManager().registerEvents(new ShearSheepListener(), this);
        getCommand("killself").setExecutor(new Commandkillself());
        getCommand("fly").setExecutor(new Commandfly());
        getCommand("feed").setExecutor(new Commandfeed());
        getCommand("heal").setExecutor(new Commandheal());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("§7[§6mrcowsvpl§7] §cPlugins First Stopped");
    }
}
