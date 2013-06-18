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

public class ArenaPVP {
    private static int Block = 44;

    public static void Blocks(boolean there) {
        if (there) Block = 44;
        else Block = 0;

        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1502).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-652, 3, 1501).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-641, 3, 1501).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-640, 3, 1502).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-639, 3, 1501).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-628, 3, 1501).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1502).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1509).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-628, 3, 1510).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1511).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1518).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-628, 3, 1519).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1520).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1527).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-628, 3, 1528).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1529).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-627, 3, 1536).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-628, 3, 1537).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-639, 3, 1537).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-640, 3, 1536).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-641, 3, 1537).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-652, 3, 1537).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1536).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1529).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-652, 3, 1528).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1527).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-652, 3, 1519).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1520).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1518).setTypeId(Block);

        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1511).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-652, 3, 1510).setTypeId(Block);
        Bukkit.getServer().getWorld("eventos").getBlockAt(-653, 3, 1509).setTypeId(Block);
    }

}
