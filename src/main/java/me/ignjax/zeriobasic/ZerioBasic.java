package me.ignjax.zeriobasic;

import me.ignjax.zeriobasic.commands.DiscordCommand;
import me.ignjax.zeriobasic.commands.ForumsCommand;
import me.ignjax.zeriobasic.commands.PingCommand;
import me.ignjax.zeriobasic.commands.StoreCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class ZerioBasic extends JavaPlugin {

    @Override
    public void onEnable() {

        registerCommands();
        registerListeners();
    }

    public void registerCommands(){

        getCommand("store").setExecutor(new StoreCommand());
        getCommand("ping").setExecutor(new PingCommand());
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("forums").setExecutor(new ForumsCommand());
    }

    public void registerListeners(){
        // planning on adding some kitmap addons in here instead of separate plugins

    }
}
