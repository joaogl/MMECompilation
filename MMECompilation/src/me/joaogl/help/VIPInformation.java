package me.joaogl.help;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class VIPInformation {

	public static void vip(Player player, String[] args){
		String whatever;
		if (args.length == 1) {
			whatever = args[0];
			if (whatever.equalsIgnoreCase("comprar")) {
				player.sendMessage(ChatColor.RED + "================== Como Comprar VIP ===================");
				player.sendMessage(ChatColor.GREEN + "Pacotes:");
				player.sendMessage(ChatColor.GREEN + "60 Dias - 4.00€ (11.6 reais)");
				player.sendMessage(ChatColor.GREEN + "120 Dias - 8.00€ (22.14 reais)");
				player.sendMessage(ChatColor.GREEN + "240 Dias - 15.00€ (41.49 reais)");
				player.sendMessage(ChatColor.GREEN + "Entre em: (para saber mais pormenores)");
				player.sendMessage(ChatColor.GREEN + "http://www.mastermine.eu/index.php/comprar-vip");
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else {
				player.sendMessage(ChatColor.RED + "====================== VIP MME ======================");
				player.sendMessage(ChatColor.GREEN + "Pode escrever /vantagens.");
				player.sendMessage(ChatColor.GREEN + "Pode escrever /vip comprar.");
				player.sendMessage(ChatColor.GREEN + "Pode escrever /comandos.");
				player.sendMessage(ChatColor.RED + "=====================================================");
			}
		} else {
			player.sendMessage(ChatColor.RED + "====================== VIP MME ======================");
			player.sendMessage(ChatColor.GREEN + "Pode escrever /vantagens.");
			player.sendMessage(ChatColor.GREEN + "Pode escrever /vip comprar.");
			player.sendMessage(ChatColor.GREEN + "Pode escrever /comandos.");
			player.sendMessage(ChatColor.RED + "=====================================================");
		}
	}

	public static void comandos(Player player, String[] args){
		String whatever;
		if (args.length == 1) {
			whatever = args[0];
			if (whatever.equalsIgnoreCase("1")) {
				player.sendMessage(ChatColor.RED + "=================== Vantagens Vip 1 ===================");
				player.sendMessage(ChatColor.GREEN + "1-Entrar com o Server cheio.");
				player.sendMessage(ChatColor.GREEN + "2-Uma loja sem pagar(chamar administrador ou modlider)");
				player.sendMessage(ChatColor.GREEN + "3-Acesso ao /kit tools.");
				player.sendMessage(ChatColor.GREEN + "4-Acesso ao /kit arqueiro.");
				player.sendMessage(ChatColor.GREEN + "6-Acesso ao /region list");
				player.sendMessage(ChatColor.GREEN + "7-Acesso ao /region addmember e removemember.");
				player.sendMessage(ChatColor.GREEN + "8-Acesso ao comando /back.");
				player.sendMessage(ChatColor.GREEN + "Escreve /vipvantagens 2 para ver mais vantagens.");
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else if (whatever.equalsIgnoreCase("2")) {
				player.sendMessage(ChatColor.RED + "=================== Vantagens Vip 2 ===================");
				player.sendMessage(ChatColor.GREEN + "9-Acesso ao comando /afk");
				player.sendMessage(ChatColor.GREEN + "10-Acesso a ver e enviar e-mails.");
				player.sendMessage(ChatColor.GREEN + "11-Acesso ao comando /me.");
				player.sendMessage(ChatColor.GREEN + "12-Acesso ao comando /nick.");
				player.sendMessage(ChatColor.GREEN + "13-Acesso a criar 100 homes.");
				player.sendMessage(ChatColor.GREEN + "14-Acesso a criar placas de balance, disposal e mail.");
				player.sendMessage(ChatColor.GREEN + "15-Acesso a criar placas com cores.");
				player.sendMessage(ChatColor.GREEN + "Escreve /vipvantagens 3 para ver as restantes vantagens.");
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else if (whatever.equalsIgnoreCase("3")) {
				player.sendMessage(ChatColor.RED + "==================== Vantagens Vip 3 ==================");
				player.sendMessage(ChatColor.GREEN + "16-Acesso ao /compass.");
				player.sendMessage(ChatColor.GREEN + "17-Acesso a troca de plots.");
				player.sendMessage(ChatColor.GREEN + "18-Pode se trocar o bioma do seu plot.");
				player.sendMessage(ChatColor.GREEN + "19-Acesso ao /getpos.");
				player.sendMessage(ChatColor.GREEN + "20-Acesso ao /ignore.");
				player.sendMessage(ChatColor.GREEN + "21-Acesso ao /itemdb.");
				player.sendMessage(ChatColor.GREEN + "22-Acesso ao /bal [outro player].");
				player.sendMessage(ChatColor.GREEN + "Escreve /vipvantagens 4 para ver as restantes vantagens.");
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else if (whatever.equalsIgnoreCase("4")) {
				player.sendMessage(ChatColor.RED + "==================== Vantagens Vip 4 ==================");
				player.sendMessage(ChatColor.GREEN + "24-Acesso ao /time.");
				player.sendMessage(ChatColor.GREEN + "25-Acesso ao /suicide.");
				player.sendMessage(ChatColor.GREEN + "26-Acesso ao /region info.");
				player.sendMessage(ChatColor.GREEN + "27-Acesso ao /ping.");
				player.sendMessage(ChatColor.GREEN + "28-Acesso ao /qs.");
				player.sendMessage(ChatColor.GREEN + "29-Um pack de diamante.");
				player.sendMessage(ChatColor.GREEN + "30-Um pack de esponja.");
				player.sendMessage(ChatColor.GREEN + "Escreve /vipvantagens 5 para ver as restantes vantagens.");
				player.sendMessage(ChatColor.RED + "=====================================================");
			}else if (whatever.equalsIgnoreCase("5")) {
				player.sendMessage(ChatColor.RED + "==================== Vantagens Vip 5 ==================");				
				player.sendMessage(ChatColor.GREEN + "31-Duas cabecas de Skeleton.");
				player.sendMessage(ChatColor.GREEN + "32-Duas cabecas de Wither.");
				player.sendMessage(ChatColor.GREEN + "33-Duas cabecas de Zombie.");
				player.sendMessage(ChatColor.GREEN + "34-Duas cabecas de Steve.");
				player.sendMessage(ChatColor.GREEN + "35-Duas cabecas de Creeper.");
				player.sendMessage(ChatColor.GREEN + "Escreve /vipcomprar para saberes como comprar Vip.");
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else player.sendMessage(ChatColor.GREEN + "Use /vipvantegens [Numero]");
		} else {
			player.sendMessage(ChatColor.RED + "=================== Vantagens Vip 1 ===================");
			player.sendMessage(ChatColor.GREEN + "1-Entrar com o Server cheio.");
			player.sendMessage(ChatColor.GREEN + "2-Acesso ao Mc (MagicCarpet)");
			player.sendMessage(ChatColor.GREEN + "3-Acesso ao /kit tools.");
			player.sendMessage(ChatColor.GREEN + "4-Acesso ao /kit arqueiro.");
			player.sendMessage(ChatColor.GREEN + "5-Acesso aos comandos /tpa e /tpahere.");
			player.sendMessage(ChatColor.GREEN + "6-Acesso ao /region list");
			player.sendMessage(ChatColor.GREEN + "7-Acesso ao /region addmember e removemember.");
			player.sendMessage(ChatColor.GREEN + "Escreve /vipvantagens 2 para ver mais vantagens.");
			player.sendMessage(ChatColor.RED + "=====================================================");
		}
	}

	public static void vantagens(Player player, String[] args){
		String whatever;
		if (args.length == 1) {
			whatever = args[0];
			if (whatever.equalsIgnoreCase("1")) {
				player.sendMessage(ChatColor.RED + "==================== Comandos Vip 1 ===================");
				player.sendMessage(ChatColor.GREEN + "/region addmember pº(numero do plot) nick - para adicionar alguem ao seu plot.");
				player.sendMessage(ChatColor.GREEN + "/region removemember pº(numero do plot) nick - para remover alguem ao seu plot.");
				player.sendMessage(ChatColor.GREEN + "/region info - para ver informacoes soubre a sua region.");
				player.sendMessage(ChatColor.GREEN + "/region list - para ver a lista dos seus.");
				player.sendMessage(ChatColor.GREEN + "/kit tools - ferramentas de diamente custa 5000.");
				player.sendMessage(ChatColor.GREEN + "/kit arqueiro - arco e flechas custa 3000.");
				player.sendMessage(ChatColor.GREEN + "/tpa - para se teleportar ate alguem.");
				player.sendMessage(ChatColor.GREEN + "/tpahere - para teleportar alguem ate si.");
				player.sendMessage(ChatColor.GREEN + "/back - voltar atras.");
				player.sendMessage(ChatColor.GREEN + "Escreve /vipcomandos 2 para ver mais comandos.");
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else if (whatever.equalsIgnoreCase("2")) {
				player.sendMessage(ChatColor.RED + "==================== Comandos Vip 2 ===================");
				player.sendMessage(ChatColor.GREEN + "/afk - fica como ausente.");
				player.sendMessage(ChatColor.GREEN + "/me.");
				player.sendMessage(ChatColor.GREEN + "/nick.");
				player.sendMessage(ChatColor.GREEN + "/sethome - tem permissao ate 100 homes.");
				player.sendMessage(ChatColor.GREEN + "Os VIPs podem por cores nas tabeletas (signs).");
				player.sendMessage(ChatColor.GREEN + "Os VIPs podem criar tabeletas (signs) de [Balance], [Disposal] e [Mail].");
				player.sendMessage(ChatColor.RED + "=====================================================");
			} else player.sendMessage(ChatColor.GREEN + "Use /vipcomandos [Numero]");
		} else {
			player.sendMessage(ChatColor.RED + "==================== Comandos Vip 1 ===================");
			player.sendMessage(ChatColor.GREEN + "/region addmember pº(numero do plot) nick - para adicionar alguem ao seu plot.");
			player.sendMessage(ChatColor.GREEN + "/region removemember pº(numero do plot) nick - para remover alguem ao seu plot.");
			player.sendMessage(ChatColor.GREEN + "/region info - para ver informacoes soubre a sua region.");
			player.sendMessage(ChatColor.GREEN + "/region list - para ver a lista dos seus.");
			player.sendMessage(ChatColor.GREEN + "/kit tools - ferramentas de diamente custa 5000.");
			player.sendMessage(ChatColor.GREEN + "/kit arqueiro - arco e flechas custa 3000.");
			player.sendMessage(ChatColor.GREEN + "/tpa - para se teleportar ate alguem.");
			player.sendMessage(ChatColor.GREEN + "/tpahere - para teleportar alguem ate si.");
			player.sendMessage(ChatColor.GREEN + "/back - voltar atras.");
			player.sendMessage(ChatColor.GREEN + "Escreve /vipcomandos 2 para ver mais comandos.");
			player.sendMessage(ChatColor.RED + "=====================================================");
		}
	}
	
}