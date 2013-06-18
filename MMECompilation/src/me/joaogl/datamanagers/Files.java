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

import java.util.Properties;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Files {
	static Properties properties = new Properties();
	public static boolean Linux = false;
	public static String Linuxdir = "/home/minecraft/mine/JoaoglPlugins";
	public static String windowsdir = "C:/Users/Joao Lourenco/Desktop/MineCraft Server/JoaoglPlugin";
	//public static String windowsdir = "C:/Users/joaogl/Desktop/MineCraft Server/JoaoglPlugin";

	public static void LangError(Player player) {
		player.sendMessage(ChatColor.RED + "Escreva /lingua.");
		player.sendMessage(ChatColor.RED + "Type /setlanguage.");
		player.sendMessage(ChatColor.RED + "Schreiben /sprache.");
	}

}