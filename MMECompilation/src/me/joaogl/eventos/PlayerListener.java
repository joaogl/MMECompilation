package me.joaogl.eventos;

import me.joaogl.compilation.Main;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerListener implements Listener {

	public static Main plugin;

	public PlayerListener(Main instance) {
		plugin = instance;
	}

	@EventHandler
	public void onDeath(PlayerDeathEvent event) {
		Player player = event.getEntity();
		if (player.getLocation().getWorld().equals(Bukkit.getServer().getWorld("eventos"))) {
			event.setDroppedExp(0);
			event.getDrops().clear();
			if (EventComandos.evento != null) {
				event.setDeathMessage(player.getName() + " died in " + EventComandos.evento + " Event");
			}
		}
	}

	@EventHandler
	public void onRespawn(PlayerRespawnEvent event) {
		final Player player = event.getPlayer();
		if (IdManager.getEvent(IdManager.getId(player.getName())) != null) {
			if (IdManager.getEvent(IdManager.getId(player.getName())).equalsIgnoreCase("TRUE")) {
				if (EventComandos.evento.equals("Spleef")) {
					EventComandos.LocXs = -724;
					EventComandos.LocYs = 16;
					EventComandos.LocZs = 1440;
				} else if (EventComandos.evento.equals("Arena PVP")) {
					player.sendMessage(ChatColor.GREEN + "Arena PVP");
					EventComandos.LocXs = -639;
					EventComandos.LocYs = 11;
					EventComandos.LocZs = 1519;
				} else if (EventComandos.evento.equals("Maratona")) {
					player.sendMessage(ChatColor.GREEN + "Maratona");
					EventComandos.LocXs = -769;
					EventComandos.LocYs = 7;
					EventComandos.LocZs = 1507;
				} else if (EventComandos.evento.equals("Parkur")) {
					player.sendMessage(ChatColor.GREEN + "Parkur");
				} else if (EventComandos.evento.equals("Run")) {
					player.sendMessage(ChatColor.GREEN + "Run");
				} else {
					player.sendMessage(ChatColor.GREEN + "Outros");
				}
				final Location locs = new Location(EventComandos.worlds, EventComandos.LocXs, EventComandos.LocYs, EventComandos.LocZs);

				new Thread(new Runnable() {
					public void run() {
						try {
							Thread.sleep(500);
							player.teleport(locs);
							player.sendMessage("Agora tem que esperar pelo fim do evento.");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
	}

	@EventHandler
	public void onBreakBlock(BlockBreakEvent event) {
		if (event.getPlayer() instanceof Player) {
			if (event.getPlayer().getLocation().getWorld().equals(Bukkit.getServer().getWorld("eventos"))) {
				event.setCancelled(true);
				event.getBlock().setTypeId(0);
			}
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		World world = Bukkit.getServer().getWorld("eventos");
		if (player.getLocation().getWorld().equals(world)) {
			final Location locs = new Location(EventComandos.worlds, EventComandos.LocXs, EventComandos.LocYs, EventComandos.LocZs);
			player.teleport(locs);
			player.getInventory().clear();
			player.updateInventory();
		}
	}
}