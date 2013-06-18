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

public class Spleef {

	private static int BlockDistance = (int) 1.10;
	private static int BlockAltDistance = (int) 7;

	public static void SetLayers(int height, int width, int X, int Y, int Z, int type, int layers) {
		int YCoord;
		YCoord = Y;
		while (layers > 0) {
			Height(height, width, X, YCoord, Z, type);
			YCoord = (int) (YCoord - BlockAltDistance);
			layers--;
		}
	}

	private static void Width(int width, int X, int Y, int Z, int type) {
		int Coord;
		Coord = X;
		while (width > 0) {
			Bukkit.getServer().getWorld("eventos").getBlockAt(Coord, Y, Z).setTypeId(type);
			Coord = (int) (Coord - BlockDistance);
			width--;
		}
	}

	private static void Height(int height, int width, int X, int Y, int Z, int type) {
		int ZCoord;
		ZCoord = Z;
		while (height > 0) {
			Width(width, X, Y, ZCoord, type);
			ZCoord = (int) (ZCoord + BlockDistance);
			height--;
		}
	}

	public static void removeLayer() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Spleef.SetLayers(14, 2, -707, 51, 1414, 0, 1);
					Thread.sleep(20000);
					Spleef.SetLayers(14, 2, -707, 51, 1414, 41, 1);
					if (EventComandos.step == 1) Thread.sleep(5000);// 5
					if (EventComandos.step == 1) Thread.sleep(5000);// 10
					if (EventComandos.step == 1) Thread.sleep(5000);// 15
					if (EventComandos.step == 1) Thread.sleep(5000);// 20
					if (EventComandos.step == 1) Thread.sleep(5000);// 25
					if (EventComandos.step == 1) Thread.sleep(5000);// 30
					if (EventComandos.step == 1) {
						FirstLayer();
					}
					if (EventComandos.step == 2) Thread.sleep(5000);// 5
					if (EventComandos.step == 2) Thread.sleep(5000);// 10
					if (EventComandos.step == 2) Thread.sleep(5000);// 15
					if (EventComandos.step == 2) Thread.sleep(5000);// 20
					if (EventComandos.step == 2) Thread.sleep(5000);// 25
					if (EventComandos.step == 2) Thread.sleep(5000);// 30
					if (EventComandos.step == 2) {
						SecondLayer();
					}
					if (EventComandos.step == 3) Thread.sleep(5000);// 5
					if (EventComandos.step == 3) Thread.sleep(5000);// 10
					if (EventComandos.step == 3) Thread.sleep(5000);// 15
					if (EventComandos.step == 3) Thread.sleep(5000);// 20
					if (EventComandos.step == 3) Thread.sleep(5000);// 25
					if (EventComandos.step == 3) Thread.sleep(5000);// 30
					if (EventComandos.step == 3) {
						ThirdLayer();
					}
					if (EventComandos.step == 4) Thread.sleep(5000);// 5
					if (EventComandos.step == 4) Thread.sleep(5000);// 10
					if (EventComandos.step == 4) Thread.sleep(5000);// 15
					if (EventComandos.step == 4) Thread.sleep(5000);// 20
					if (EventComandos.step == 4) Thread.sleep(5000);// 25
					if (EventComandos.step == 4) Thread.sleep(5000);// 30
					if (EventComandos.step == 4) Thread.sleep(5000);// 35
					if (EventComandos.step == 4) Thread.sleep(5000);// 40
					if (EventComandos.step == 4) Thread.sleep(5000);// 45
					if (EventComandos.step == 4) Thread.sleep(5000);// 50
					if (EventComandos.step == 4) {
						FourthLayer();
					}
					if (EventComandos.step == 5) Thread.sleep(5000);// 5
					if (EventComandos.step == 5) Thread.sleep(5000);// 10
					if (EventComandos.step == 5) Thread.sleep(5000);// 15
					if (EventComandos.step == 5) Thread.sleep(5000);// 20
					if (EventComandos.step == 5) Thread.sleep(5000);// 25
					if (EventComandos.step == 5) Thread.sleep(5000);// 30
					if (EventComandos.step == 5) Thread.sleep(5000);// 35
					if (EventComandos.step == 5) Thread.sleep(5000);// 40
					if (EventComandos.step == 5) Thread.sleep(5000);// 45
					if (EventComandos.step == 5) Thread.sleep(5000);// 50
					if (EventComandos.step == 5) Thread.sleep(5000);// 55
					if (EventComandos.step == 5) Thread.sleep(5000);// 60
					if (EventComandos.step == 5) {
						FifthLayer();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	private static void FirstLayer() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The first layer is going to be removed! 5");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The first layer is going to be removed! 4");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The first layer is going to be removed! 3");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The first layer is going to be removed! 2");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The first layer is going to be removed! 1");
					Thread.sleep(1000);
					Spleef.SetLayers(39, 49, -681, 43, 1399, 0, 1);
					if (EventComandos.step == 1) EventComandos.step = 2;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	private static void SecondLayer() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The second layer is going to be removed! 5");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The second layer is going to be removed! 4");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The second layer is going to be removed! 3");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The second layer is going to be removed! 2");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The second layer is going to be removed! 1");
					Thread.sleep(1000);
					Spleef.SetLayers(39, 49, -681, 36, 1399, 0, 1);
					if (EventComandos.step == 2) EventComandos.step = 3;

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	private static void ThirdLayer() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The third layer is going to be removed! 5");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The third layer is going to be removed! 4");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The third layer is going to be removed! 3");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The third layer is going to be removed! 2");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The third layer is going to be removed! 1");
					Thread.sleep(1000);
					Spleef.SetLayers(39, 49, -681, 29, 1399, 0, 1);
					if (EventComandos.step == 3) EventComandos.step = 4;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	private static void FourthLayer() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fourth layer is going to be removed! 5");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fourth layer is going to be removed! 4");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fourth layer is going to be removed! 3");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fourth layer is going to be removed! 2");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fourth layer is going to be removed! 1");
					Thread.sleep(1000);
					Spleef.SetLayers(39, 49, -681, 22, 1399, 0, 1);
					if (EventComandos.step == 4) EventComandos.step = 5;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	private static void FifthLayer() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fifth layer is going to be removed! 5");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fifth layer is going to be removed! 4");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fifth layer is going to be removed! 3");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fifth layer is going to be removed! 2");
					Thread.sleep(1000);
					Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "The fifth layer is going to be removed! 1");
					Thread.sleep(1000);
					Spleef.SetLayers(39, 49, -681, 15, 1399, 0, 1);
					if (EventComandos.step == 5) EventComandos.step = 0;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}