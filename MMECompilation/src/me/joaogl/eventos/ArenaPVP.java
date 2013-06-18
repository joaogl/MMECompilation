package me.joaogl.eventos;

import org.bukkit.Bukkit;

public class ArenaPVP {
	private static int Block = 44;
	
	public static void Blocks(boolean there){
		if(there){
			Block = 44;
		}else{
			Block = 0;
		}
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1502).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-652,3,1501).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-641,3,1501).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-640,3,1502).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-639,3,1501).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-628,3,1501).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1502).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1509).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-628,3,1510).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1511).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1518).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-628,3,1519).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1520).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1527).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-628,3,1528).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1529).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-627,3,1536).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-628,3,1537).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-639,3,1537).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-640,3,1536).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-641,3,1537).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-652,3,1537).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1536).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1529).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-652,3,1528).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1527).setTypeId(Block);

		Bukkit.getServer().getWorld("eventos").getBlockAt(-652,3,1519).setTypeId(Block);		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1520).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1518).setTypeId(Block);
		
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1511).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-652,3,1510).setTypeId(Block);
		Bukkit.getServer().getWorld("eventos").getBlockAt(-653,3,1509).setTypeId(Block);
	}
	
}
