package io.github.noelxtc.battleroyale.gifts.impl;

import io.github.noelxtc.battleroyale.gifts.PlayerGift;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @author Noel Tony
 * @since 27/12/2024
 */
public class BlinkingSpirit implements PlayerGift{
	private ItemStack pearls;
	private ItemStack boots;

	public BlinkingSpirit() {
		this.pearls = new ItemStack(Material.ENDER_PEARL, 64);

		//Boots
		ItemStack boots = new ItemStack(Material.IRON_BOOTS);
		boots.addEnchantment(Enchantment.DURABILITY, 3);
		boots.addEnchantment(Enchantment.PROTECTION_FALL, 4);
		this.boots = boots;
	}

	@Override
	public void giveGift(Player player) {
		player.getInventory().addItem(this.pearls);
		player.getInventory().setBoots(this.boots);
		player.sendMessage(ChatColor.GREEN + "Blinking Spirit");
	}
}
