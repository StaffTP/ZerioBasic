package me.ignjax.zeriobasic.commands;

import me.ignjax.zeriobasic.util.ChatUtil;
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


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("discord")) {
            sender.sendMessage(ChatUtil.Chat("&7You can join our discord at &9discord.zeriopvp.com"));
        }
        return true;
    }
}
