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

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public final class PlayerHelp {

	public static void ajuda(Player player, String[] args) {
		String whatever = null;
		if (args.length == 1) {
			whatever = args[0];
			if (whatever.equalsIgnoreCase("comandos")) {
				player.sendMessage(ChatColor.RED + "=============== COMANDOS MME ==================");
				player.sendMessage(ChatColor.GREEN + "/dinheiro Para ver comandos relacionados com dinheiro.");
				player.sendMessage(ChatColor.GREEN + "/geral Para ver comandos Gerais.");
				player.sendMessage(ChatColor.GREEN + "/chome Para ver os comandos de home.");
				player.sendMessage(ChatColor.GREEN + "/teleporte Para ver os comandos de Teleporte.");
				player.sendMessage(ChatColor.GREEN + "/conta Para ver os comandos para mexer na sua conta.");
				if (player.hasPermission("mod.com")) {
					player.sendMessage(ChatColor.GREEN + "Escreve /mod para veres os comandos de Mod.");
				}
				if (player.hasPermission("vip.com")) {
					player.sendMessage(ChatColor.GREEN + "Escreve /vip para veres os comandos de Vip.");
				}
				player.sendMessage(ChatColor.RED + "===================================" + "============");
			} else if (whatever.equalsIgnoreCase("regras")) {
				player.sendMessage(ChatColor.RED + "============== REGRAS MME ================");
				player.sendMessage(ChatColor.GREEN + "Proibido usar Mods/cheats.");
				player.sendMessage(ChatColor.GREEN + "Proibido pedir itens a uma administrador/moderador.");
				player.sendMessage(ChatColor.GREEN + "Proibido ter lojas fora dos locais pagos(lojas e feira).");
				player.sendMessage(ChatColor.GREEN + "Proibido fazer publicidade.");
				player.sendMessage(ChatColor.GREEN + "Proibido fazer construcoes perto do spam do freebuild.");
				player.sendMessage(ChatColor.GREEN + "Proibido utilizar exprecoes racistas.");
				player.sendMessage(ChatColor.GREEN + "Proibido insultar players sejam mods players ou admins.");
				player.sendMessage(ChatColor.GREEN + "Vá a http://www.mastermine.eu/index.php/regras/ para saber");
				player.sendMessage(ChatColor.GREEN + "mais regras.");
				player.sendMessage(ChatColor.RED + "=========================================");
			} else if (whatever.equalsIgnoreCase("novato")) {
				player.sendMessage(ChatColor.RED + "=============== NOVATO MME ===================");
				player.sendMessage(ChatColor.GREEN + "Para adequirir um plot basta ir a uma cidade");
				player.sendMessage(ChatColor.GREEN + "escolher um plot e voltar para o spawn onde");
				player.sendMessage(ChatColor.GREEN + "no piso 0 tem uma sala com todos os plots");
				player.sendMessage(ChatColor.GREEN + "ou fazer /warp comprar clique na placa do plot");
				player.sendMessage(ChatColor.GREEN + "que quer tem que dizer [BuyRegion] senao quer");
				player.sendMessage(ChatColor.GREEN + "dizer que ja foi comprado e ja esta!");
				player.sendMessage(ChatColor.GREEN + "O mesmo se aplica para lojas.");
				player.sendMessage(ChatColor.GREEN + "Para adequirir material escreva /warp freebuild ATENCAO PVP LIGADO.");
				player.sendMessage(ChatColor.GREEN + "Para comprar animais escreva /warp lojaadmin.");
				player.sendMessage(ChatColor.GREEN + "Para visitar um plot escreva /warp p[nºplot].");
				player.sendMessage(ChatColor.GREEN + "Para comprar comida /warp mac.");
				player.sendMessage(ChatColor.GREEN + "Para fazer uma home escreva /sethome 1 (max. 3 homes).");
				player.sendMessage(ChatColor.GREEN + "Para sair da cidade /warp freebuild ATENCAO PVP LIGADO.");
				player.sendMessage(ChatColor.GREEN + "Para vender itens ao servidor /warp mercado.");
				player.sendMessage(ChatColor.RED + "==============================================");
			} else if (whatever.equalsIgnoreCase("dinheiro")) {
				player.sendMessage(ChatColor.RED + "=================== DINHEIRO MME ===================");
				player.sendMessage(ChatColor.GREEN + "/bal ou /balance Para ver a sua conta bancaria.");
				player.sendMessage(ChatColor.GREEN + "/baltop ou /balancetop Para ver os jogadores mais ricos da MME.");
				player.sendMessage(ChatColor.GREEN + "/pay Para pagar a alguem.");
				player.sendMessage(ChatColor.GREEN + "/ajuda teleporte Para ver os comandos de Teleporte.");
				player.sendMessage(ChatColor.GREEN + "/ajuda conta Para ver os comandos para mexer na sua conta.");
				if (player.hasPermission("adm.me")) {
					player.sendMessage(ChatColor.GREEN + "Escreve /eco para veres os comandos de Dinheiro.");
				}
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else if (whatever.equalsIgnoreCase("geral")) {
				player.sendMessage(ChatColor.RED + "================== GERAL MME ====================");
				player.sendMessage(ChatColor.GREEN + "/ignore Caso queira ignorar um player.");
				player.sendMessage(ChatColor.GREEN + "/list Para ver os players online.");
				player.sendMessage(ChatColor.GREEN + "/me Para escrever algo como se foce uma acao.");
				player.sendMessage(ChatColor.GREEN + "/ajuda teleporte Para ver os comandos de Teleporte.");
				player.sendMessage(ChatColor.GREEN + "/ajuda conta Para ver os comandos para mexer na sua conta.");
				player.sendMessage(ChatColor.GREEN + "/msg Para enviar mensagem privada para alguem.");
				player.sendMessage(ChatColor.GREEN + "/suicide Para se matar.");
				if (player.hasPermission("vip.com")) {
					player.sendMessage(ChatColor.GREEN + "/nick Para mudar o seu nome.");
					player.sendMessage(ChatColor.GREEN + "/realname Repor o seu nome de origem.");
					player.sendMessage(ChatColor.GREEN + "/reply Resposta rapida ao msg.");
					player.sendMessage(ChatColor.GREEN + "/afk Para informar esta nao esta no jogo.");
				}
				player.sendMessage(ChatColor.RED + "=================================================");
			} else if (whatever.equalsIgnoreCase("conta")) {
				player.sendMessage(ChatColor.RED + "============== CONTA MME ==================");
				player.sendMessage(ChatColor.GREEN + "/changepassword Para mudar a sua password.");
				player.sendMessage(ChatColor.GREEN + "/logout Para fazer o logout.");
				player.sendMessage(ChatColor.RED + "===========================================");
			} else if (whatever.equalsIgnoreCase("home")) {
				player.sendMessage(ChatColor.RED + "=============== HOME MME ==================");
				player.sendMessage(ChatColor.GREEN + "/sethome Para defenir o Teleporte para sua casa.");
				player.sendMessage(ChatColor.GREEN + "/home Para ir para sua casa.");
				player.sendMessage(ChatColor.GREEN + "/delhome Para apagar o Teleporte para sua casa.");
				player.sendMessage(ChatColor.RED + "===========================================");
			} else if (whatever.equalsIgnoreCase("teleporte")) {
				player.sendMessage(ChatColor.RED + "============== TELEPORTE MME ==================");
				player.sendMessage(ChatColor.GREEN + "/tpa Para se teleportar para alguem");
				player.sendMessage(ChatColor.GREEN + "/tpaccept Para aceitar o pedido de Teleporte");
				player.sendMessage(ChatColor.GREEN + "/tpdeny Para recusar o pedido de Teleporte.");
				player.sendMessage(ChatColor.GREEN + "/warp Para se teleportar para sertos pontos do mapa.");
				if (player.hasPermission("vip.com")) {
					player.sendMessage(ChatColor.GREEN + "/tpahere Para teleportar alguem ate si");
				}
				if (player.hasPermission("mod.com")) {
					player.sendMessage(ChatColor.GREEN + "/tp Para se teleportar para alguem");
					player.sendMessage(ChatColor.GREEN + "/tphere Para teleportar alguem ate si");
				}
				player.sendMessage(ChatColor.RED + "===============================================");
			} else {
				player.sendMessage(ChatColor.RED + "============ AJUDA MME ================");
				player.sendMessage(ChatColor.GREEN + "/ajuda regras - Regras do servidor");
				player.sendMessage(ChatColor.GREEN + "/ajuda novato - Ajuda para iniciantes");
				player.sendMessage(ChatColor.GREEN + "/ajuda comandos - Comandos do servidor");
				player.sendMessage(ChatColor.GREEN + "/ajuda ajuda - Comandos de ajuda");
				player.sendMessage(ChatColor.GREEN + "/creditos - Veja dos Creditos do servidor");
				player.sendMessage(ChatColor.GREEN + "/site - Links dos sites MME.");
				player.sendMessage(ChatColor.GREEN + "/server - Servidores da MME.");
				player.sendMessage(ChatColor.RED + "======================================");
			}
		} else {
			player.sendMessage(ChatColor.RED + "============ AJUDA MME ================");
			player.sendMessage(ChatColor.GREEN + "/ajuda regras - Regras do servidor");
			player.sendMessage(ChatColor.GREEN + "/ajuda novato - Ajuda para iniciantes");
			player.sendMessage(ChatColor.GREEN + "/ajuda comandos - Comandos do servidor");
			player.sendMessage(ChatColor.GREEN + "/ajuda ajuda - Comandos de ajuda");
			player.sendMessage(ChatColor.GREEN + "/creditos - Veja dos Creditos do servidor");
			player.sendMessage(ChatColor.GREEN + "/site - Links dos sites MME.");
			player.sendMessage(ChatColor.GREEN + "/server - Servidores da MME.");
			player.sendMessage(ChatColor.RED + "======================================");
		}
		
	}

	public static void creditos(Player player){
		player.sendMessage(ChatColor.RED + "============== CREDITOS MME ================");
		player.sendMessage(ChatColor.GREEN + "Admins da MME: Joaogl, DarkMaster,");
		player.sendMessage(ChatColor.GREEN + "GameMaster.");
		player.sendMessage(ChatColor.GREEN + "Plugins por: Joaogl.");
		player.sendMessage(ChatColor.RED + "===========================================");		
	}
	
	public static void site(Player player){
		player.sendMessage(ChatColor.RED + "================== SITE MME ====================");
		player.sendMessage(ChatColor.GREEN + "Site do Minecraft da MME:");
		player.sendMessage(ChatColor.GREEN + "http://www.mastermine.eu/");
		player.sendMessage(ChatColor.RED + "===============================================");	
	}
	
	public static void servers(Player player){
		player.sendMessage(ChatColor.RED + "============= Servidores MME ================");
		player.sendMessage(ChatColor.GREEN + "Digital PaintaBall2:");
		player.sendMessage(ChatColor.GREEN + "Nome na Lista: ~~~~ [MME] [Speed]");
		player.sendMessage(ChatColor.GREEN + "Nome na Lista: ~~~~ [MME] [Jump]");
		player.sendMessage(ChatColor.GREEN + "Nome na Lista: ~~~~ [MME] [Airtime]");
		player.sendMessage(ChatColor.GREEN + "Nome na Lista: ~~~~ [MME] [Soccer]");
		player.sendMessage(ChatColor.GREEN + "Minecraft:");
		player.sendMessage(ChatColor.GREEN + "Survival: mine.mastermine.eu");
		player.sendMessage(ChatColor.GREEN + "HungerGames: mine.mastermine.eu:25564");
		player.sendMessage(ChatColor.GREEN + "TeamSpeak2:");
		player.sendMessage(ChatColor.GREEN + "ts.mastermine.eu");
		player.sendMessage(ChatColor.RED + "============================================");
	}
}