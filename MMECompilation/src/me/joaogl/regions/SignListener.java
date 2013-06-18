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

package me.joaogl.regions;

import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignListener implements Listener {

    @EventHandler
    public void onSignCreate(SignChangeEvent sign) {
        Player player = sign.getPlayer();
        if (player.isOp() || player.hasPermission("plot_comprar") && sign.getLine(0).equalsIgnoreCase("[plot]")) {
            if (sign.getLine(1) != null) {
                sign.setLine(0, "[Plot]");
                sign.setLine(2, sign.getLine(1));
                sign.setLine(1, "Buy a Plot");
                sign.setLine(3, "" + PlotList.PlotPrice);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Sucesso] Placa de venda de plot criada.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Success] Buy Plot sign was created.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Erfolg] Kaufen Plot Zeichen erstellt wurde.");
                else Files.LangError(player);
            } else {
                sign.setLine(0, "[Plot]");
                sign.setLine(1, "Buy a Plot");
                sign.setLine(2, "Error");
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Erro] Impossivel criar a placa.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Error] Failed to create the sign.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Fehler] Kann Karte erstellen.");
                else Files.LangError(player);
            }
        }
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        if (!(block == null) && block.getType() == Material.SIGN_POST || !(block == null) && block.getType() == Material.WALL_SIGN) {
            Sign sign = (Sign) block.getState();
            Action action = event.getAction();
            if (action == Action.RIGHT_CLICK_BLOCK) {
                if (sign.getLine(0).equalsIgnoreCase("[plot]")) {
                    /*
                     * if (PlotPlayerFiles.loadConfiguration("P" +
                     * sign.getLine(2)) == null ||
                     * PlotPlayerFiles.loadConfiguration("P" + sign.getLine(2))
                     * == "none") { if
                     * (PlayerPlotFiles.loadConfiguration(player.getName()) ==
                     * null ||
                     * PlayerPlotFiles.loadConfiguration(player.getName()) ==
                     * "none") { Comprar.ComprarPlots(player, sign.getLine(2));
                     * } else { if
                     * (IdManager.getLang(IdManager.getId(player.getName
                     * ())).equalsIgnoreCase("pt")) {
                     * player.sendMessage(ChatColor.RED +
                     * "[PLOT] Ja tem um plot."); } else if
                     * (IdManager.getLang(IdManager
                     * .getId(player.getName())).equalsIgnoreCase("en")) {
                     * player.sendMessage(ChatColor.RED +
                     * "[PLOT] You can't have more than one plot."); } else if
                     * (IdManager
                     * .getLang(IdManager.getId(player.getName())).equalsIgnoreCase
                     * ("ger")) { player.sendMessage(ChatColor.RED +
                     * "[Grundstuck] Sie haben bereits ein Grundstuck."); } else
                     * Files.LangError(player); } } else { if
                     * (IdManager.getLang(
                     * IdManager.getId(player.getName())).equalsIgnoreCase
                     * ("pt")) { player.sendMessage(ChatColor.RED +
                     * "[PLOT] Plot ja esta ocupado."); } else if
                     * (IdManager.getLang
                     * (IdManager.getId(player.getName())).equalsIgnoreCase
                     * ("en")) { player.sendMessage(ChatColor.RED +
                     * "[PLOT] Plot is sold."); } else if
                     * (IdManager.getLang(IdManager
                     * .getId(player.getName())).equalsIgnoreCase("ger")) {
                     * player.sendMessage(ChatColor.RED +
                     * "[Grundstuck] Grundstuck ist bereits damit beschaftigt."
                     * ); } else Files.LangError(player); }
                     */
                }
            }
        }
    }
}