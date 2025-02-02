package com.stylowamc.obc;

import com.stylowamc.obc.commands.*;
import com.stylowamc.obc.drop.DisableCraftings;
import com.stylowamc.obc.drop.MobDrops;
import com.stylowamc.obc.drop.VillagerBlock;
import com.stylowamc.obc.events.breakBlockHandler;
import com.stylowamc.obc.events.useEndPassHandler;
import com.stylowamc.obc.items.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class OBC extends JavaPlugin {

    private static OBC plugin;

    public static OBC getInstance(){
        return plugin;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        this.getCommand("obc").setExecutor(new Command_obc());
        this.getCommand("przepustka").setExecutor(new Command_end());
        this.getCommand("kupon").setExecutor(new Command_kupon());
        this.getCommand("live").setExecutor(new Command_live());
        //this.getCommand("warp").setExecutor(new Command_warp());
        //this.getCommand("warps").setExecutor(new Command_warp());
        getServer().getPluginManager().registerEvents(new MobDrops(),this);
        getServer().getPluginManager().registerEvents(new VillagerBlock(), this);
        getServer().getPluginManager().registerEvents(new useEndPassHandler(), this);
        getServer().getPluginManager().registerEvents(new DisableCraftings(),this);
        getServer().getPluginManager().registerEvents(new breakBlockHandler(),this);
        SkeletonSkull.register();
        Beacon.register();
        MendingBook.register();
        EndPass.register();
        AncientMud.register();
        DiamondScrap.register();
        EndStar.register();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        SkeletonSkull.unregister();
        Beacon.unregister();
        MendingBook.unregister();
        EndPass.unregister();
    }
}
