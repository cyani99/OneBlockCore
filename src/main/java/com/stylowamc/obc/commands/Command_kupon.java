package com.stylowamc.obc.commands;

import com.onarandombox.MultiverseCore.MultiverseCore;
import com.onarandombox.MultiverseCore.api.MVWorldManager;
import com.stylowamc.obc.items.EndPass;
import com.stylowamc.obc.items.KuponNaDzialki;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Command_kupon implements CommandExecutor {
    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("obc.kupon")){
                if(args.length == 0){
                    if (p.getInventory().getItemInMainHand().equals(KuponNaDzialki.create())){
                        p.sendMessage("§a§lUzyłeś kupon działki!");
                        Bukkit.dispatchCommand(console, "acb "+p.getName()+" 1000");
                        p.getInventory().removeItem(p.getInventory().getItemInMainHand());
                    }
                    else{
                        p.sendMessage("§c§lMusisz trzymać kupon w dłoni!");
                    }
                }
            }
        }



        return false;
    }
}
