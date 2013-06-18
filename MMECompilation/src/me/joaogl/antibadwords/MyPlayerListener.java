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

import java.util.ArrayList;
import java.util.List;

import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MyPlayerListener implements Listener {

    private List<String> words = new ArrayList<String>();
    
    public MyPlayerListener() {
        this.words.add("fds"); 
        this.words.add("fudido"); 
        this.words.add("fodas"); 
        this.words.add("foda"); 
        this.words.add("fodass"); 
        this.words.add("crlh"); 
        this.words.add("caralho"); 
        this.words.add("merda"); 
        this.words.add("fuder"); 
        this.words.add("puta"); 
        this.words.add("fudida"); 
        this.words.add("fdp"); 
        this.words.add("pqp"); 
        this.words.add("cabrao"); 
        this.words.add("pariu"); 
        this.words.add("fuck"); 
        this.words.add("mother"); 
        this.words.add("fucker"); 
        this.words.add("fude"); 
        this.words.add("viado"); 
        this.words.add("arsch"); 
        this.words.add("hure"); 
        this.words.add("schlampe"); 
        this.words.add("fick"); 
        this.words.add("sack"); 
        this.words.add("anal"); 
        this.words.add("bastard"); 
        this.words.add("nazi"); 
        this.words.add("elk"); 
        this.words.add("hengst"); 
        this.words.add("hirsch"); 
        this.words.add("honk"); 
        this.words.add("zicke"); 
        this.words.add("forzer"); 
        this.words.add("fotze"); 
        this.words.add("idiot"); 
        this.words.add("nutte"); 
        this.words.add("lesbe"); 
        this.words.add("xylophondildo"); 
        this.words.add("pavianarsch"); 
        this.words.add("pisser");
    }
    
    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if(!(player.hasPermission("dizer.asneiras") || player.isOp())) {
            if(this.words.contains(event.getMessage())) {
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
