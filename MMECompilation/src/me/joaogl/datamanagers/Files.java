package me.joaogl.datamanagers;

import java.util.Properties;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Files {
	static Properties properties = new Properties();
	public static boolean Linux = false;
	public static String Linuxdir = "/home/minecraft/mine/JoaoglPlugins";
	public static String windowsdir = "C:/Users/Joao Lourenco/Desktop/MineCraft Server/JoaoglPlugin";
	//public static String windowsdir = "C:/Users/joaogl/Desktop/MineCraft Server/JoaoglPlugin";

	public static void LangError(Player player) {
		player.sendMessage(ChatColor.RED + "Escreva /lingua.");
		player.sendMessage(ChatColor.RED + "Type /setlanguage.");
		player.sendMessage(ChatColor.RED + "Schreiben /sprache.");
	}

}