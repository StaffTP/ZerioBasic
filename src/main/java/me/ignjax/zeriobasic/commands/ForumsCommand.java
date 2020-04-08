package me.ignjax.zeriobasic.commands;

import me.ignjax.zeriobasic.util.ChatUtil;
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

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("forums")) {
            sender.sendMessage(ChatUtil.Chat("&7You can check out our forums at &9forums.zeriopvp.com"));
        }
        return true;
    }
}
