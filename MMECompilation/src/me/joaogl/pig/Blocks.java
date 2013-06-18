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

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;

public class Blocks {

    public static void getBlocks(double ex, double ey, double ez) {
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 2).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 2).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 1).setTypeId(7);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 1).getTypeId() == 0) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 1).setTypeId(7);
    }

    public static void removeBlocks(double ex, double ey, double ez) {
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez + 3).getTypeId() == 68) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez + 3).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez - 3).getTypeId() == 68) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez - 3).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey - 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey - 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey - 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey - 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey - 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 1, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 2, (int) ey + 2, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 2, (int) ey + 2, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 2).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 2).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 2, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez + 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex + 1, (int) ey + 2, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez - 1).setTypeId(0);
        if (Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 1).getTypeId() == 7) Bukkit.getServer().getWorld("world").getBlockAt((int) ex - 1, (int) ey + 2, (int) ez + 1).setTypeId(0);
    }

    public static void placeSign(double ex, double ey, double ez, String p) {
        Block block = Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez + 3);
        Block blocks = Bukkit.getServer().getWorld("world").getBlockAt((int) ex, (int) ey + 1, (int) ez - 3);
        if (block.getTypeId() == 0) {
            block.setType(Material.WALL_SIGN);
            block.setData((byte) 0x3);
            Sign sign = (Sign) block.getState();
            sign.update(true);
            sign.setLine(0, "PigPark");
            sign.setLine(1, p);
            sign.setLine(2, "Type unpark to");
            sign.setLine(3, "get pig back");
            sign.update(true);
        } else if (blocks.getTypeId() == 0) {
            blocks.setType(Material.WALL_SIGN);
            blocks.setData((byte) 0x2);
            Sign sign = (Sign) blocks.getState();
            sign.update(true);
            sign.setLine(0, "PigPark");
            sign.setLine(1, p);
            sign.setLine(2, "Click to get");
            sign.setLine(3, "your pig back");
            sign.update(true);
        }
    }
}