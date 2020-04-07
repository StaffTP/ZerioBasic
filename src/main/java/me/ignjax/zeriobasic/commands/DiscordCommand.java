package me.ignjax.zeriobasic.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Project: ZerioBasic
 * Created: 4/7/2020 at 4:17 AM
 * --------------------------------------
 * Copyright © 2020 | ignJax | All rights reserved.
 */
public class DiscordCommand implements CommandExecutor {

    public static String chat(String s) { return ChatColor.translateAlternateColorCodes('&', s); }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("discord")) {
            sender.sendMessage(this.chat("&7You can join our discord at &9discord.zeriopvp.com"));
        }
        return true;
    }
}
