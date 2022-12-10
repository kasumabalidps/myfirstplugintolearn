package com.mrcowsvplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandfeed implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (command.getName().equalsIgnoreCase("feed")) {
                if (!p.hasPermission("mrcowsv.feed")) {
                    p.sendMessage("You do not have permission to use this command!");
                    return true;
                } else if (p.getGameMode() == GameMode.CREATIVE) {
                    p.sendMessage(ChatColor.RED + "You cannot use this command in Creative mode!");
                    return true;
                }
            }
            p.sendMessage(ChatColor.GREEN + "You hava healed!!");
            p.setFoodLevel(20);
        }
        return true;
    }
}
