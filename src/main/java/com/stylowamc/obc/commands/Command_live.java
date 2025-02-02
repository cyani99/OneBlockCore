package com.stylowamc.obc.commands;

import com.stylowamc.obc.items.KuponNaDzialki;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class Command_live implements CommandExecutor {
    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission("obc.live")){
                if(args.length == 1){
                    Bukkit.broadcastMessage("§a---------------------------------------");
                    Bukkit.broadcastMessage("             §6§l "+p.getName()+" §eProwadzi LIVE             ");

                    TextComponent component = new TextComponent("             §6§lLINK: §7§n"+args[0]);
                    component.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, args[0].toString()));
                    Bukkit.getServer().spigot().broadcast(component);
                    Bukkit.broadcastMessage("§a---------------------------------------");
                    }
                }
            }



        return false;
    }
}
