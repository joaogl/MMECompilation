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

package me.joaogl.eventos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class RunEvent {

	public static void Run(final Player player, Object evento) {
		new Thread(new Runnable() {
			public void run() {
				try {
					if (EventComandos.evento != null) EventComandos.An(player);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) EventComandos.An(player);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) EventComandos.Abrir(player);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " The event inscriptions are almost closed.");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Type /go  to go to the event.");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " 1 Minute left.");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " The event inscriptions are almost closed.");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Type /go  to go to the event.");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " 30 Seconds left.");
					if (EventComandos.evento != null) Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) EventComandos.closeAction(player);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) Thread.sleep(5000);
					if (EventComandos.evento != null) EventComandos.startAction(player);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}