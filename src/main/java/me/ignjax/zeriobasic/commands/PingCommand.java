package me.ignjax.zeriobasic.commands;

import me.ignjax.zeriobasic.util.ChatUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;

public class PingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)){
            commandSender.sendMessage("WELL, CONSOLE PING IS ALWAYS 0.");
            return false;
        }
        Player player = (Player) commandSender;
        player.sendMessage(ChatUtil.Chat("&f" + player.getDisplayName() + "&e's Ping: &c" + pingPlayer(player)));
        return false;
    }

    /**
     * Neat little class to get a player's ping without using NMS
     *
     * @see "https://bukkit.org/threads/get-players-ping.337634/"
     */
    public int pingPlayer(Player who) {
        try {
            String bukkitversion = Bukkit.getServer().getClass().getPackage()
                    .getName().substring(23);
            Class<?> craftPlayer = Class.forName("org.bukkit.craftbukkit."
                    + bukkitversion + ".entity.CraftPlayer");
            Object handle = craftPlayer.getMethod("getHandle").invoke(who);
            Integer ping = (Integer) handle.getClass().getDeclaredField("ping").get(handle);
            return ping.intValue();
        } catch (ClassNotFoundException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException
                | NoSuchFieldException e) {
            return -1;
        }
    }
}
