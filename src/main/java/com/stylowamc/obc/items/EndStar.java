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

public class EndStar {
    public static final NamespacedKey NETHERSTAR =
            new NamespacedKey(OBC.getInstance(), "netherstar");

    public static ItemStack create(){
        ItemStack item = new ItemStack(Material.NETHER_STAR);
        return item;
    }

    public static void register(){
        ItemStack netherstar = new ItemStack(Material.NETHER_STAR);
        RecipeChoice.ExactChoice starbook = new RecipeChoice.ExactChoice(StarBook.create());

        ShapedRecipe rec = new ShapedRecipe(NETHERSTAR, netherstar);
        rec.shape("AAA", "AAA", "AAA");
        rec.setIngredient('A', starbook);

        Bukkit.addRecipe(rec);
    }
}
