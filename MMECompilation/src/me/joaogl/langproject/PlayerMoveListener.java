/**
 * This file is part of MMECompilation.

    MMECompilation is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    MMECompilation is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with MMECompilation.  If not, see <http://www.gnu.org/licenses/>.
 */

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