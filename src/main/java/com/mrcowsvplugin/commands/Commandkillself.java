package com.mrcowsvplugin.commands;

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
                player.setHealth(0);
                player.sendMessage("§cYou die dummy");
            }else{
                sender.sendMessage("§cOnly player can use this command");
            }
        }
        return true;
    }
}
