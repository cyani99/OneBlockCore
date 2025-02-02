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

public class DiamondScrap {
    public static final NamespacedKey DIAMOND_KEY =
            new NamespacedKey(OBC.getInstance(), "diamond");
    public static ItemStack create(){
        ItemStack item = new ItemStack(Material.LIGHT_BLUE_DYE);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add("Trochę za mały, żęby stworzyć kilof");
        lore.add("Zbierz takich 9, żeby utworzyć diament!");
        assert meta != null;
        meta.addEnchant(Enchantment.CHANNELING,1,true);
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.AQUA+"Odłamek Diamentu");
        item.setItemMeta(meta);
        return item;
    }

    public static void register(){
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        RecipeChoice.ExactChoice piece = new RecipeChoice.ExactChoice(create());

        ShapedRecipe rec = new ShapedRecipe(DIAMOND_KEY, diamond);
        rec.shape("AAA", "AAA", "AAA");
        rec.setIngredient('A', piece);

        Bukkit.addRecipe(rec);
    }

}