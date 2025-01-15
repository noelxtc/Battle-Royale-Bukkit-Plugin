package io.noelxtc.battleroyale.catastrophy;

import org.bukkit.World;

/**
 * @author Noel Tony
 * @since 27/12/24
 */
public interface Catastrophy {
	double getDelay();

	void warnPlayers();

	void initiateCatastrophy(World world);
}
