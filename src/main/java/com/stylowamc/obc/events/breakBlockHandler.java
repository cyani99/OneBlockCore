package com.stylowamc.obc.events;

import com.stylowamc.obc.items.AncientMud;
import com.stylowamc.obc.items.DiamondScrap;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class breakBlockHandler implements Listener {

    @EventHandler
    public void CustomDropFromBlocks(BlockBreakEvent e){
        boolean survival = false;

        if(survival){
            if(e.getBlock().getType() == Material.DIAMOND_ORE || e.getBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE){
                if (!e.isCancelled()){
                    e.getBlock().getDrops().clear();
                    e.setDropItems(false);
                    Location loc = e.getBlock().getLocation();
                    e.getPlayer().getWorld().dropItemNaturally(loc, DiamondScrap.create());
                }
            }
            else if(e.getBlock().getType() == Material.ANCIENT_DEBRIS){
                if (!e.isCancelled()){
                    e.getBlock().getDrops().clear();
                    e.setDropItems(false);
                    Location loc = e.getBlock().getLocation();
                    e.getPlayer().getWorld().dropItemNaturally(loc, AncientMud.create());
                }
            }

        }
    }

}
