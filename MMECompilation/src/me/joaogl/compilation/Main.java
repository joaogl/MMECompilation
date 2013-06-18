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

package me.joaogl.compilation;

import java.util.logging.Logger;

import me.joaogl.antibadwords.MyPlayerListener;
import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.FilesPlayerListener;
import me.joaogl.dispenserrefill.DispenserRefill;
import me.joaogl.eventos.EventComandos;
import me.joaogl.eventos.PlayerListener;
import me.joaogl.help.ModHelp;
import me.joaogl.help.PlayerHelp;
import me.joaogl.help.VIPInformation;
import me.joaogl.langproject.LangProject;
import me.joaogl.langproject.PlayerMoveListener;
import me.joaogl.pig.PigPark;
import me.joaogl.regions.SignListener;
import net.milkbowl.vault.economy.Economy;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;

public class Main extends JavaPlugin {
	public Main plugin;
	public static Logger logger;
	public MyPlayerListener cl = new MyPlayerListener();
	public FilesPlayerListener files = new FilesPlayerListener();
	public PlayerMoveListener move;
	public DispenserRefill refill = new DispenserRefill();
	// public PigListener pig = new PigListener(this);
	public SignListener sign = new SignListener();
	public PlayerListener event = new PlayerListener(this);
	public static Economy econ = null;

	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		logger.info(pdfFile.getName() + " Foi desactivado!");
	}

	public void onEnable() {
		this.plugin = this;
		logger = this.getLogger();
		PluginDescriptionFile pdfFile = this.getDescription();
		logger.info(pdfFile.getName() + " Versao " + pdfFile.getVersion() + " Foi Activado!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this.cl, this);
		pm.registerEvents(this.files, this);
		pm.registerEvents(this.refill, this);
		// pm.registerEvents(this.pig, this);
		pm.registerEvents(this.event, this);
		pm.registerEvents(this.sign, this);
		this.move = new PlayerMoveListener(plugin);
		this.getServer().getPluginManager().registerEvents(this.move, this);
		if (System.getProperty("os.name").equalsIgnoreCase("Windows 7")) {
			Files.Linux = false;
		} else {
			Files.Linux = true;
		}
		setupEconomy();
		if (!setupEconomy()) {
			logger.info(String.format("[%s] - Foi desactivado por falta do plugin Vault!", getDescription().getName()));
			if (getServer().getPluginManager().isPluginEnabled("Vault")) {
				System.out.println("YEESSSSSSSS");
			}
			getServer().getPluginManager().disablePlugin(this);
			return;
		}
	}

	private boolean setupEconomy() {
		if (getServer().getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		org.bukkit.plugin.RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
		if (rsp == null) {
			return false;
		}
		econ = rsp.getProvider();
		return econ != null;
	}

	public static WorldGuardPlugin getWorldGuard() {
		final org.bukkit.plugin.Plugin wgPlugin = Bukkit.getServer().getPluginManager().getPlugin("WorldGuard");
		return (WorldGuardPlugin) wgPlugin;
	}

	public static ProtectedRegion getProtectedRegion(World worldWorld, String region) {
		if (worldWorld != null) {
			final WorldGuardPlugin wgPlugin = getWorldGuard();
			if (wgPlugin != null) {
				return wgPlugin.getRegionManager(worldWorld).getRegion(region);
			}
		}
		return null;
	}

	public static void addMember(ProtectedRegion protectedRegion, Player player) {
		if (protectedRegion != null && player != null) {
			protectedRegion.getMembers().addPlayer(player.getName());
		}
	}

	public void removeMember(ProtectedRegion protectedRegion, Player player) {
		if (protectedRegion != null && player != null) {
			protectedRegion.getMembers().removePlayer(getWorldGuard().wrapPlayer(player));
		}
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if (commandLabel.equalsIgnoreCase("ajuda") || cmd.getName().equalsIgnoreCase("help") || cmd.getName().equalsIgnoreCase("helfen")) PlayerHelp.ajuda(player, args);
		if (commandLabel.equalsIgnoreCase("creditos") || commandLabel.equalsIgnoreCase("credits")) PlayerHelp.creditos(player);
		if (commandLabel.equalsIgnoreCase("site") || commandLabel.equalsIgnoreCase("website") || commandLabel.equalsIgnoreCase("Webseite")) PlayerHelp.site(player);
		if (commandLabel.equalsIgnoreCase("sv") || commandLabel.equalsIgnoreCase("server") || commandLabel.equalsIgnoreCase("servidor") || commandLabel.equalsIgnoreCase("servers")) PlayerHelp.servers(player);
		if (commandLabel.equalsIgnoreCase("mod")) ModHelp.mod(player, args);
		if (commandLabel.equalsIgnoreCase("modcomandos") || commandLabel.equalsIgnoreCase("modcommands") || commandLabel.equalsIgnoreCase("modbefehle")) ModHelp.modcomandos(player, args);
		if (commandLabel.equalsIgnoreCase("vip")) VIPInformation.vip(player, args);
		if (commandLabel.equalsIgnoreCase("vantagens") || commandLabel.equalsIgnoreCase("advantages") || commandLabel.equalsIgnoreCase("vorteile")) VIPInformation.vantagens(player, args);
		if (commandLabel.equalsIgnoreCase("comandos") || commandLabel.equalsIgnoreCase("commands") || commandLabel.equalsIgnoreCase("befehle")) VIPInformation.comandos(player, args);
		if (commandLabel.equalsIgnoreCase("setlanguage") || commandLabel.equalsIgnoreCase("language") || commandLabel.equalsIgnoreCase("lingua") || commandLabel.equalsIgnoreCase("defenirlingua") || commandLabel.equalsIgnoreCase("sprache") || commandLabel.equalsIgnoreCase("definierensprache")) LangProject.commands(player, args, commandLabel);
		if (commandLabel.equalsIgnoreCase("park") || commandLabel.equalsIgnoreCase("estacionar")) PigPark.park(player);
		if (commandLabel.equalsIgnoreCase("find") || commandLabel.equalsIgnoreCase("procurar")) PigPark.find(player);
		if (commandLabel.equalsIgnoreCase("unpark") || commandLabel.equalsIgnoreCase("tirar")) PigPark.unpark(player);
		// if (commandLabel.equalsIgnoreCase("mme")) RegionCommands.mme(player,
		// args);

		if (commandLabel.equalsIgnoreCase("ajudaevento") || commandLabel.equalsIgnoreCase("ae")) EventComandos.Ajuda(player);
		if (commandLabel.equalsIgnoreCase("step")) EventComandos.Step(player);
		if (commandLabel.equalsIgnoreCase("evento") || commandLabel.equalsIgnoreCase("e")) EventComandos.Evento(args, player);
		if (commandLabel.equalsIgnoreCase("premio") || commandLabel.equalsIgnoreCase("p")) EventComandos.Premio(args, player);
		if (commandLabel.equalsIgnoreCase("regrasevento") || commandLabel.equalsIgnoreCase("re")) EventComandos.Regras(args, player);
		if (commandLabel.equalsIgnoreCase("anuncio") || commandLabel.equalsIgnoreCase("an")) EventComandos.An(player);
		if (commandLabel.equalsIgnoreCase("abrir") || commandLabel.equalsIgnoreCase("ab")) EventComandos.Abrir(player);
		if (commandLabel.equalsIgnoreCase("definir") || commandLabel.equalsIgnoreCase("de")) EventComandos.Definir(args, player);
		if (commandLabel.equalsIgnoreCase("ir") || commandLabel.equalsIgnoreCase("go")) EventComandos.irAction(player);
		if (commandLabel.equalsIgnoreCase("lista")) EventComandos.eventList(player);
		if (commandLabel.equalsIgnoreCase("fechar") || commandLabel.equalsIgnoreCase("fe")) EventComandos.closeAction(player);
		if (commandLabel.equalsIgnoreCase("comecar") || commandLabel.equalsIgnoreCase("c")) EventComandos.startAction(player);
		if (commandLabel.equalsIgnoreCase("vencedor") || commandLabel.equalsIgnoreCase("ve")) EventComandos.Winner(args, player);
		if (commandLabel.equalsIgnoreCase("fim")) EventComandos.endAction(player);
		return false;
	}
}