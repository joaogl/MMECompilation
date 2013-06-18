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

package me.joaogl.antibadwords;

import me.joaogl.compilation.Main;
import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class MyPlayerListener implements Listener {
    public static Main plugin;

    @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {
        Player player = event.getPlayer();
        if (!(player.hasPermission("dizer.asneiras") || player.isOp())) {
            if (event.getMessage().toLowerCase().contains("fds") || event.getMessage().toLowerCase().contains("fudido") || event.getMessage().toLowerCase().contains("fodas") || event.getMessage().toLowerCase().contains("foda") || event.getMessage().toLowerCase().contains("fodass") || event.getMessage().toLowerCase().contains("crlh") || event.getMessage().toLowerCase().contains("caralho") || event.getMessage().toLowerCase().contains("merda") || event.getMessage().toLowerCase().contains("fuder") || event.getMessage().toLowerCase().contains("puta") || event.getMessage().toLowerCase().contains("fudida") || event.getMessage().toLowerCase().contains("fdp") || event.getMessage().toLowerCase().contains("pqp") || event.getMessage().toLowerCase().contains("cabrao") || event.getMessage().toLowerCase().contains("pariu") || event.getMessage().toLowerCase().contains("fuck") || event.getMessage().toLowerCase().contains("mother") || event.getMessage().toLowerCase().contains("fucker") || event.getMessage().toLowerCase().contains("fude") || event.getMessage().toLowerCase().contains("viado") || event.getMessage().toLowerCase().contains("Arsch") || event.getMessage().toLowerCase().contains("Hure") || event.getMessage().toLowerCase().contains("Schlampe") || event.getMessage().toLowerCase().contains("fick") || event.getMessage().toLowerCase().contains("Sack") || event.getMessage().toLowerCase().contains("Anal") || event.getMessage().toLowerCase().contains("Bastard") || event.getMessage().toLowerCase().contains("Nazi") || event.getMessage().toLowerCase().contains("Elk") || event.getMessage().toLowerCase().contains("Hengst") || event.getMessage().toLowerCase().contains("Hirsch") || event.getMessage().toLowerCase().contains("Honk") || event.getMessage().toLowerCase().contains("Zicke") || event.getMessage().toLowerCase().contains("Forzer") || event.getMessage().toLowerCase().contains("Fotze") || event.getMessage().toLowerCase().contains("Idiot") || event.getMessage().toLowerCase().contains("Nutte") || event.getMessage().toLowerCase().contains("Lesbe") || event.getMessage().toLowerCase().contains("Xylophondildo") || event.getMessage().toLowerCase().contains("Pavianarsch") || event.getMessage().toLowerCase().contains("Pisser")) {

                event.setCancelled(true);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.kickPlayer("Essa e a paga pelo que disseste!");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.kickPlayer("This is the pay for what you said!");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.kickPlayer("Diese und bezahlen fur das, was du gesagt hast!");
                else {
                    Files.LangError(player);
                    player.kickPlayer("This is the pay for what you said!");
                }
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[AntiBadWords] " + player.getDisplayName() + " was Kicked because tried to write a crossword in the chat.");
            }
        }
    }
}
