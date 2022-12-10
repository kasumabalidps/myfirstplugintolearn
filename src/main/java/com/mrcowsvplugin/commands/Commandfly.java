package com.mrcowsvplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandfly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmnd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmnd.getName().equalsIgnoreCase("fly")) {
                // check kalau player itu gak gamemode creative
                if (p.getGameMode() == GameMode.CREATIVE) {
                    p.sendMessage(ChatColor.RED + "You can't use this command on creative mode.");
                    return true;
                // check kalau player punya permission
                } else if (!p.hasPermission("mrcowsv.fly")) {
                    p.sendMessage(ChatColor.RED + "You do not have permission to fly.");
                    return true;
                }
            }
            // check apakah flight player itu false/tidak fly
            if (p.getAllowFlight() == false) {
                p.setAllowFlight(true);
                p.sendMessage(ChatColor.GREEN + "Flight allowed.");
            } else {
                p.setAllowFlight(false);
                p.sendMessage(ChatColor.RED + "Flight denied.");
            }
        }
        return true;
    }
}