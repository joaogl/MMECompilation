package me.joaogl.regions;

import me.joaogl.compilation.Main;
import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.sk89q.worldguard.protection.regions.ProtectedRegion;

public class Comprar {

	static World world = Bukkit.getServer().getWorld("world");
	static int price = 50000;

	public static void ComprarPlots(Player player, String plot) {
		if (Main.econ.getBalance(player.getName()) >= PlotList.PlotPrice) {
			Main.econ.withdrawPlayer(player.getName(), PlotList.PlotPrice);
		} else {
			if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
				player.sendMessage(ChatColor.RED + "[PLOT] Nao tem dinheiro suficiente.");
			} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
				player.sendMessage(ChatColor.RED + "[PLOT] You dont have enough money.");
			} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
				player.sendMessage(ChatColor.RED + "[Grundstuck] Sie haben nicht genug Geld.");
			} else Files.LangError(player);
		}
	}

	public static void ComprarPlotsss(Player player, String whateverrr) {
		/*
		 * if (PlotPlayerFiles.loadConfiguration(whateverrr) != null) { if
		 * (PlotPlayerFiles.loadConfiguration(whateverrr) == null ||
		 * PlotPlayerFiles
		 * .loadConfiguration(whateverrr).equalsIgnoreCase("none")) { if
		 * (PlotPlayerFiles.loadConfiguration(player.getName()) == null) { if
		 * (Main.econ.getBalance(player.getName()) >= price) {
		 * Main.econ.withdrawPlayer(player.getName(), price); ProtectedRegion
		 * plot = Main.getProtectedRegion(world, "P" + whateverrr);
		 * Main.addMember(plot, player); } else { if
		 * (IdManager.getLang(IdManager
		 * .getId(player.getName())).equalsIgnoreCase("pt")) {
		 * player.sendMessage("Nao tem dinheiro suficiente."); } else if
		 * (IdManager
		 * .getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
		 * player.sendMessage("You don't have enough."); } else if
		 * (IdManager.getLang
		 * (IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
		 * player.sendMessage("Sie haben nicht genug Geld."); } else
		 * Files.LangError(player); } } else { if
		 * (IdManager.getLang(IdManager.getId
		 * (player.getName())).equalsIgnoreCase("pt")) {
		 * player.sendMessage("Ja tem um plot."); } else if
		 * (IdManager.getLang(IdManager
		 * .getId(player.getName())).equalsIgnoreCase("en")) {
		 * player.sendMessage("You already have a plot."); } else if
		 * (IdManager.getLang
		 * (IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
		 * player.sendMessage("Sie haben bereits ein Grundstuck."); } else
		 * Files.LangError(player); } } else { if
		 * (IdManager.getLang(IdManager.getId
		 * (player.getName())).equalsIgnoreCase("pt")) {
		 * player.sendMessage("Plot ocupado."); } else if
		 * (IdManager.getLang(IdManager
		 * .getId(player.getName())).equalsIgnoreCase("en")) {
		 * player.sendMessage("Plot is not empty."); } else if
		 * (IdManager.getLang
		 * (IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
		 * player.sendMessage("Zeichnen beschaftigt."); } else
		 * Files.LangError(player); } }
		 */
	}

	public static void ComprarShop(Player player, String whateverrr) {

	}

}