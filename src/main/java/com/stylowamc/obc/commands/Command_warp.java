package com.stylowamc.obc.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Command_warp implements CommandExecutor {
    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("obc.warps")){
                Bukkit.dispatchCommand(console, "zm open zmenu:warpy "+p.getName());
                p.performCommand("zm open zmenu:warpy "+p.getName());
            }
        }

        return false;
    }
}
