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

package me.joaogl.help;

import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ModHelp {

	public static void mod(Player player, String[] args) {
		String whatever;
		if (args.length == 1) {
			whatever = args[0];
			if (whatever.equalsIgnoreCase("novo")) {
				if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
					player.sendMessage(ChatColor.RED + "================ Como Ser Moderador ==================");
					player.sendMessage(ChatColor.GREEN + "REQUISITOS:");
					player.sendMessage(ChatColor.GREEN + "Ser muito activo no Servidor e Forum.");
					player.sendMessage(ChatColor.GREEN + "Ter TeamSpeak");
					player.sendMessage(ChatColor.GREEN + "O QUE FAZER:");
					player.sendMessage(ChatColor.GREEN + "Ir ao forum e postar uma candidatura de acordo");
					player.sendMessage(ChatColor.GREEN + "com o formulario para que seja ponderada numa reuniao.");
					player.sendMessage(ChatColor.RED + "=====================================================");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
					player.sendMessage(ChatColor.RED + "================ How To Be Moderator ==================");
					player.sendMessage(ChatColor.GREEN + "DETAILS:");
					player.sendMessage(ChatColor.GREEN + "Being very active in the Server and Forum.");
					player.sendMessage(ChatColor.GREEN + "Having TeamSpeak.");
					player.sendMessage(ChatColor.GREEN + "WHAT TO DO:");
					player.sendMessage(ChatColor.GREEN + "Go to the forum and post an application in accordance");
					player.sendMessage(ChatColor.GREEN + "with the form to be considered in a meeting.");
					player.sendMessage(ChatColor.RED + "=====================================================");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
					player.sendMessage(ChatColor.RED + "================ Como Ser Moderador ==================");
					player.sendMessage(ChatColor.GREEN + "DETAILS:");
					player.sendMessage(ChatColor.GREEN + "Als sehr aktiv in der Server und Forum.");
					player.sendMessage(ChatColor.GREEN + "Mit TeamSpeak.");
					player.sendMessage(ChatColor.GREEN + "WAS IST ZU TUN:");
					player.sendMessage(ChatColor.GREEN + "Zum Forum und verfassen einen Antrag im Einklang mit dem");
					player.sendMessage(ChatColor.GREEN + "Formular, um bei einem Treffen in Betracht gezogen werden.");
					player.sendMessage(ChatColor.RED + "=====================================================");
				} else Files.LangError(player);
			} else {
				if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
					player.sendMessage(ChatColor.RED + "================== Moderador =========================");
					player.sendMessage(ChatColor.GREEN + "Escreve /mod novo para veres como te tornar Mod.");
					if (player.hasPermission("mod.com")) {
						player.sendMessage(ChatColor.GREEN + "Escreve /mod comandos para veres os comandos de Mod.");
					}
					player.sendMessage(ChatColor.RED + "=====================================================");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
					player.sendMessage(ChatColor.RED + "================== Moderator =========================");
					player.sendMessage(ChatColor.GREEN + "Type /mod again to see how you make Mod.");
					if (player.hasPermission("mod.com")) {
						player.sendMessage(ChatColor.GREEN + "Type /mod command to view the commands Mod.");
					}
					player.sendMessage(ChatColor.RED + "=====================================================");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
					player.sendMessage(ChatColor.RED + "================== Moderator =========================");
					player.sendMessage(ChatColor.GREEN + "Schreiben / mod wieder zu sehen, wie Sie Mod machen.");
					if (player.hasPermission("mod.com")) {
						player.sendMessage(ChatColor.GREEN + "Schreiben /mod Befehl, um die Befehle Mod sehen.");
					}
					player.sendMessage(ChatColor.RED + "=====================================================");
				} else Files.LangError(player);
			}
		} else {
			if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
				player.sendMessage(ChatColor.RED + "================== Moderador =========================");
				player.sendMessage(ChatColor.GREEN + "Escreve /mod novo para veres como te tornar Mod.");
				if (player.hasPermission("mod.com")) {
					player.sendMessage(ChatColor.GREEN + "Escreve /mod comandos para veres os comandos de Mod.");
				}
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
				player.sendMessage(ChatColor.RED + "================== Moderator =========================");
				player.sendMessage(ChatColor.GREEN + "Type /mod again to see how you make Mod.");
				if (player.hasPermission("mod.com")) {
					player.sendMessage(ChatColor.GREEN + "Type /mod command to view the commands Mod.");
				}
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
				player.sendMessage(ChatColor.RED + "================== Moderator =========================");
				player.sendMessage(ChatColor.GREEN + "Schreiben / mod wieder zu sehen, wie Sie Mod machen.");
				if (player.hasPermission("mod.com")) {
					player.sendMessage(ChatColor.GREEN + "Schreiben /mod Befehl, um die Befehle Mod sehen.");
				}
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else Files.LangError(player);
		}
	}

	public static void modcomandos(Player player, String[] args) {
		String whatever;
		if (args.length == 1) {
			whatever = args[0];
			if (whatever.equalsIgnoreCase("1")) {
				if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
					if (player.hasPermission("mod.com")) {
						player.sendMessage(ChatColor.RED + "=================== Moderador =======================");
						player.sendMessage(ChatColor.GREEN + "/kick [nome] [rasao].");
						player.sendMessage(ChatColor.GREEN + "/ban [nome] [tempo em segundos].");
						player.sendMessage(ChatColor.GREEN + "/jail [nome] [1-2] [tempo em segundos].");
						player.sendMessage(ChatColor.RED + "=====================================================");
					} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
						if (player.hasPermission("mod.com")) {
							player.sendMessage(ChatColor.RED + "=================== Moderator =======================");
							player.sendMessage(ChatColor.GREEN + "/kick [name] [reason].");
							player.sendMessage(ChatColor.GREEN + "/ban [name] [time in secounds].");
							player.sendMessage(ChatColor.GREEN + "/jail [name] [1-2] [time in secounds].");
							player.sendMessage(ChatColor.RED + "=====================================================");
						} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
							if (player.hasPermission("mod.com")) {
								player.sendMessage(ChatColor.RED + "=================== Moderator =======================");
								player.sendMessage(ChatColor.GREEN + "/kick [name] [Grund].");
								player.sendMessage(ChatColor.GREEN + "/ban [name] [Zeit in Sekunden].");
								player.sendMessage(ChatColor.GREEN + "/jail [name] [1-2] [Zeit in Sekunden].");
								player.sendMessage(ChatColor.RED + "=====================================================");
							} else player.sendMessage("Nao permissoes para este comando!");
						} else Files.LangError(player);
					} else if (whatever.equalsIgnoreCase("2")) {
						if (player.hasPermission("mod.com")) {
							player.sendMessage(ChatColor.RED + "=================== Moderador =======================");
							player.sendMessage(ChatColor.GREEN + "/tp [nome_do_player]  Para te teleportares ate alguem.");
							player.sendMessage(ChatColor.GREEN + "/tphere [nome_do_player]  Para teleportares alguem ate ti.");
							player.sendMessage(ChatColor.GREEN + "/broadcast Para enviares uma mensagem por BroadCast.");
							player.sendMessage(ChatColor.GREEN + "/seen Para ver ha quanto tempo o player esta sem vir ao jogo.");
							player.sendMessage(ChatColor.RED + "=====================================================");
						} else player.sendMessage("Nao permissoes para este comando!");
					} else {
						player.sendMessage(ChatColor.RED + "===================== Moderador =====================");
						player.sendMessage(ChatColor.GREEN + "/modcomandos 1 - Dar Ban/Kick/Jail.");
						player.sendMessage(ChatColor.GREEN + "/modcomandos 2 - Comandos Gerais.");
						player.sendMessage(ChatColor.RED + "=====================================================");
					}
				} else {
					player.sendMessage(ChatColor.RED + "===================== Moderador =====================");
					player.sendMessage(ChatColor.GREEN + "/modcomandos 1 - Dar Ban/Kick/Jail.");
					player.sendMessage(ChatColor.GREEN + "/mod2 - Comandos Gerais.");
					player.sendMessage(ChatColor.RED + "=====================================================");
				}
			}
		}
	}
}