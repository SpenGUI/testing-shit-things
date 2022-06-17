package me.spengui.secondplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

///i dont know why, i dont now how, i dont wanna know but why the fuck is uploading to github so fucking hard
/// you have to open git cmd, WHY THE FUCK DO I AHVE TO DO THAT. I KNOW NO ONE IS SEEING THIS BUT

public final class SecondPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

 public boolean onCommand(CommandSender sender, Command command, String lable, String[] args){

        //when command is ran server tps and sendes the info to the player
     if (command.getName().equalsIgnoreCase( "kit")){


         if (sender instanceof Player){

             Player p = (Player) sender;

             p.sendMessage(ChatColor.RED + "You have been given a kit");

         }
     }
     return true;
    }

}
