package com.mrcowsvplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandkillself implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // contoh /killself command
        if (command.getName().equalsIgnoreCase("killself")){
            if (sender instanceof Player){
                Player player = (Player) sender;
                if (command.getName().equalsIgnoreCase("fly")) {
                    // check kalau player itu gak gamemode creative
                    if (!player.hasPermission("mrcowsv.killself")) {
                        player.sendMessage(ChatColor.RED + "You do not have permission to fly.");
                        return true;
                    }
                }
                player.setHealth(0);
                player.sendMessage("§cYou die dummy");
            }else{
                sender.sendMessage("§cOnly player can use this command");
            }
        }
        return true;
    }
}
