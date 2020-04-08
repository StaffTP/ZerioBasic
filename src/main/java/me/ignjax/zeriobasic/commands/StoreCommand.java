package me.ignjax.zeriobasic.commands;

import me.ignjax.zeriobasic.util.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StoreCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if(sender instanceof Player){
            Player p = (Player) sender;
            p.sendMessage(ChatUtil.Chat("&7You can purchase a rank of exclusive items at our store: &9store.zeriopvp.com"));

        }


        return true;
    }

}
