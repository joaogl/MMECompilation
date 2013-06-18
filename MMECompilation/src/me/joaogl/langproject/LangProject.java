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

package me.joaogl.langproject;

import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class LangProject {

    public static void commands(Player player, String[] args, String commandLabel) {
        String whatever = null;
        if (args.length == 1) {
            whatever = args[0];
            if (whatever.equalsIgnoreCase("PT")) {
                player.sendMessage(ChatColor.RED + "[Lingua]" + ChatColor.GREEN + " A sua lingua foi defenida para Portugues.");
                player.sendMessage(ChatColor.RED + "[Lingua]" + ChatColor.GREEN + " Apenas os plugins feitos pelo joaogl estaram em Portugues.");
                IdManager.saveLang(IdManager.getId(player.getName()), "pt");
                player.kickPlayer("Kicado para actualizar a tua lingua.");
            } else if (whatever.equalsIgnoreCase("EN")) {
                player.sendMessage(ChatColor.RED + "[Language]" + ChatColor.GREEN + " Your language was set to english.");
                player.sendMessage(ChatColor.RED + "[Language]" + ChatColor.GREEN + " Only the plugins made by joaogl will be displayed in english.");
                IdManager.saveLang(IdManager.getId(player.getName()), "en");
                player.kickPlayer("Kicked to update your language.");
            } else if (whatever.equalsIgnoreCase("GER")) {
                player.sendMessage(ChatColor.RED + "[Sprache]" + ChatColor.GREEN + " Ihre Sprache wurde auf Deutsch eingestellt.");
                player.sendMessage(ChatColor.RED + "[Sprache]" + ChatColor.GREEN + " Nur die Plugins die joaogl erstellt hat werden auf deutsch ubersetzt.");
                IdManager.saveLang(IdManager.getId(player.getName()), "ger");
                player.kickPlayer("Kicked, um Ihre Sprache zu aktualisieren.");
            } else {
                player.sendMessage(ChatColor.BLUE + "/" + commandLabel + " PT, EN ou GER.");
                player.sendMessage(ChatColor.BLUE + "/" + commandLabel + " PT, EN or GER.");
                player.sendMessage(ChatColor.BLUE + "/" + commandLabel + " PT, EN ou GER");
            }
        } else Files.LangError(player);
    }
}