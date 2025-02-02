package com.stylowamc.obc.events;

import com.stylowamc.obc.items.EndPass;
import com.stylowamc.obc.items.KuponNaDzialki;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class useEndPassHandler implements Listener {
    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
    @EventHandler
    public void OnPassUse(PlayerInteractEvent e){
        if (e.getPlayer().getInventory().getItemInMainHand().equals(EndPass.create())){
            Player p = e.getPlayer();
            //p.sendMessage("§a§lZostałeś przeteleportowany do endu!");
            p.sendMessage("§a§lPrzepustki do endu nie zostały jeszcze włączone!");
            //p.getInventory().removeItem(p.getInventory().getItemInMainHand());
            //Location loc = new Location(Bukkit.getWorld("world_the_end"),126,58,15);
            //p.teleport(loc);
        }
        if (e.getPlayer().getInventory().getItemInMainHand().equals(KuponNaDzialki.create())){
            Player p = e.getPlayer();
            p.sendMessage("§a§lWykorzystałeś kupon!");
            Bukkit.dispatchCommand(console, "acb "+p.getName()+" 1000");
            p.getInventory().removeItem(p.getInventory().getItemInMainHand());
        }
    }


//    @EventHandler
//    public void onBlockPhysics(EntityChangeBlockEvent event) {
//        if (event.getBlock().getType().hasGravity()){
//            event.setCancelled(true);
//            //Bukkit.broadcastMessage("Zablokowano spadanie piasku");
//        }
//
//    }

}
