package me.joaogl.dispenserrefill;

import java.util.logging.Logger;

import me.joaogl.compilation.Main;
import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Dispenser;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.ItemStack;

public class DispenserRefill implements Listener {
	public Main plugin;
	public static Logger logger;

	@EventHandler
	public void onDispense(BlockDispenseEvent e) {
		if (!(e.isCancelled())) {
			Material a = e.getBlock().getLocation().getWorld().getBlockAt(e.getBlock().getX() + 1, e.getBlock().getY(), e.getBlock().getZ()).getType();
			if (a == Material.WALL_SIGN) {
				Sign sign = (Sign) e.getBlock().getLocation().getWorld().getBlockAt(e.getBlock().getX() + 1, e.getBlock().getY(), e.getBlock().getZ()).getState();
				if (sign.getLine(0).equals("[1]") && sign.getLine(1).equals("IlImItadO") && sign.getLine(2).equals("JooAgL") && sign.getLine(3).equals("DLsPSnsSr")) {
					Dispenser dispenser = (Dispenser) e.getBlock().getState();
					ItemStack drop = e.getItem().clone();
					dispenser.getInventory().addItem(drop);
				}
			}
		}
	}

	@EventHandler
	public void onSignCreate(SignChangeEvent sign) {
		Player player = sign.getPlayer();
		if (player.isOp() || player.hasPermission("dispenser_ilimitado")) {
			if (sign.getLine(0).equalsIgnoreCase("[1]")) {
				sign.setLine(0, "[1]");
				sign.setLine(1, "IlImItadO");
				sign.setLine(2, "JooAgL");
				sign.setLine(3, "DLsPSnsSr");
				if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
					player.sendMessage(ChatColor.RED + "[Dispenser] Ilimitado criado.");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
					player.sendMessage(ChatColor.RED + "[Dispenser] Unlimited has been created.");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
					player.sendMessage(ChatColor.RED + "[Spender] Unlimited produziert.");
				} else Files.LangError(player);
			}
		}
	}
}