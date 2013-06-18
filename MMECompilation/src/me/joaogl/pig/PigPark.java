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

package me.joaogl.pig;

import java.util.List;

import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class PigPark {

    public static void park(Player player) {
        List<Entity> e = player.getNearbyEntities(1, 1, 1);
        double ex = 0, ey = 0, ez = 0;
        String p = player.getName();
        Entity entitys = null;
        World world = Bukkit.getWorld("world");
        for (Entity entity : e) {
            Location loc = entity.getLocation();
            entitys = entity;
            ex = loc.getX();
            ey = loc.getY();
            ez = loc.getZ();
        }
        int exx = (int) ex;
        int eyy = (int) ey;
        int ezz = (int) ez;
        ex = exx;
        ey = eyy;
        ez = ezz;

        if (player.isInsideVehicle() && entitys.getType().getTypeId() == 90 && player.getWorld() == world) {
            if (!(IdManager.getParkedX(IdManager.getId(player.getName())) == null)) {
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("Voce nao pode ter mais que um porco!");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("You are not able to have more pigs!");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Sie konnen nicht mehr als ein Schwein!");
                else Files.LangError(player);
            } else {
                entitys.eject();
                Location tp = new Location(world, ex, ey + 3, ez);
                Location tpe = new Location(world, ex, ey, ez);
                Blocks.getBlocks(ex, ey, ez);
                player.teleport(tp);
                Blocks.placeSign(ex, ey, ez, p);
                entitys.teleport(tpe);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("O seu porco foi guardado se o perder faca /find!");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("Pig safe if you lose it type /find!");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Pig sicher, wenn Sie verlieren geben /zu finden!");
                else Files.LangError(player);
                IdManager.setParkedX(IdManager.getId(player.getName()), ex);
                IdManager.setParkedY(IdManager.getId(player.getName()), ey);
                IdManager.setParkedZ(IdManager.getId(player.getName()), ez);
            }
        } else {
            if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("Nao esta dentro de um porco o nao esta no mundo do Spawn.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("You are not inside a pig or not in the spawn world.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Sie sind nicht in einem Schwein oder nicht in der Spawn Welt.");
            else Files.LangError(player);
        }
    }

    public static void find(Player player) {
        if (!(IdManager.getParkedX(IdManager.getId(player.getName())) == null)) {
            if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("O seu porco esta em: " + IdManager.getParkedX(IdManager.getId(player.getName())) + ", " + IdManager.getParkedY(IdManager.getId(player.getName())) + ", " + IdManager.getParkedZ(IdManager.getId(player.getName())));
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("Your pig is in this coords: " + IdManager.getParkedX(IdManager.getId(player.getName())) + ", " + IdManager.getParkedY(IdManager.getId(player.getName())) + ", " + IdManager.getParkedZ(IdManager.getId(player.getName())));
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Ihr Schwein ist in dieser Koordinaten: " + IdManager.getParkedX(IdManager.getId(player.getName())) + ", " + IdManager.getParkedY(IdManager.getId(player.getName())) + ", " + IdManager.getParkedZ(IdManager.getId(player.getName())));
            else Files.LangError(player);
        } else {
            if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("Nao tem nenhum porco guardado.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("You dont have any pig in safty.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Sie haben keine Schweine in Sicherheit.");
            else Files.LangError(player);
        }
    }

    public static void unpark(Player player) {
        if (!(IdManager.getParkedX(IdManager.getId(player.getName())) == null)) {
            Blocks.removeBlocks(IdManager.getParkedX(IdManager.getId(player.getName())), IdManager.getParkedY(IdManager.getId(player.getName())), IdManager.getParkedZ(IdManager.getId(player.getName())));
            IdManager.deletePark((IdManager.getId(player.getName())));
            if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("O seu porco esta a solta.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("Your pig have been release.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Ihr Schwein gewesen Release.");
            else Files.LangError(player);
        } else {
            if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("Nao tem nenhum porco guardado.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("You dont have any pig in safty.");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Sie haben keine Schweine in Sicherheit.");
            else Files.LangError(player);
        }
    }
}