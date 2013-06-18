package me.joaogl.langproject;

import me.joaogl.compilation.Main;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerMoveListener implements Listener {

	public static Main plugin;

	public PlayerMoveListener(Main instance) {
		plugin = instance;
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		final Player player = event.getPlayer();
		if (IdManager.getLang(IdManager.getId(player.getName())) != null) {
			if (!(IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt") || IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en") || IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger"))) {
				player.sendMessage(ChatColor.RED + "======================Language=======================");
				player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
				player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
				player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
				player.sendMessage(ChatColor.RED + "=====================================================");
				new Thread(new Runnable() {
					public void run() {
						try {
							Thread.sleep(2000);
							player.sendMessage(ChatColor.RED + "======================Language=======================");
							player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
							player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
							player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
							player.sendMessage(ChatColor.RED + "=====================================================");
							if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("none")) {
								Thread.sleep(2000);
								player.sendMessage(ChatColor.RED + "======================Language=======================");
								player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
								player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
								player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
								player.sendMessage(ChatColor.RED + "=====================================================");
							}
							if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("none")) {
								Thread.sleep(2000);
								player.sendMessage(ChatColor.RED + "======================Language=======================");
								player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
								player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
								player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
								player.sendMessage(ChatColor.RED + "=====================================================");
							}
							if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("none")) {
								Thread.sleep(2000);
								player.sendMessage(ChatColor.RED + "======================Language=======================");
								player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
								player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
								player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
								player.sendMessage(ChatColor.RED + "=====================================================");
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		} else {
			IdManager.saveLang(IdManager.getId(player.getName()), "none");
			FirstTime(player);
		}
	}

	public void FirstTime(final Player player) {
		if (IdManager.getLang(IdManager.getId(player.getName())) != null) {
			if (!(IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt") || IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en") || IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger"))) {
				player.sendMessage(ChatColor.RED + "======================Language=======================");
				player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
				player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
				player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
				player.sendMessage(ChatColor.RED + "=====================================================");
				new Thread(new Runnable() {
					public void run() {
						try {
							Thread.sleep(2000);
							player.sendMessage(ChatColor.RED + "======================Language=======================");
							player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
							player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
							player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
							player.sendMessage(ChatColor.RED + "=====================================================");
							if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("none")) {
								Thread.sleep(2000);
								player.sendMessage(ChatColor.RED + "======================Language=======================");
								player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
								player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
								player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
								player.sendMessage(ChatColor.RED + "=====================================================");
							}
							if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("none")) {
								Thread.sleep(2000);
								player.sendMessage(ChatColor.RED + "======================Language=======================");
								player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
								player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
								player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
								player.sendMessage(ChatColor.RED + "=====================================================");
							}
							if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("none")) {
								Thread.sleep(2000);
								player.sendMessage(ChatColor.RED + "======================Language=======================");
								player.sendMessage(ChatColor.RED + "Por favor defina a sua lingua, escreva /lingua pt.");
								player.sendMessage(ChatColor.GREEN + "Please set your language, type /setlanguage en.");
								player.sendMessage(ChatColor.BLUE + "Bitte geben Sie Ihre Sprache, Art /Sprache ger.");
								player.sendMessage(ChatColor.RED + "=====================================================");
							}
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		} else {
			IdManager.saveLang(IdManager.getId(player.getName()), "none");
			FirstTime(player);
		}
	}
}