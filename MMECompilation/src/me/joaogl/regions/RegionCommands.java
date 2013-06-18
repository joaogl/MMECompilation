package me.joaogl.regions;

import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.entity.Player;

public class RegionCommands {
	public static String whatever;
	public static String whateverr;
	public static String whateverrr;

	public static void mme(Player player, String[] args) {
		if (args.length >= 1) {
			if (args.length == 1) {
				whatever = args[0];
			} else if (args.length == 2) {
				whatever = args[0];
				whateverr = args[1];
			} else if (args.length == 3) {
				whatever = args[0];
				whateverr = args[1];
				whateverrr = args[2];
			}
			if (whatever.equalsIgnoreCase("vender") || whatever.equalsIgnoreCase("sell") || whatever.equalsIgnoreCase("verkaufen")) {
				vender(player, whateverr, whateverrr);
			} else if (whatever.equalsIgnoreCase("comprar") || whatever.equalsIgnoreCase("buy") || whatever.equalsIgnoreCase("kaufen")) {
				comprar(player, whateverr, whateverrr);
			} else if (whatever.equalsIgnoreCase("vendera") || whatever.equalsIgnoreCase("sellto") || whatever.equalsIgnoreCase("Verkauf")) {
				vendera(player, whateverr, whateverrr);
			} else if (whatever.equalsIgnoreCase("aceitar") || whatever.equalsIgnoreCase("accept") || whatever.equalsIgnoreCase("akzeptieren")) {
				aceitar(player, whateverr, whateverrr);
			} else if (whatever.equalsIgnoreCase("tirar") || whatever.equalsIgnoreCase("take") || whatever.equalsIgnoreCase("entfernen")) {
				tirar(player, whateverr, whateverrr);
			} else if (whatever.equalsIgnoreCase("reembolsar") || whatever.equalsIgnoreCase("repay") || whatever.equalsIgnoreCase("zurückzahlen")) {
				reembolcar(player, whateverr, whateverrr);
			} else {
				if (IdManager.getLang(IdManager.getId(player.getName())) != null) {
					if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
						player.sendMessage("Type: /mme sell or buy or sellto or accept or take or repay.");
					} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
						player.sendMessage("Escreve: /mme vender or comprar or vendera or accept or tirar or reembolsar.");
					} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
						player.sendMessage("Schreiben: / mme kaufen oder zu verkaufen oder verkauft oder annehmen und tatigen oder zuruckzuzahlen.");
					}
				} else Files.LangError(player);
			}
		} else {
			if (IdManager.getLang(IdManager.getId(player.getName())) != null) {
				if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
					player.sendMessage("Type: /mme sell or buy or sellto or accept or take or repay.");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
					player.sendMessage("Escreve: /mme vender or comprar or vendera or accept or tirar or reembolsar.");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
					player.sendMessage("Schreiben: / mme kaufen oder zu verkaufen oder verkauft oder annehmen und tatigen oder zuruckzuzahlen.");
				} else Files.LangError(player);
			} else Files.LangError(player);
		}
	}

	public static void vender(Player player, String whateverr, String whateverrr) {
	}

	public static void comprar(Player player, String whateverr, String whateverrr) {
		if (whateverr != null) {
			if (whateverr.equalsIgnoreCase("plot")) {
				if (whateverrr != null) {
					Comprar.ComprarPlotsss(player, whateverrr);
				} else {
					if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
						player.sendMessage("Escreve: /mme comprar [shop ou plot] [numero].");
					} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
						player.sendMessage("Type: /mme buy [shop or plot] [number].");
					} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
						player.sendMessage("Schreibt / mme kaufen [shop oder Grundstuck] [Zahl].");
					} else Files.LangError(player);
				}
			} else if (whateverr.equalsIgnoreCase("shop")) {
				if (whateverrr != null) {
					Comprar.ComprarPlotsss(player, whateverrr);
				} else {
					if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
						player.sendMessage("Escreve: /mme comprar [shop ou plot] [numero].");
					} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
						player.sendMessage("Type: /mme buy [shop or plot] [number].");
					} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
						player.sendMessage("Schreibt / mme kaufen [shop oder Grundstuck] [Zahl].");
					} else Files.LangError(player);
				}
			} else {
				if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
					player.sendMessage("Escreve: /mme comprar [shop ou plot] [numero].");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
					player.sendMessage("Type: /mme buy [shop or plot] [number].");
				} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
					player.sendMessage("Schreibt / mme kaufen [shop oder Grundstuck] [Zahl].");
				} else Files.LangError(player);
			}
		} else {
			if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
				player.sendMessage("Escreve: /mme comprar [shop ou plot] [numero].");
			} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {
				player.sendMessage("Type: /mme buy [shop or plot] [number].");
			} else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {
				player.sendMessage("Schreibt / mme kaufen [shop oder Grundstuck] [Zahl].");
			} else Files.LangError(player);
		}
	}

	public static void vendera(Player player, String whateverr, String whateverrr) {

	}

	public static void aceitar(Player player, String whateverr, String whateverrr) {

	}

	public static void tirar(Player player, String whateverr, String whateverrr) {

	}

	public static void reembolcar(Player player, String whateverr, String whateverrr) {

	}
	/*
	 * { if (player.isOp() || player.hasPermission("event.comandos")) {
	 * player.sendMessage(ChatColor.RED +
	 * "=================== Ajuda Eventos ====================");
	 * player.sendMessage(ChatColor.GREEN +
	 * "Primeiro os Admins devem defenir o tipo de evento, premio e a localizacao."
	 * ); player.sendMessage(ChatColor.GREEN +
	 * "Usando os comandos /e(vento) e /p(remio) e /de(fenir).");
	 * player.sendMessage(ChatColor.GREEN +
	 * "Com isto feito devera fazer /an(nuncio).");
	 * player.sendMessage(ChatColor.GREEN +
	 * "Apos isto tudo estar pronto devera fazer /ab(rir)");
	 * player.sendMessage(ChatColor.GREEN +
	 * "Agora para fechar as inscricoes basta fazer /fe(char).");
	 * player.sendMessage(ChatColor.GREEN +
	 * "No caso do Spleef deve fazer /re(grasevento)");
	 * player.sendMessage(ChatColor.GREEN +
	 * "Depois fazer a contagem decrescente com /comecar.");
	 * player.sendMessage(ChatColor.GREEN +
	 * "No fim do evento fazer /ve(encedor) E /fim para acabar tudo.");
	 * player.sendMessage(ChatColor.RED +
	 * "====================================================="); } else {
	 * PermissionDeny(player); }
	 */

}