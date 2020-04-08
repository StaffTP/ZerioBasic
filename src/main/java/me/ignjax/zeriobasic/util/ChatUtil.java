package me.ignjax.zeriobasic.util;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class ChatUtil {

    public static String Chat(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static List<String> formatMessages(List<String> messages) {
        List<String> buffered = new ArrayList<>();
        for (String message : messages){
            buffered.add(Chat("&r" + message));
        }
        return buffered;
    }

    public static String capitalizeFirstLetter(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }

}
