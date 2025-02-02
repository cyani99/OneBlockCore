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

public class AncientMud {
    public static final NamespacedKey ANCIENTDEBRIS_KEY =
            new NamespacedKey(OBC.getInstance(), "ancientdebris");
    public static ItemStack create(){
        ItemStack item = new ItemStack(Material.BROWN_DYE);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add("Jakby to odpowiednio obrobić...");
        lore.add("Zbierz takich 9, żeby utworzyć Pradawne Zgliszcza!");
        assert meta != null;
        meta.addEnchant(Enchantment.CHANNELING,1,true);
        meta.setLore(lore);
        meta.setDisplayName(ChatColor.YELLOW+"Pradawne Błoto");
        item.setItemMeta(meta);
        return item;
    }

    public static void register(){
        ItemStack debris = new ItemStack(Material.ANCIENT_DEBRIS);
        RecipeChoice.ExactChoice piece = new RecipeChoice.ExactChoice(create());

        ShapedRecipe rec = new ShapedRecipe(ANCIENTDEBRIS_KEY, debris);
        rec.shape("AAA", "AAA", "AAA");
        rec.setIngredient('A', piece);

        Bukkit.addRecipe(rec);
    }

}
