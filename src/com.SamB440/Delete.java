package com.SamB440;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Delete extends JavaPlugin {
	public static Boolean readUUIDfile (String strFileName, Location blockloc, Player p)  {
		Boolean bool_block_present = false;
		try {
			File fileToRead = new File(strFileName);
			BufferedReader br = new BufferedReader(new FileReader(fileToRead));
			String line = null;
			//line = br.readLine();
			while ((line = br.readLine()) != null && !bool_block_present) {
				bool_block_present=line.equals(blockloc.toString());
			}
			br.close();
				} catch (FileNotFoundException e1) {
					p.sendMessage("No block file is available!");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		return bool_block_present;
	}
	public static void Campfire(Player p, Location blockloc) throws IOException {
		Location locblock = blockloc;
		Location loc = p.getLocation();
		String strFile= "plugins/MCRealisticPlus/Blocks.txt";
		Material replaceblock;
		double y = locblock.getY();
		double x = locblock.getX();
		double z = locblock.getZ();
		locblock.setZ(z + 2);
		replaceblock = locblock.getBlock().getType();
		locblock.setZ(z);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 2);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setX(x + 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setX(x - 1);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 2);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setX(x);
		locblock.setY(y);
		locblock.setZ(z + 1);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setZ(z - 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		System.out.print(locblock.getX());
		System.out.print(locblock.getY());
		System.out.print(locblock.getZ());
		p.playSound(loc, Sound.BLOCK_ANVIL_LAND, 1.0F, 1.0F);
	}
}

		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setX(x - 1);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 2);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setX(x);
		locblock.setY(y);
		locblock.setZ(z + 1);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y + 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setZ(z - 1);
		locblock.getBlock().setType(Material.AIR);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		locblock.setY(y);
		locblock.getBlock().setType(replaceblock);
		FileUtil.removeLineFromFile(strFile, locblock.toString());
		System.out.print(locblock.getX());
		System.out.print(locblock.getY());
		System.out.print(locblock.getZ());
		p.playSound(loc, Sound.BLOCK_ANVIL_LAND, 1.0F, 1.0F);
	}
}
