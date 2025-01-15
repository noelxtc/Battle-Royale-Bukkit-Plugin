package io.github.noelxtc.battleroyale.catastrophy.impl;

import io.github.noelxtc.battleroyale.catastrophy.Catastrophy;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import static io.github.noelxtc.battleroyale.util.PortalUtil.createNetherPortal;

/**
 * @author Noel Tony
 * @since 27/12/24
 */
public class NetherInvasion implements Catastrophy {
	@Override
	public double getDelay() {
		return 0;
	}

	@Override
	public void warnPlayers() {
		Bukkit.getServer().broadcastMessage("The Nether is invading!");
	}

	@Override
	public void initiateCatastrophy(World world) {
		Location portalStart = world.getSpawnLocation();
		portalStart.setX(portalStart.getX() + 10);
		createNetherPortal(portalStart);
	}
}
