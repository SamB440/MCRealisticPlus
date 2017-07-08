package com.SamB440;

import net.minecraft.server.v1_12_R1.IChatBaseComponent;
import net.minecraft.server.v1_12_R1.Packet;
import net.minecraft.server.v1_12_R1.PacketPlayOutChat;
import net.minecraft.server.v1_12_R1.PacketPlayOutTitle;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class TitleManager {
    public static void sendTitle(Player player, String msgTitle, String msgSubTitle, int ticks) {
        /*IChatBaseComponent chatTitle = IChatBaseComponent.ChatSerializer.a((String)("{\"text\": \"" + msgTitle + "\"}"));
        IChatBaseComponent chatSubTitle = IChatBaseComponent.ChatSerializer.a((String)("{\"text\": \"" + msgSubTitle + "\"}"));
        PacketPlayOutTitle p = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, chatTitle);
        PacketPlayOutTitle p2 = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, chatSubTitle);
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)p);
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)p2);
        TitleManager.sendTime(player, ticks);*/
    	if(Bukkit.getVersion().contains("1.12"))
    	{
    		player.sendTitle(msgTitle, msgSubTitle, 20, ticks, 20);
    	}
    }

    @SuppressWarnings({ "rawtypes", "unused" })
	private static void sendTime(Player player, int ticks) {
        PacketPlayOutTitle p = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TIMES, null, 20, ticks, 20);
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)p);
    }

    @SuppressWarnings("rawtypes")
	public static void sendActionBar(Player player, String message) {
    	if(Bukkit.getVersion().contains("1.12"))
    	{
    		IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a((String)("{\"text\": \"" + message + "\"}"));
    		PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc);
    		((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet)ppoc);
    	}
    }
}
