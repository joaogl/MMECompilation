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

package me.joaogl.datamanagers;

import me.joaogl.compilation.Main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class FilesPlayerListener implements Listener {
	public static Main plugin;

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String a = null;
		String b = null;
		Double x = null;
		Double y = null;
		Double z = null;
		if (LangProjectRead.loadConfiguration(player.getName()) != null) {
			a = LangProjectRead.loadConfiguration(player.getName());
		}
		if (EventRead.loadConfiguration(player.getName()) != null) {
			b = EventRead.loadConfiguration(player.getName());
		}
		if (PigParkRead.loadConfiguration(player.getName() + "x") != null) {
			x = Double.parseDouble(PigParkRead.loadConfiguration(player.getName() + "x"));
		}
		if (PigParkRead.loadConfiguration(player.getName() + "y") != null) {
			y = Double.parseDouble(PigParkRead.loadConfiguration(player.getName() + "y"));
		}
		if (PigParkRead.loadConfiguration(player.getName() + "z") != null) {
			z = Double.parseDouble(PigParkRead.loadConfiguration(player.getName() + "z"));
		}
		IdManager.playerJoin(player.getName(), a, b, x, y, z);
	}

	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		IdManager.playerLeft(player.getName());
	}
}
