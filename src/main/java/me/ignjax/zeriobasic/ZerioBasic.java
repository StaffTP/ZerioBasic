package me.ignjax.zeriobasic;

import me.ignjax.zeriobasic.commands.DiscordCommand;
import me.ignjax.zeriobasic.commands.ForumsCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class ZerioBasic extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("discord").setExecutor(new DiscordCommand());
        getCommand("forums").setExecutor(new ForumsCommand());
    }
}
