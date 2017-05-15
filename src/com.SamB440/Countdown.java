package com.SamB440;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Countdown extends JavaPlugin {
	
	/*public static void Start2(final Player p, int time) {
		System.out.print(time);
		if(time == 5) {
			p.sendMessage("5s");
			sec5a(p);
		}
		if(time == 10) {
			sec10b(p);
		}
		if(time == 15) {
			
		}
		if(time == 20) {
			
		}
		if(time == 25) {
			
		}
		if(time == 30) {
			
		}
	}
	public static void sec5a(final Player p) {
		Main.campfirecreating.add(p);
		TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Creating: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|" + ChatColor.GRAY + "||||]");
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Creating: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||" + ChatColor.GRAY + "|||]");
         
            }
        }, 40L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Creating: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||" + ChatColor.GRAY + "||]");
         
            }
        }, 60L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Creating: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||||" + ChatColor.GRAY + "|]");
         
            }
        }, 80L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Creating: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||||" + ChatColor.GRAY + "]");
            	Create.Campfire(p);
            	Main.campfirecreating.remove(p);
         
            }
        }, 100L);
	}
	public static void sec10b(final Player p) {
		
	}*/
	
	public static void Start(final Player p, final ItemStack output, int time) {
		if(time == 5) {
			sec5(p, output);
		}
		if(time == 10) {
			sec10(p, output);
		}
		if(time == 15) {
			
		}
		if(time == 20) {
			
		}
		if(time == 25) {
			
		}
		if(time == 30) {
			
		}
	}

	public static void sec5(final Player p, final ItemStack output) {
		Main.cooking.add(p);
		TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|" + ChatColor.GRAY + "||||]");
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||" + ChatColor.GRAY + "|||]");
         
            }
        }, 40L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||" + ChatColor.GRAY + "||]");
         
            }
        }, 60L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||||" + ChatColor.GRAY + "|]");
         
            }
        }, 80L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	p.getInventory().addItem(output);
            	Main.cooking.remove(p);
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||||" + ChatColor.GRAY + "]");
         
            }
        }, 100L);
	}
	public static void sec10(final Player p, final ItemStack output) {
		Main.cooking.add(p);
		TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|" + ChatColor.GRAY + "|||||||||]");
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||" + ChatColor.GRAY + "||||||||]");
         
            }
        }, 40L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||" + ChatColor.GRAY + "|||||||]");
         
            }
        }, 60L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||||" + ChatColor.GRAY + "||||||]");
         
            }
        }, 80L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||||" + ChatColor.GRAY + "|||||]");
         
            }
        }, 100L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||||||" + ChatColor.GRAY + "||||]");
         
            }
        }, 120L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||||||" + ChatColor.GRAY + "|||]");
         
            }
        }, 140L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||||||||" + ChatColor.GRAY + "||]");
         
            }
        }, 160L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "|||||||||" + ChatColor.GRAY + "|]");
         
            }
        }, 180L);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("MCRealisticPlus"), new Runnable() {
            
        	@Override
            public void run() {
            	p.getInventory().addItem(output);
            	Main.cooking.remove(p);
            	TitleManager.sendActionBar(p, ChatColor.GREEN + "" + ChatColor.BOLD + "Cooking: " + ChatColor.GRAY + "[" + ChatColor.GREEN + "||||||||||" + ChatColor.GRAY + "]");
         
            }
        }, 200L);
	}

}
