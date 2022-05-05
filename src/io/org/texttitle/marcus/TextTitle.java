package io.org.texttitle.marcus;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import io.org.texttitle.marcus.text.ActionBar;
import io.org.texttitle.marcus.text.TitleMarcus;
import net.md_5.bungee.api.ChatColor;

public class TextTitle extends JavaPlugin{
public static Plugin plugin;

     @Override
     public void onEnable() {
    	 plugin = this;
    	 TitleMarcus.plugin = this;
    	 
PluginDescriptionFile pdf = plugin.getDescription();
    	 if(ActionBar.nmsver.equalsIgnoreCase("v1_8_R1") || ActionBar.nmsver.startsWith("v1_7_")) {
    		 ActionBar.useOldMethods = true;
    	 }
    	 Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "-------------------------------");
    	 Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Name:" + ChatColor.YELLOW + pdf.getName());
    	 Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Version:" + ChatColor.YELLOW + pdf.getVersion());
    	 Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Author:" + ChatColor.YELLOW + "BlackMarcus");
    	 Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Website:" + ChatColor.YELLOW + pdf.getWebsite());
    	 Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "-------------------------------");
     }
}
