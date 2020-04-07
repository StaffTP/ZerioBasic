package me.ignjax.zeriobasic.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Project: ZerioBasic
 * Created: 4/7/2020 at 4:26 AM
 * --------------------------------------
 * Copyright © 2020 | ignJax | All rights reserved.
 */
public class ForumsCommand implements CommandExecutor {

    public static String chat(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("forums")) {
            sender.sendMessage(this.chat("&7You can check out our forums at &9forums.zeriopvp.com"));
        }
        return true;
    }
}
