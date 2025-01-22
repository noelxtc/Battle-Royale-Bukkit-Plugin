package io.github.noelxtc.battleroyale.gifts.impl;

import io.github.noelxtc.battleroyale.gifts.PlayerGift;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @author Noel Tony
 * @since 27/12/2024
 */
public class Ender implements PlayerGift {
	private ItemStack head;
	private ItemStack eggs;

	public Ender() {
		this.head = new ItemStack(Material.PUMPKIN);
		this.eggs = new ItemStack(Material.MONSTER_EGG, 64, (byte) 58);
	}

	@Override
	public void giveGift(Player player) {
		player.getInventory().setHelmet(this.head);
		player.getInventory().addItem(this.eggs);
		player.sendMessage(ChatColor.MAGIC + "The Ender");
	}
}
