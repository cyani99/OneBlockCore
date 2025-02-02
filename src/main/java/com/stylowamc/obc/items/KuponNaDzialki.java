package com.stylowamc.obc.items;

import com.stylowamc.obc.OBC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class KuponNaDzialki {
    public static final NamespacedKey ENDPASS_KEY =
            new NamespacedKey(OBC.getInstance(), "kupon");

    public static ItemStack create(){
        ItemStack item = new ItemStack(Material.PAPER);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add("Z jego pomocą możesz odebrać 1000 bloków do działki!");
        lore.add("Po przeczytaniu ulega zniszczeniu");
        lore.add("§6Wpisz /kupon lub PPM żeby użyć!");
        meta.addEnchant(Enchantment.CHANNELING,1,true);
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.GOLD+"Kupon Na Bloki");
        item.setItemMeta(meta);
        return item;
    }

}
