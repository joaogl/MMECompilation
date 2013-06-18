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

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class PlotList {
	public static World worlds = Bukkit.getWorld("world");	
	public static int PlotPrice = 60000;
	
	public static Location p1 = new Location(worlds, -226, 63, -209);
}
