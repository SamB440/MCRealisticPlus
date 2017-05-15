package com.SamB440;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Create extends JavaPlugin {
	
	public static Boolean readUUIDfile (String strFileName, Location blockloc, Player p)  {
		Boolean bool_block_present = false;
		try {
			File fileToRead = new File(strFileName);
			BufferedReader br = new BufferedReader(new FileReader(fileToRead));
			String line = null;
			line = br.readLine();
			while ((line = br.readLine()) != null && !bool_block_present) {
				bool_block_present=line.equals(blockloc);
			}
			br.close();
				} catch (FileNotFoundException e1) {
					p.sendMessage("No block file is available!");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		return bool_block_present;
	}
	public static void Campfire(Player p) {
		Location loc = p.getLocation();
		double x = loc.getX();
		double z = loc.getZ();
	    //newLoc.getBlock().setType(Material.STEP);
		loc.setY(loc.getY() - 1);
		loc.getBlock().setType(Material.NETHERRACK);
		String strFile= "plugins/MCRealisticPlus/Blocks.txt";
		Boolean bool_block_present=readUUIDfile(strFile, loc.getBlock().getLocation(), p);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setY(loc.getY() + 1);
		loc.getBlock().setType(Material.FIRE);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		p.playSound(loc, Sound.BLOCK_ANVIL_USE, 1.0F, 1.0F);
		loc.setY(loc.getY() - 1);
		loc.setX(x - 1);
		loc.getBlock().setType(Material.SMOOTH_BRICK);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setX(x + 1);
		loc.getBlock().setType(Material.SMOOTH_BRICK);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setX(p.getLocation().getX());
		loc.setZ(p.getLocation().getZ());
		loc.setZ(z + 1);
		loc.getBlock().setType(Material.SMOOTH_BRICK);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setZ(z - 1);
		loc.getBlock().setType(Material.SMOOTH_BRICK);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setY(p.getLocation().getY());
		loc.setZ(p.getLocation().getZ());
		loc.setX(p.getLocation().getX());
		loc.setX(x + 1);
		loc.getBlock().setType(Material.COBBLE_WALL);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setX(p.getLocation().getX());
		loc.setX(x - 1);
		loc.getBlock().setType(Material.COBBLE_WALL);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setX(p.getLocation().getX());
		loc.setY(p.getLocation().getY() + 1);
		loc.setX(x - 1);
		loc.getBlock().setType(Material.COBBLESTONE);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setX(p.getLocation().getX());
		loc.setX(x + 1);
		loc.getBlock().setType(Material.COBBLESTONE);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setX(p.getLocation().getX());
		loc.getBlock().setType(Material.COBBLE_WALL);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setY(p.getLocation().getY());
		loc.setZ(p.getLocation().getZ());
		loc.setZ(z + 1);
		loc.getBlock().setType(Material.COBBLE_WALL);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setZ(p.getLocation().getZ());
		loc.setZ(z - 1);
		loc.getBlock().setType(Material.COBBLE_WALL);
		if (!bool_block_present) {
			try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(strFile, true)))) {
				out.println(loc.getBlock().getLocation());
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		loc.setZ(p.getLocation().getZ());
		loc.setZ(loc.getZ() + 3);
		p.teleport(loc);
		loc.setY(p.getLocation().getY());
	}
}
