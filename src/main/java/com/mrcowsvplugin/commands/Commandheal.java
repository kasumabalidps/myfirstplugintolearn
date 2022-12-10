package com.mrcowsvplugin.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandheal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmnd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (cmnd.getName().equalsIgnoreCase("heal")) {
                if (!p.hasPermission("mrcowsv.heal")) {
                    p.sendMessage(p.getName() + " doesn't have permission to heal!");
                    return true;
                } else if (p.getGameMode() == GameMode.CREATIVE) {
                    p.sendMessage("You can't use this command in creative mode");
                    return true;
                }
            }
            p.sendMessage("You have been healed!");
            p.setHealth(20);
        }
        return true;
    }
}
